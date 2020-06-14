package animals;

public class AnimalThread implements Runnable {
	private Animal participant;
	private double neededDistance;
	private Boolean startFlag;
	private Boolean finishFlag;
	private static int Time=700;
	private Boolean start_courier;
	private Boolean start_regular;
	
	
	public AnimalThread() {
		this.finishFlag=false;
		this.startFlag=false;
		this.neededDistance=0;
	}
	
	public AnimalThread(Boolean start,Boolean finish,Animal participant) {
		this.finishFlag=start;
		this.startFlag=finish;
		this.participant=participant;
	}
	
	
	@Override
	public void run() {
		while (startFlag) {
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
