package animals;
import mobility.*;

public abstract class TerrestrialAnimals extends Animal{

    private int noLegs = 0;
    


    public TerrestrialAnimals(Point position,String name,Gender gender,double weight,int noLegs) {
        super(position=new Point(0,20),name, gender, weight);
        this.noLegs = noLegs;
    }

    @Override
    public String toString() {
        return super.toString()+"TerrestrialAnimals{" +
                "noLegs=" + noLegs +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof TerrestrialAnimals))
            return false;
        TerrestrialAnimals terrestrialAnimals = (TerrestrialAnimals)other;
        return super.equals(terrestrialAnimals) && noLegs == terrestrialAnimals.noLegs;
    }

    public abstract String AnimalSound();

}
