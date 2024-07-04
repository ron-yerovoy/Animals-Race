package mobility;


public abstract class Mobile implements ILocatable {
    private Point location = new Point();
    private double totalDistance = 0;
    

    public Mobile(Point locaPoint) {
        this.location = new Point(locaPoint.Getx(),locaPoint.Gety());
    }

    public void addTotalDistance(double distance){
        totalDistance += distance;
    }

    public double calcDistance(Point p){
        double DeltaX = location.Getx()-p.Getx();
        double DeltaY = location.Gety()-p.Gety();
        double distance = (double) Math.sqrt(Math.pow(DeltaX,2)+Math.pow(DeltaY,2));
        return distance;
    } 

    public double move(Point p){
        double distance = calcDistance(p);
        if(distance == 0){
            return 0;
        }
        addTotalDistance(distance);
        setLocation(p);
        return distance;
    } 

    @Override
    public Point getLocation() {
        return this.location;
    }
    @Override
    public boolean setLocation(Point location){
        if (location != null){
            this.location.Setx(location.Getx());
            this.location.Sety(location.Gety());
            return true;
        }
        return false;   
    }
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Mobile))
            return false;
        Mobile mobile = (Mobile)other;
        return location.equals(mobile.location) && totalDistance == mobile.totalDistance;
    }
    @Override
    public String toString() {
        return "Mobile{" +
                "location=" + location +
                ", totalDistance=" + totalDistance +
                '}';
    }

}
