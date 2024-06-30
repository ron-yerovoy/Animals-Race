package animals;

import mobility.Point;

public abstract class WaterAnimal extends Animal{

    private static final int MAX_DIVE = -800;
    private double diveDept = 0;


    public WaterAnimal(Point position,String name,Gender gender,double weight,double speed,double diveDept) {
        Point Defultposition = new Point(50,0);
        super(Defultposition,name, gender, weight, speed);
        this.diveDept = diveDept;
    }

    public boolean Dive(double dive) {
        if (diveDept+dive> MAX_DIVE) //לבדוק מה הכוונה כאן
            return false;
        this.diveDept += dive;
        return true;

    }

    @Override
    public String toString() {
        return super.toString()+"WaterAnimal{" +
                "diveDept=" + diveDept +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
        return false;
        if (!(other instanceof WaterAnimal))
            return false;
        WaterAnimal waterAnimal = (WaterAnimal)other;
        return super.equals(waterAnimal) && diveDept == waterAnimal.diveDept;
    }

    public abstract String AnimalSound();///לבדוק אם השורה הזאת חוקית
}
