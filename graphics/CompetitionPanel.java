package graphics;

import animals.Animal;
import tournament.CourierTournament;
import tournament.RegularTournament;
import tournament.Tournament;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
/**
 * Class that describes a competition and all his functions
 * @author Mendel Amar id:337790786
 */
public class CompetitionPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private BufferedImage img = null;
    private JPanel buttonPanel;
    private int compet_choice = -1;
    private int tournament_choice = -1;
    private Vector<Animal> vec= new Vector<>();
    private RegularTournament regular; //An object that is responsible for regular tournament
    private CourierTournament courier; //An object that is responsible for courier tournament
    private Animal[][] animal_arr;// the animals of each competition
    private static int current_num_animals=8;
    private static int num_of_team=1;
    private int competiton_choosed=0;
    
    /**
     * Competition default Ctor
     */
    public CompetitionPanel()
    {
        super(new BorderLayout());

        try
        {
            img = ImageIO.read(new File(IDrawable.PICTURE_PATH + "competitionBackground.png"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(new JDialog(), "Cannot open background file");
            System.exit(1);
        }

        this.buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout());

        JButton competition_button = new JButton("Competition");
        JButton add_animal_button = new JButton("Add Animal");
        JButton clear_button = new JButton("Clear");
        JButton eat_button = new JButton("Eat");
        JButton info_button = new JButton("Info");
        JButton exit = new JButton("Exit");

        competition_button.addActionListener(this);
        add_animal_button.addActionListener(this);
        clear_button.addActionListener(this);
        eat_button.addActionListener(this);
        info_button.addActionListener(this);
        exit.addActionListener(this);

        add(this.buttonPanel, BorderLayout.SOUTH);
        buttonPanel.add(competition_button);
        buttonPanel.add(add_animal_button);
        buttonPanel.add(clear_button);
        buttonPanel.add(eat_button);
        buttonPanel.add(info_button);
        buttonPanel.add(exit);
    }
    /**
     * method that covers the panel with selected draws and pictures and use the method "drawObject" in Animal class
     * @param g
     */

    public void paintComponent(Graphics g)
    {
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        if(!vec.isEmpty()) {
        	for(Animal animal: vec) {
        		animal.drawObject(g);// printing all the animals i added on the competition panel
        	}
        }
        repaint();
    }
    /**
     * Method that feed all the animals in the same time
     * @param a : the Amount of food we give the animals
     */
    public void eatAllAnimals(int a) {
    	for (Animal animal: vec) { 
    		animal.eat(a);
    	}
    }
    /**
     * GUI method to remember the choice of the user
     * @param obg
     * @param size
     * @param mas
     * @param title
     */
    public static int pop_up(Object[] obg,int size,String mas,String title){
        return JOptionPane.showOptionDialog(new JDialog(), mas,
                title,
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                obg,
                obg[size]);
    }
    
    public static void printMessage(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.PLAIN_MESSAGE);
    }
    /**
     * Choose button action
     *
     * @param e the event of the button
     */
    public void actionPerformed(ActionEvent e)
    {
        String choice = e.getActionCommand();

        if(choice.equals("Exit"))
        {
            System.exit(0);
        }

        if(choice.equals("Competition"))
        {
        	if(competiton_choosed==0) {
	        	Object[] Tour_options = {"Courier Tournament", "Regular Tournament"};
	            this.tournament_choice = pop_up(Tour_options, Tour_options.length - 1,"                   Choose a tournament", "Tournament");
        	}
        	this.competiton_choosed=1;
            if(tournament_choice==0) //courier tournament
            {	
            	this.courier=new CourierTournament(animal_arr);
            	int temp=current_num_animals-4;
            	if (temp<1) 
            	{
            		temp=current_num_animals;
            	}
            	if(current_num_animals==4)
                	++num_of_team;
            	
                printMessage("  You have to choose "+ current_num_animals +" animals so the tournament can start"+"\n"+"  You need to complete "+ temp +" animals of Team "
            	+num_of_team, "Information");
                
            }
            if(tournament_choice==1)// regular tournament
            {
            	this.regular=new RegularTournament(animal_arr);
            }
            
            Object[] options = {"Air", "Water", "Terrestrial"};
            this.compet_choice = pop_up(options,options.length-1,"                   Choose a competition:", "CompetitionDialog");
        }

        if(choice.equals("Add Animal"))
        {
            try {
                AddAnimalDialog animal = new AddAnimalDialog(vec, this.compet_choice);
                
                if(tournament_choice==0) {// courier tournament
                	if (vec.size()<8) {
                		animal.choose_animal();
                        --current_num_animals;
                		this.courier.starter(vec.lastElement(), vec.size()-1);
                	}
                	if (vec.size()==8){
                		JOptionPane.showMessageDialog(null, "You have already choose 8 animals",
                                "Message", JOptionPane.INFORMATION_MESSAGE);
                	}
                }
                if(tournament_choice==1) {//regular tournament
                	animal.choose_animal();
            		this.regular.starter(vec.lastElement(), vec.size()-1);
                }
                repaint();
                System.out.println(vec.toString());
            }
            catch (Exception x){
                JOptionPane.showMessageDialog(new JDialog(), "The type of animal should match the type of animal selected in the competition",
                    "Error",JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
        if(choice.equals("Clear"))
        {
            vec.clear();
        	Tournament.StopThreads();

        }

        if(choice.equals("Eat"))
        {
            Object[] options = {"1","2", "5", "10"};
            int add_energy = pop_up(options, options.length-1,"     Choose amount of energy you want to add", "Feed Animal");

            if(add_energy == 0)
            {
            	eatAllAnimals(1);
                repaint();
            }
            else if(add_energy == 1)
            {
            	eatAllAnimals(2);
                repaint();
            }
            else if(add_energy == 2)
            {
            	eatAllAnimals(5);
                repaint();
            }
            else if(add_energy == 3)
            {
            	eatAllAnimals(10);
                repaint();
            }
        }
        else if (choice.equals("Info")) {
            JFrame table_frame = new JFrame("Info");
            String[] columnNames = {"Animal", "Category", "Type", "Speed", "Energy Amount", "Distance", "Energy Consumption"};
            Animal animal;

            String[][] data = new String[this.vec.size()][columnNames.length];
            for (int i = 0; i < this.vec.size(); i++)
            {
                animal = vec.get(i);
                if (animal != null)
                {
                    data[i][0] = animal.getName();
                    System.out.println(animal.getClass().getSimpleName());
                    data[i][1] = animal.getClass().getSuperclass().toString().substring(14);
                    String parseClass =  animal.getClass().getName();
                    System.out.println(parseClass);
                    if(parseClass.contains("$"))
                    	parseClass = parseClass.substring(8,parseClass.indexOf('$')); 
                    else parseClass = parseClass.substring(8,parseClass.length());
                    data[i][2] = parseClass;
                    data[i][3] = String.valueOf(animal.getSpeed());
                    data[i][4] = String.valueOf(animal.getCurrentEnergy());
                    data[i][5] = String.valueOf(animal.getDistance());
                    data[i][6] = String.valueOf(animal.getCurrentEnergy());
                }
            }

            final JTable jt=new JTable(data,columnNames);
            jt.setCellSelectionEnabled(true);
            ListSelectionModel select= jt.getSelectionModel();
            select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JScrollPane sp=new JScrollPane(jt);
            table_frame.add(sp);
            table_frame.setSize(3000, 88 + vec.size()*45);
            table_frame.setVisible(true);
            jt.setEnabled(false);
            repaint();
        }
    }
}