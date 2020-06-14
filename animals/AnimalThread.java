package animals;

import javax.swing.JOptionPane;

import tournament.Tournament;

public class AnimalThread implements Runnable {
	private Animal participant;
	private double neededDistance;
	private Boolean startFlag;
	private Boolean finishFlag;
	private static long Time=(long) (Math.random() * 1000);
	int choice_compet;
	private int[] temp_arr = {0, 2};
	
	
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
					if(Tournament.courier_arr.size()<5) {//waiting for 5 animals
						try {
							wait();
						}
						catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
					}
					notifyAll();//we get the 5 animals
					while (true) {
						Tournament.courier_arr.get(temp_arr[0]).eat(5);
						Tournament.courier_arr.get(temp_arr[1]).eat(5);
	                    try {
	                        Thread.sleep(Time);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }

	                    if (temp_arr[0] != 2) {
	                        if (Tournament.courier_arr.get(temp_arr[0]).getLocation().getX() >= Tournament.courier_arr.get(temp_arr[0] + 1).getLocation().getX() - 65) {
	                            ++temp_arr[0];
	                        }
	                    }

	                    if (temp_arr[1] <= 4) {
	                        if (Tournament.courier_arr.get(temp_arr[1]).getLocation().getX() >= Tournament.courier_arr.get(temp_arr[1] + 1).getLocation().getX() - 65) {
	                            ++temp_arr[1];
	                        } else if (temp_arr[1] == 5) {
	                            ++temp_arr[1];
	                        }
	                    }

	                    if (Tournament.courier_arr.get(temp_arr[0]).getLocation().getX() >= Tournament.courier_arr.get(temp_arr[0]).getDistance()) {
	                        JOptionPane.showMessageDialog(null, "Winners: Squad 1",
	                                "Message", JOptionPane.INFORMATION_MESSAGE);
	                        System.exit(0);
	                    }

	                    if (Tournament.courier_arr.get(temp_arr[1]).getLocation().getX() >= Tournament.courier_arr.get(temp_arr[1]).getDistance()) {
	                        JOptionPane.showMessageDialog(null, "Winners: Squad 2",
	                                "Message", JOptionPane.INFORMATION_MESSAGE);
	                        System.exit(0);
	                    }
	                }
					
				}
				
			}
			
			
		}
		
		else if(choice_compet==1) {//for regular competition
			
			
			
			
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
