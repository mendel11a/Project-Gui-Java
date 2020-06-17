package animals;

import javax.swing.JOptionPane;

import mobility.Point;
import tournament.Tournament;

public class AnimalThread implements Runnable {
	private Animal participant;
	private double neededDistance;
	private Boolean startFlag;
	private Boolean finishFlag;
	private static long Time=500;
	private static long Time2=300;
	int choice_compet;
	private Boolean start=true;
	private Boolean winner=false;
    int counter=0;

	
	public AnimalThread() {
		this.finishFlag=false;
		this.startFlag=false;
		this.neededDistance=0;
	}
	
	public AnimalThread(Boolean start,Boolean finish,Animal participant,int choice) {
		this.finishFlag=start;
		this.startFlag=finish;
		this.participant=participant;
		this.choice_compet=choice;
	}
	
	
	@Override
	public void run() {
		if(choice_compet==0) {//for courier competition
			if(!Tournament.stop) {//we didn't stop the thread
				synchronized (this) {
					if(Tournament.courier_arr.size()<8) {//waiting for 8 animals
						try {
							wait();
						}
						catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
					}
					notifyAll();//we get the 8 animals
					
					int winningTeam = -1;
					
					while(true) {
					for(int i = 0; i < Tournament.courier_arr.size(); i++) {
						try {
	                        Thread.sleep(Time2);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
						Tournament.courier_arr.get(i).eat(10); 
						
						if(Tournament.courier_arr.get(i).getLocation().getX() >= Tournament.courier_arr.get(i).getMaxDistance()) {
							if(i % 4 == 0) winningTeam = 1;
							else
								winningTeam = 2;
							JOptionPane.showMessageDialog(null, "The Winner Team Is "  + winningTeam,
		                                "Message", JOptionPane.INFORMATION_MESSAGE);
		                        System.exit(0);
						}
					}
					}
					
				}
				
			}
			
			
		}
		
		else if(choice_compet==1) {//for regular competition		
	            synchronized (this) {
	                synchronized(start){
	                    if (start){
	                        try {
	                        	JOptionPane.showMessageDialog(null, "The competition will start in 5 seconds from now.\n",
		                                "Message", JOptionPane.PLAIN_MESSAGE);
	                            Thread.sleep(5000);
	                        } catch (InterruptedException e) {
	                            e.printStackTrace();
	                        }
	                        start = false;
	                    }
	                }
	                while (!winner) {
	                    try {
	                        Thread.sleep(Time);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                    if(winner)
	                    {
	                        break;
	                    }
	                    this.participant.eat(10); // The animal moves
	                   if (this.participant.getLocation().getX() >= this.participant.getMaxDistance()) {
                            if (winner) {
                                break;
                            } 
                            this.participant.setLocation(new Point((int)(this.participant.getMaxDistance()),this.participant.getLocation().getY()));
                            winner = true;
                            JOptionPane.showMessageDialog(null, "The Winner is: " + this.participant.getName(),
                                    "Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
	                }
	              }
	         }
		}

	
	
	
    public void setAnimal(Animal a){
        this.participant = a;
    }

    public Animal getAnimal(){
        return this.participant;
    }

    public void set_max_dic(double dist){
        this.participant.setDistance(dist);
    }

    public double get_max_dic(){
        return this.participant.getDistance();
    }
}
