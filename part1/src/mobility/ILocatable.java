/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */

package mobility;

public interface ILocatable {
    /**
     * Gets the current location of the object.
     */
    public Point getLocation();
    /**
     * Sets the location of the object to the specified point.
     */
    public boolean setLocation(Point location);

}
