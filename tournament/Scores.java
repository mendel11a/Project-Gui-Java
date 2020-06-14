package tournament;

import java.util.Date;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Scores {
	private Map<String,Date> scores;
	
	public Scores() {
		this.scores=Collections.synchronizedMap(new HashMap<String, Date>());
	}
	
	public void add(String name) {
		Date date=new Date();
		this.scores.put(name,date);
	}
	public Map<String,Date> getAll(){
		return this.scores;
	}
}
