/**
 * Simon Mendel Amar
 * 337790786
 */
package tournament;
/**
 * Referee class
 */
public class Referee implements Runnable {
	private String name;
	private Scores scores;
	private Boolean is_arrived;
	/**
	 * Referee Ctor
	 * @param name,scores,arrived
	 */
	public Referee(String name,Scores scores,Boolean arrived) {
		this.name=name;
		this.scores=scores;
		this.is_arrived=arrived;
	}
	/**
	 * Run function
	 */
	@Override
	public void run() {
		synchronized (this.is_arrived) {
			while(!is_arrived) {
				try {
					wait();
				}
				catch (InterruptedException e) {
					 e.printStackTrace();
				}
			}
			 this.scores.add(this.name);
			 this.is_arrived=false;
			 notify();
		}	
	}

}
