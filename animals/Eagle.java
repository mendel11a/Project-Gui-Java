/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Eagle.java implementation
*/
package animals;

import Olympics.Medal;
import Olympics.Medal.type;
import mobility.Point;

/**
 * Eagle class that describe an eagle and his caracteristics
 * @Param altitudeFlight that describe his altitude
 * @Param MAX_ALTITUDE describe the max altitude he can fly
 */
public class Eagle extends AirAnimal {
	private double altitudeOfFlight;
	static final int MAX_ALTITUDE=1000;
	
	/**
	 * Ctor that get all the informations of the eagle:
	 * His location,the distance he went,his name,his gender,his weight,his speed,the medals he won,the span of his wings,the altitude he flies
	 */
	public Eagle(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals,double wing,double altitude) {
		super(location,totalDistance,name,gender,weight,speed,medals,wing);
		setAltitude(altitude);
		super.setAnimalSound("Clack-wack-chack");

	}
	/**
	 * Default Ctor
	 */
	public Eagle() {
		this(new Point(0,0),300,"Sight",gender.Hermaphrodite,10,120,new Medal[1],2,150);
		Medal[] medals=new Medal[2];
		medals[0]=new Medal("Beer Sheva",2015,type.bronze);
		medals[1]=new Medal("Holon",2017,type.gold);
		super.setMedals(medals);
		super.setAnimalSound("Clack-wack-chack");


	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Eagle's informations:" +"\n"+ super.toString()+"Altitude Of Flight:" + altitudeOfFlight +"\n";
	}
	/**
	 * Setter altitude
	 */
	protected boolean setAltitude(double altitude) {
		if(altitude<MAX_ALTITUDE) {
			this.altitudeOfFlight=altitude;
			return true;
		}
		else{
			this.altitudeOfFlight=1000;
			System.out.println("The Altitude you choose is bigger than the Max Altitude so it will be set to the maximum altitude!");
			return false;
		}
	}

}
