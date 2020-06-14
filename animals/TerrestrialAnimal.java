/**
 * Simon Mendel Amar
 * 337790786
 */
/**
* TerrestrialAnimal.java implementation
*/
package animals;

import Olympics.Medal;
import mobility.Point;

/**
 * Terrestrial Animal class that describe an animal that live on ground and his caracteristics
 * @Param noLegs describe the number of legs of the animal
 */
public abstract class TerrestrialAnimal extends Animal {
	private int noLegs;
	
	/**
	 * Ctor that get all the informations of the animal:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the number of legs he has
	 */
	public TerrestrialAnimal(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,int legs) {
		super(location,totalDistance,name,gender,weight,speed,medals);
		this.noLegs=legs;
	}
	/**
	 * Default Ctor
	 */
	public TerrestrialAnimal() {
		this(new Point(0,20),0,"None",gender.Male,0,0,new Medal[1],2);
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return super.toString()+"\n"+"Number of Legs:" + noLegs + "\n";
	}
	
}
