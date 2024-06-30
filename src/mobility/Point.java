package mobility;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int Getx() {
        return x;
    }
    public int Gety() {
        return y;
    }
    public void Setx(int x) {
        this.x = x;
    }
    
    public void Sety(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point))
            return false;
        Point point = (Point)other;
        return x == point.x && y == point.y;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
