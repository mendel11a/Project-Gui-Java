/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* ILocatable.java implementation
*/
package mobility;
/**
 * Interface that describes the usability of the mobility with two functions:
 * getLocation that returns the current location of the animal
 * setLocation that set a location to the animal
 */
public interface ILocatable {
	public Point getLocation();
	public boolean setLocation(Point p);
}
