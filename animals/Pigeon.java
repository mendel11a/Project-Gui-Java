/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Pigeon.java implementation
*/
package animals;

import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;

/**
 * Pigeon class that describe a pigeon and his caracteristics
 * @Param family that describe the family he belongs to
 */
public class Pigeon extends AirAnimal {
	private String family;
	
	/**
	 * Ctor that get all the informations of the pigeon:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the span of his wings,the family he belongs to
	 */
	public Pigeon(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,double wing,String family) {
		super(location,totalDistance,name,gender,weight,speed,medals,wing);
		this.family=family;
		super.setAnimalSound("Arr-rar-rar-rar-raah");

	}
	/**
	 * Default Ctor
	 */
	public Pigeon() {
		this(new Point(0,0),0,"Pig",gender.Female,5,20,new Medal[1],2,"Fly Pigeon");
		Medal[] medals=new Medal[2];
		medals[0]=new Medal("Rome",2010,type.bronze);
		medals[1]=new Medal("Jerusalem",2017,type.gold);
		super.setMedals(medals);
		super.setAnimalSound("Arr-rar-rar-rar-raah");

	}
	/**
	 * To string function
	 */
	public String toString() {
		return "Pigeon's informations:" +"\n"+ super.toString()+"Family:" + family +"\n";
	}

}
