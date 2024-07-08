/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */

 
package mobility;
/**
 * The Mobile class represents a mobile entity that can move from one point to another,
 * keeping track of its location and the total distance it has traveled.
 * This is an abstract class that implements the ILocatable interface.
 */
public abstract class Mobile implements ILocatable {
    private Point location = new Point();
    private double totalDistance = 0;
    
/**
     * Constructs a Mobile object with a specified initial location.
     * 
     *  param locPoint the initial location of the mobile object
     */
    public Mobile(Point locaPoint) {
        this.location = new Point(locaPoint.Getx(),locaPoint.Gety());
    }
/**
     * Adds a specified distance to the total distance traveled by this mobile object.
     */
    public void addTotalDistance(double distance){
        totalDistance += distance;
    }
     /**
     * Calculates the distance between the current location and a specified point.
     */
    public double calcDistance(Point p){
        double DeltaX = location.Getx()-p.Getx();
        double DeltaY = location.Gety()-p.Gety();
        double distance = (double) Math.sqrt(Math.pow(DeltaX,2)+Math.pow(DeltaY,2));
        return distance;
    } 
/**
     * Moves the mobile object to a specified point and updates the total distance traveled.
     */
    public double move(Point p){
        double distance = calcDistance(p);
        if(distance == 0){
            return 0;
        }
        addTotalDistance(distance);
        setLocation(p);
        return distance;
    } 
    /**
     * Gets the current location of this mobile object.
     */
    @Override
    public Point getLocation() {
        return this.location;
    }
    /**
     * Sets the location of this mobile object to a specified point.
     */
    @Override
    public boolean setLocation(Point location){
        if (location != null){
            this.location.Setx(location.Getx());
            this.location.Sety(location.Gety());
            return true;
        }
        return false;   
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     */ 
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Mobile))
            return false;
        Mobile mobile = (Mobile)other;
        return location.equals(mobile.location) && totalDistance == mobile.totalDistance;
    }
    /**
     * Returns a string representation of the Mobile object.
     */
    @Override
    public String toString() {
        return "Mobile{" +
                "location=" + location +
                ", totalDistance=" + totalDistance +
                '}';
    }

}
