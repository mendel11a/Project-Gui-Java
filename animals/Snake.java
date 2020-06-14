/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Snake.java implementation
*/
package animals;
import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;

/**
 * Snake class that describe a snake and his caracteristics
 * @Param Poisonous describe if the snake is poisonous or not
 * @Param Length describes the length of the snake
 * @param poisonlevel
 */
public class Snake extends TerrestrialAnimal implements IReptile {
	public enum Poisonous{
		Poisonous,
		NotPoisonous
	}
	public enum PoisonLevel{
		Low,
		Medium,
		High
	}
	private Poisonous poison;
	private PoisonLevel poisonLevel;
	private double length;
	

	/**
	 * Ctor that get all the informations of the snake:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the number of legs he has,if he is poisonous or not,his length,the level of his poison
	 */
	public Snake(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,int legs,Poisonous poison,double length,PoisonLevel level) {
		super(location,totalDistance,name,gender,weight,speed,medals,legs);
		this.poison=poison;
		this.length=length;
		this.poisonLevel=level;
		super.setAnimalSound("ssssssss");
	}
	/**
	 * Ctor that get all the informations of the snake:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the number of legs he has,if he is poisonous or not,his length,the level of his poison
	 */
	public Snake(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,int legs,Poisonous poison,double length) {
		super(location,totalDistance,name,gender,weight,speed,medals,legs);
		this.poison=poison;
		this.length=length;
		super.setAnimalSound("ssssssss");
	}
	/**
	 * Default Ctor
	 */
	public Snake() {
		this(new Point(0,0),10,"Karl",gender.Hermaphrodite,50,2,new Medal[1],0,Poisonous.NotPoisonous,50,PoisonLevel.Medium);
		Medal[] medals=new Medal[1];
		medals[0]=new Medal("Montreal",2016,type.bronze);
		super.setMedals(medals);

	}
	/**
	 * To string function
	 */
	public String toString() {
		return "Snake's informations:" +"\n"+ super.toString()+"Poisonous:" + poison+"\n"+"Length:"+length +"\n"+poisonLevel +"\n";
	}
	/**
	 * speed up function
	 */
	@Override
	public boolean speedUp(int speed) {
		super.setSpeed(super.getSpeed()+speed);
		return true;
	}

	 

}
