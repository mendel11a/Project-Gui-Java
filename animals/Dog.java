/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Dog.java implementation
*/
package animals;
import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;

/**
 * Dog class that describe a dog and his caracteristics
 * @Param breed describe the breed of the dog
 */
public class Dog extends TerrestrialAnimal {
	private String breed;
	
	/**
	 * Ctor that get all the informations of the dog:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the number of legs he has,his breed
	 */
	public Dog(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,int legs,String breed) {
		super(location,totalDistance,name,gender,weight,speed,medals,legs);
		this.breed=breed;
		super.setAnimalSound("Woof Woof");
	}
	/**
	 * Default Ctor
	 */
	public Dog() {
		this(new Point(0,0),0,"Leo",gender.Male,20,40,new Medal[1],4,"\r\n" + 
				"German shepherd");
		Medal[] medals=new Medal[2];
		medals[0]=new Medal("Tlv",2010,type.bronze);
		medals[1]=new Medal("Jaffa",2017,type.silver);
		super.setMedals(medals);
		
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Dog's informations:" +"\n"+ super.toString()+"Breed:" + breed+"\n" ;
	}

}
