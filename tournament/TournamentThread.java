/**
 * Simon Mendel Amar
 * 337790786
 */
package tournament;
/**
 * TournamentThread class that describe a the thread of the tournament
 */
public class TournamentThread implements Runnable {
	private Scores scores;
	private Boolean startSignal;
	private int groups;
	
	/**
	 * getGroups method that return the different groups of animals
	*/
	public int getGroups() {
		return this.groups;
	}
	/**
	 * TournamentThread default Ctor
	*/
	public TournamentThread() {
		this.groups=2;
		this.scores=new Scores();
		this.startSignal=false;
	}
	/**
	 * run function
	 */
	
	@Override
	public void run() {
		synchronized (startSignal) {
			this.startSignal=true;
			notifyAll();
			
		}
		
	}

}
