/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Medal.java implementation
*/
package Olympics;
/**
 * This class is the implementation of the Medal class
 * @param type is the three possibilities of medals
 * @param tournament is the tournament where he won the medal
 * @param year is the year he won the medal
 * @author Mendel Amar
 *
 */
public class Medal {
	public enum type{
		bronze,
		silver,
		gold
	}
	private String tournament;
	private int year;
	private type color;
	/**
	 * Default Ctor
	 */
	public Medal() {
		this("Ashdod",2020,type.bronze);
	}
	/**
	 *Ctor with 3 parameters:
	 * @param medaltype is the type of medal he won
	 * @param tourn is the tournament where he won the medal
	 * @param year is the year he won the medal
	 */
	public Medal(String tour,int year,type medaltype) {
		this.tournament=tour;
		this.year=year;
		this.color=medaltype;
	}
	@Override
	/**
	 * To string function to medal class
	 */
	public String toString() {
		return this.color+ " medal won in "+this.year+" in the tournament of "+ this.tournament;
	}

}
