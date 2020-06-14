package tournament;

import animals.Animal;

public abstract class Tournament {
	protected TournamentThread tournament;
	
	   public Tournament(Animal[][] arr){
	        this.tournament = new TournamentThread();
	        setup(arr);
	    }
	
	public Tournament() {
		this.tournament=new TournamentThread();
		setup(new Animal[this.tournament.getGroups()][]);
	}

	protected abstract void setup(Animal[][] animal_arr);
	
	
}
