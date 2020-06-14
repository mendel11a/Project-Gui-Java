package tournament;

import animals.Animal;
import animals.AnimalThread;

public class CourierTournament extends Tournament {
	int choose_courier=0;
	public CourierTournament(Animal[][] setup_arr){
	        super(setup_arr);
	    }
	
	@Override
	protected void setup(Animal[][] animal_arr) {
		Boolean startFlag=false;
		Scores scores=new Scores();
		if(animal_arr !=null) {
			for(int i=0;i<animal_arr.length;++i) {
				Boolean finishFlag = false;
	            Thread thread = new Thread(new AnimalThread(startFlag, finishFlag, animal_arr[i][0],choose_courier));
	            Referee newReferee = new Referee(String.valueOf(i+1),scores,finishFlag);
			}
		}
		
	}
	
	 public void starter(Animal new_animal, int i)
	    {
	        Animal[][] temp = new Animal[1][i+1];
	        temp[0][i] = new_animal;
	        thread = new Thread(new AnimalThread(false, false, temp[0][i], choose_courier));
	        Tournament.courier_arr.add(temp[0][i]);
	        thread.start();
	    }

}
