package animals;
import mobility.*;

public class Cat extends TerrestrialAnimals{ 
    private boolean Castrated = false;

    public Cat(Point position,String name,Gender gender,double weight,int noLegs,boolean Castrated) {
        super(position,name,gender,weight,noLegs);
        this.Castrated = Castrated;
    }

    public String AnimalSound(){
        return "Meow";
    }
    @Override
    public String toString() {
        return super.toString()+"Cat{" +
                "Castrated=" + Castrated +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Cat))
            return false;
        Cat cat = (Cat)other;
        return super.equals(cat) && Castrated == cat.Castrated;
    }

}
