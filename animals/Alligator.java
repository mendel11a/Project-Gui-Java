/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Alligator.java implementation
*/
package animals;

import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;

/**
 * Alligator class that describe an alligator and his caracteristics
 * @Param areaOfLiving describe the area he lives in
 * @param terrestrial
 */
public class Alligator extends WaterAnimal implements IReptile{
	private TerrestrialAnimal terrestrial;
	private String AreaOfLiving;
	
	/**
	 * Ctor that get all the informations of the alligator:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,his dive depth,the area he lives in
	 */
	public Alligator(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,double diveDept,String area) {
		super(location,totalDistance,name,gender,weight,speed,medals,diveDept);
		this.AreaOfLiving=area;
		super.setAnimalSound("Roar");
		this.terrestrial=new TerrestrialAnimal(location,totalDistance,name,gender,weight,speed,medals,0) {};
	}
	/**
	 * Default Ctor
	 */
	public Alligator() {
		
		this(new Point(60,55),30,"Lacoste",gender.Male,300,80,new Medal[1],-400,"Laguna");
		Medal[] medals=new Medal[2];
		medals[0]=new Medal("Tlv",2019,type.gold);
		medals[1]=new Medal("Rishon",2015,type.silver);
		super.setMedals(medals);
		this.terrestrial=new TerrestrialAnimal(new Point(60,55),30,"Lacoste",gender.Male,300,80,new Medal[1],0) {};

	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Alligator's informations:" +"\n"+ super.toString()+"Area Of Living:" + AreaOfLiving ;
	}
	/**
	 * speed up function
	 */
	@Override
	public boolean speedUp(int speed) {
		super.setSpeed(super.getSpeed()+speed);
		return true;
	}
	/**
	 * function that make possible to cast alligator from water animal to terrestrial animal
	 */
	public TerrestrialAnimal temp() {
		return terrestrial;
	}

}
