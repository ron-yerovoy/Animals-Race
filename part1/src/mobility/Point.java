/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */
package mobility;
/**
 * The Point class represents a point in a 2D coordinate system
 * with integer x and y coordinates.
 */
public class Point {
    private int x;
    private int y;
/**
     * Constructs a Point at the origin (0,0).
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }
/**
     * Constructs a Point with specified x and y coordinates.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
/**
     * Returns the x coordinate of the point.
     */
    public int Getx() {
        return x;
    }
     /**
     * Returns the y coordinate of the point.
     */
    public int Gety() {
        return y;
    }
    /**
     * Sets the x coordinate of the point.
     */ 
    public void Setx(int x) {
        this.x = x;
    }
     /**
     * Sets the y coordinate of the point.
     */ 
    public void Sety(int y) {
        this.y = y;
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     */ 
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point))
            return false;
        Point point = (Point)other;
        return x == point.x && y == point.y;
    }
    /**
     * Returns a string representation of the Point object.
     */ 
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
