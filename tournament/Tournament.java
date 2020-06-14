package tournament;

import java.util.Vector;

import animals.Animal;

public abstract class Tournament {
	protected TournamentThread tournament;
	public static Boolean stop = false;
    public static Thread thread = new Thread();
	public static Vector<Animal> courier_arr = new Vector<>();

	 public Tournament(Animal[][] arr)
	 {
	     this.tournament = new TournamentThread();
	     setup(arr);
	 }
	
	public Tournament() 
	{
		this.tournament=new TournamentThread();
		setup(new Animal[this.tournament.getGroups()][]);
	}

	protected abstract void setup(Animal[][] animal_arr);

	public static void StopThreads()
    {
        stop = true;
    }
	
	
}
