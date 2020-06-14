package tournament;

import animals.Animal;

public class CourierTournament extends Tournament {
	
	
	
	   public CourierTournament(Animal[][] setup_arr){
	        super(setup_arr);
	    }
	
	@Override
	protected void setup(Animal[][] animal_arr) {
		Boolean startFlag=false;
		Scores scores=new Scores();
		
		for(int i=0;i<animal_arr.length;++i) {
			Boolean newFlag = false;
            Referee newReferee = new Referee(String.valueOf(i+1),scores,newFlag);
		}
	}

}
