/**
 * Simon Mendel Amar
 * 337790786
 */
package tournament;

import java.util.Date;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/**
 * Scores class that modify the scores of the animals
 */
public class Scores {
	private Map<String,Date> scores;
	/**
	 * Scores default Ctor
	 */
	public Scores() {
		this.scores=Collections.synchronizedMap(new HashMap<String, Date>());
	}
	/**
	 * add function that add scores to the relevant animal
	 * @param name
	 */
	public void add(String name) {
		Date date=new Date();
		this.scores.put(name,date);
	}
	/**
	 * getAll function that return the scores of the animals
	 */
	public Map<String,Date> getAll(){
		return this.scores;
	}
}
