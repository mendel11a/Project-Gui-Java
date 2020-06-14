/**
 * Simon Mendel Amar
 * 337790786
 */
/**
* AirAnimal.java implementation
*/
package animals;

import Olympics.Medal;
import mobility.Point;

/**
 * Air Animal class that describe an animal that live in the air and his caracteristics
 * @Param wingspan describe the span of the wings of the animal
 */
public abstract class AirAnimal extends Animal {
	private double wingspan;
	
	/**
	 * Ctor that get all the informations of the alligator:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the span of his wings
	 */
	public AirAnimal(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,double wing) {
		super(location,totalDistance,name,gender,weight,speed,medals);
		this.wingspan=wing;
	}
	/**
	 * Default Ctor
	 */
	public AirAnimal() {
		this(new Point(0,100),0,"None",gender.Male,0,0,new Medal[1],0);
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return super.toString()+"\n"+"Wingspan:" + wingspan+"\n";
	}
	
}
