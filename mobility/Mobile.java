/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Mobile.java implementation
*/
package mobility;
import java.lang.Math;

/**
 * Mobile abstract class which define a movement of an object and implements ILocatable interface
 */
public abstract class Mobile implements ILocatable {
	private Point location;
	private double totalDistance;
	/**
	 * Method that set the current location of object
	 */
	@Override
	public boolean setLocation(Point p) {
		if(p.getX()>=0 && p.getY()>=0){
			location.setPoint(p.getX(), p.getY());
			return true;
		}
		else return false;
	}
	/**
	 * Method that returns the current location of the object
	 */
	@Override
	public Point getLocation() {
		return this.location;
	}
	/**
	 * Ctor that gets a point
	 */
	public Mobile(Point p,double d) {
		this.location=p;
		this.totalDistance=d;
	}
	/**
	 * Default Ctor
	 */
	public Mobile() {
		this(new Point(),0);
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Location:" + location +"\n"+ "TotalDistance:" + totalDistance + "\n";
	}
	/**
	 * Method that update the total distance
	 */
	public void addTotalDistance(double distance) {
		this.totalDistance+=distance;
	}
	/**
	 * Method that returns the distance between two points
	 */
	public double calcDistance(Point p) {
		return Math.sqrt(Math.pow(location.getX()-p.getX(),2)+Math.pow(location.getY()-p.getY(),2));
	}
	/**
	 * Method that make move an object to another point and return the distance that has be done
	 */
	public double move(Point p) {
		if(setLocation(p)==true) {
			addTotalDistance(calcDistance(p));
			return calcDistance(p);
		}
		else return 0;
	}
}
