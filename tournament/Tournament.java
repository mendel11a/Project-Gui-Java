/**
 * Simon Mendel Amar
 * 337790786
 */
package tournament;

import java.util.Vector;

import animals.Animal;
/**
 * Tournament class that describe a Tournament
 */
public abstract class Tournament {
	protected TournamentThread tournament;
	public static Boolean stop = false;
    public static Thread thread = new Thread();
	public static Vector<Animal> courier_arr = new Vector<>();
	/**
	 * Tournament Ctor
	 * @param arr
	 */
	 public Tournament(Animal[][] arr)
	 {
	     this.tournament = new TournamentThread();
	     setup(arr);
	 }
		/**
		 * Tournament  default Ctor
		*/
	public Tournament() 
	{
		this.tournament=new TournamentThread();
		setup(new Animal[this.tournament.getGroups()][]);
	}

	protected abstract void setup(Animal[][] animal_arr);
	/**
	 * StopThreads method that stops the current thread
	*/
	public static void StopThreads()
    {
        stop = true;
    }
	
	
}
