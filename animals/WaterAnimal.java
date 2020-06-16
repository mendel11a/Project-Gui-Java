/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* WaterAnimal.java implementation
*/
package animals;

import Olympics.Medal;
import mobility.Point;
/**
 * Water Animal class that describe an animal that lives in water and his caracteristics
 * @Param MAX_DIVE describe his max dive depth
 * @Param diveDept describe his dive depth 
 */
public abstract class WaterAnimal extends Animal {
	static final int MAX_DIVE=-800;
	private double diveDept;
	/**
	 * Ctor that get all the informations of the alligator:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,his dive depth
	 */
	public WaterAnimal(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,double diveDept) {
		super(location,totalDistance,name,gender,weight,speed,medals);
		this.diveDept=diveDept;

		this.setMaxDistance(930);
	}
	/**
	 * Default Ctor
	 */
	public WaterAnimal() {
		this(new Point(50,0),0,"None",gender.Male,0,0,new Medal[1],0); 
		}
	/**
	 * Method that makes him dive deeper 
	 */
	public boolean Dive(double dive) {
		if (this.getDiveDept()+dive<MAX_DIVE) {
			this.diveDept+=dive;
			return true;
		}
		else {
			System.out.println("The animal can't go deeper because he attained the max dive depth");
			return false;
			}
	}
	/**
	 * dive depth getter
	 */
	public double getDiveDept() {
		return diveDept;
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return super.toString()+"\n"+"DiveDept:" + diveDept+"\n";
	}
}
