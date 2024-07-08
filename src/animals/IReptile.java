/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */

package animals;
/**
 * The IReptile interface represents a reptile and defines methods related to reptilian behavior.
 */
public interface IReptile {
    /**
     * The maximum speed that a reptile can achieve.
     */
    static final int MAX_SPEED = 5;
/**
     * Speeds up the reptile to the specified speed.
     */
    public boolean speedUp(int speed);

}
