/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* Point.java implementation
*/
package mobility;

/**
 * Class point that defines a point with two coordinators
 * @param X is the x coordinator of the point
 * @param Y is the y coordinator of the point
 */
public class Point implements Cloneable {
	private int X;
	private int Y;
	/**
	 * Ctor that gets two coordinators
	 */
	public Point(int x,int y) {
		setPoint(x,y);
	}
	/**
	 * Default Ctor
	 */
	public Point() {
		setPoint(0, 0);
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "("+X+","+Y+")";
	}
	/**
	 * Method that the coordinators of a point 
	 */
	protected boolean setPoint(int X,int Y) {
		if(X>=0 && Y>=0) {
			setX(X);
			setY(Y);
			return true;
		}
		else {
			System.out.println("Point coordinators can't be negative");
			return false;
		}
	}
	/**
	 * Method that returns the x coordinator of the point
	 */
	public int getX() {
		return this.X;
	}
	/**
	 * Method that returns the y coordinator of the point
	 */
	public int getY() {
		return this.Y;
	}
	/**
	 * Setter X
	 */
	protected boolean setX(int X) {
		if(X>=0) {
			this.X=X;
			return true;
		}
		else return false;
	}
	/**
	 * Setter X
	 */
	protected boolean setY(int Y) {
		if(Y>=0) {
			this.Y=Y;
			return true;
		}
		else return false;
	}
}
