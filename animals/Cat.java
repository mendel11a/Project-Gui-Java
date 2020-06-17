/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Cat.java implementation
*/
package animals;

import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;

/**
 * Cat class that describe a cat and his caracteristics
 * @Param castrated describe if the cat is castrated or not
 */
public class Cat extends TerrestrialAnimal {
	private boolean castrated;
	
	/**
	 * Ctor that get all the informations of the cat:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the number of legs he has,if he is castrated or not
	 */
	public Cat(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,int legs,boolean cast) {
		super(location,totalDistance,name,gender,weight,speed,medals,legs);
		this.castrated=cast;
		super.setAnimalSound("Meow");
	}
	/**
	 * Default Ctor
	 */
	public Cat() {
		this(new Point(0,0),10,"Minou",gender.Male,10,20,new Medal[1],4,false);
		Medal[] medals=new Medal[1];
		medals[0]=new Medal("Haifa",2017,type.silver);
		super.setMedals(medals);
		super.setAnimalSound("Meow");
		
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Cat's informations:" +"\n"+ super.toString()+"Castrated:" + castrated+"\n" ;
	}

}
