/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Whale.java implementation
*/
package animals;

import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;


/**
 * Whale class that describe a whale and his caracteristics
 * @Param foodType is the food he eats
 */
public class Whale extends WaterAnimal {
	private String foodType;
	/**
	 * Ctor that get all the informations of the whale:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,his diveDept,the food he eats
	 */
	public Whale(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,double diveDept,String food) {
		super(location,totalDistance,name,gender,weight,speed,medals,diveDept);
		this.foodType=food;
		super.setAnimalSound("Splash");
	}
	/**
	 * Default Ctor
	 */
	public Whale() {
		this(new Point(60,55),20,"Bigga",gender.Male,800,40,new Medal[1],-400,"Fish");
		Medal[] medals=new Medal[2];
		medals[0]=new Medal("Miami",2018,type.silver);
		medals[1]=new Medal("Ashdod",2019,type.gold);
		super.setMedals(medals);
		super.setAnimalSound("Splash");
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Whale's informations:" +"\n"+ super.toString()+"Type Food:" + foodType+"\n" ;
	}

}
