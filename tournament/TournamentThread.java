package tournament;

public class TournamentThread implements Runnable {
	private Scores scores;
	private Boolean startSignal;
	private int groups;
	
	
	public int getGroups() {
		return this.groups;
	}
	
	public TournamentThread() {
		this.groups=2;
		this.scores=new Scores();
		this.startSignal=false;
	}
	@Override
	public void run() {
		synchronized (startSignal) {
			this.startSignal=true;
			notifyAll();
			
		}
		
	}

}
