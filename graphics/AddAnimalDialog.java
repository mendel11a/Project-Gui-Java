package graphics;

import animals.Animal;
import animals.*;
import mobility.Point;


import javax.swing.*;


import java.util.Vector;

import static graphics.CompetitionPanel.pop_up;
/**
 * Class that make possible to add animal to the game
 * @author Mendel Amar id:337790786
 */
public class AddAnimalDialog extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int choice;
    private static Vector<Animal> vector;
    private static int MAX_AIR=-1;
    private static int MAX_WATER=-1;
    private static int MAX_TERRESTRIAL=-1;

    /**
     * Ctor of AddAnimalDialog class
     * @param vector: all the animals in the game
     * @param choice: the choice of the competition
     */
    public AddAnimalDialog(Vector<Animal> vector, int choice){
        this.choice = choice;
        AddAnimalDialog.vector = vector;
    }
    /**
     * chooseAnimalType method that checks if the button we choose is the same competition 
     * and returns true if yes
     */
    boolean chooseAnimalType() throws Exception {
        if (choice == -1){
            JOptionPane.showMessageDialog(new JDialog(), "The type of animal should match the type of animal selected in the competition",
                    "Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        Object[] options = {"Air", "Water", "Terrestrial"};
        int competition_type = pop_up(options,options.length-1,"                   Choose a competition:", "Add Animal");
        if(competition_type == choice){
            return true;
        }
        throw new Exception();

    }
    /**
     * Choose animal function.
     *
     */
    public String choose_animal() throws Exception {
        int compet_choice = -1;
       
        if(chooseAnimalType()){//if true
            if(this.choice == 0){// air animal
                Object[] options = {"Eagle", "Pigeon"};
                compet_choice = pop_up(options,options.length-1,"                   Choose an air animal", "Add Animal");
                if(AddAnimalDialog.MAX_AIR<4)   {
                	AddAnimalDialog.MAX_AIR+=1;
                		if((compet_choice) == 0 ){//build eagle
		            		AddAnimalDialog.vector.add(new Eagle());
		            		AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(), vector.lastElement().getLocation().getY()+AddAnimalDialog.MAX_AIR*111));
		            		AddAnimalDialog.vector.lastElement().loadImages("eagle1.png");
		                }
	                else if(compet_choice == 1){//build pigeon
		                	AddAnimalDialog.vector.add(new Pigeon());
		                	AddAnimalDialog.vector.lastElement().loadImages("pigeon.png");
		                	AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(),vector.lastElement().getLocation().getY()+AddAnimalDialog.MAX_AIR*111));
	                	}
                		
                	}
                return "Air";
            }
            else if(this.choice == 1){// water animal
                Object[] options = {"Whale", "Alligator", "Dolphin"};
                compet_choice = pop_up(options,options.length-1,"                   Choose a water animal", "Add Animal");
                if(AddAnimalDialog.MAX_WATER<3)   {
                	AddAnimalDialog.MAX_WATER+=1;   
                		if(compet_choice == 0){//build whale
			                AddAnimalDialog.vector.add(new Whale()); 			                	
		                	AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(),vector.lastElement().getLocation().getY()+AddAnimalDialog.MAX_WATER*110));
		            		AddAnimalDialog.vector.lastElement().loadImages("whale2E.png");
	                	}
	                else if(compet_choice == 1){//build alligator
	                	AddAnimalDialog.vector.add(new Alligator());
	                	AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(),vector.lastElement().getLocation().getY()+AddAnimalDialog.MAX_WATER*110));
	                	AddAnimalDialog.vector.lastElement().loadImages("alligator2E.png");
	                	}
	                else if(compet_choice == 2){//build dolphin
	                	AddAnimalDialog.vector.add(new Dolphin());
	                	AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(),vector.lastElement().getLocation().getY()+AddAnimalDialog.MAX_WATER*110));
	                	AddAnimalDialog.vector.lastElement().loadImages("dolphin1E.png");
	                	}
	                }
               return "Water";
            }
            else if(this.choice == 2){// terrestrial animal
                Object[] options = {"Dog", "Cat", "Alligator", "Snake"};
                compet_choice = pop_up(options,options.length-1,"                   Choose a terrestrial animal", "Add Animal");
                if(AddAnimalDialog.MAX_TERRESTRIAL<3)   {
                	AddAnimalDialog.MAX_TERRESTRIAL+=1;   
                	if(compet_choice == 0){//build dog
                		AddAnimalDialog.vector.add(new Dog());
	                	AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(),vector.lastElement().getLocation().getY()));
                		AddAnimalDialog.vector.lastElement().loadImages("dog1E.png");
	                	}
	                else if(compet_choice == 1){//build cat
	                	AddAnimalDialog.vector.add(new Cat());
	                	AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(),vector.lastElement().getLocation().getY()));
	                	AddAnimalDialog.vector.lastElement().loadImages("cat1E.png");
	                }
	                else if(compet_choice == 2){//build alligator
	                	Alligator ali= new Alligator();
	                	AddAnimalDialog.vector.add(ali.temp());
	                	AddAnimalDialog.vector.lastElement().setLocation(new Point(0,0));
	                	AddAnimalDialog.vector.lastElement().loadImages("alligator2E.png");
	                }
	                else if(compet_choice == 3){//build snake
	                	AddAnimalDialog.vector.add(new Snake());
	                	AddAnimalDialog.vector.lastElement().setLocation(new Point(vector.lastElement().getLocation().getX(),vector.lastElement().getLocation().getY()));
	                	AddAnimalDialog.vector.lastElement().loadImages("snake1E.png");
	                }
                }
               return "Terrestrial";
            }
        }
        return null;
    }
}
