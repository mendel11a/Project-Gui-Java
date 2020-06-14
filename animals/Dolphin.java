/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Dolphin.java implementation
*/
package animals;
import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;

/**
 * Dolphin class that describe a dolphin and his caracteristics
 * @Param WaterType is the type of water he lives in
 */
public class Dolphin extends WaterAnimal {
	public enum WaterType{
		Sea,
		Sweet
	}
	private WaterType water;
	
	/**
	 * Ctor that get all the informations of the dolphin:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,his diveDept,the water he lives in
	 */
	public Dolphin(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,double diveDept,WaterType water) {
		super(location,totalDistance,name,gender,weight,speed,medals,diveDept);
		this.water=water;
		super.setAnimalSound("Click-click");
	}
	/**
	 * Default Ctor
	 */
	public Dolphin() {
		this(new Point(60,55),90,"Willy",gender.Female,300,150,new Medal[1],-400,WaterType.Sea);
		Medal[] medals=new Medal[3];
		medals[0]=new Medal("Eilat",2018,type.gold);
		medals[1]=new Medal("Los Angeles",2015,type.silver);
		medals[2]=new Medal("Rio",2015,type.bronze);
		super.setMedals(medals);
		super.setAnimalSound("Click-click");

	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Dolphin's informations:" +"\n"+ super.toString()+"Water Type:" + water +"\n";
	}

}
