package tournament;

import animals.Animal;
import animals.AnimalThread;

public class RegularTournament extends Tournament {

	public RegularTournament(Animal[][] setup_arr){
        super(setup_arr);
    }
	
	
	@Override
	protected void setup(Animal[][] animal_arr) {
		Boolean startFlag=false;
		Scores scores=new Scores();
		
		for(int i=0;i<animal_arr.length;++i) {
			Boolean finishFlag = false;
            Thread thread = new Thread(new AnimalThread(startFlag, finishFlag, animal_arr[i][0]));
            Referee newReferee = new Referee(String.valueOf(i+1),scores,finishFlag);
		}
	}

}
