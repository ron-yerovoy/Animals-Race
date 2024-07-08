package animals;
import mobility.*;

public abstract class AirAnimal extends Animal{

    private double wingspan = 0;


    public AirAnimal(Point position,String name,Gender gender,double weight,double wingspan) {

        super(position = new Point(0,100),name, gender, weight);
        this.wingspan = wingspan;

    }

    @Override
    public String toString() {
        return super.toString()+"AirAnimal{" +
                "wingspan=" + wingspan +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof AirAnimal))
            return false;
        AirAnimal airAnimal = (AirAnimal)other;
        return super.equals(airAnimal) && wingspan == airAnimal.wingspan;
    }

    public abstract String AnimalSound();
}
