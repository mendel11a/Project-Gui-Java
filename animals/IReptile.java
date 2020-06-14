/**
 * Simon Mendel Amar
 * 337790786
 */

/**
* IReptile.java implementation
*/
package animals;
/**
 * Interface that describes the usability of the IReptile with one function and one caracteristic:
 * @Function speedUp that make the reptile move faster
 * @Param MAX_SPEED the max speed of the reptile
 */
public interface IReptile {
	static final int MAX_SPEED =5;
	public boolean speedUp(int a);

}
