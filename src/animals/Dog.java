package animals;
import mobility.*;

public class Dog extends TerrestrialAnimals{
    private String breed = null;
    
    public Dog(Point position,String name,Gender gender,double weight,int noLegs,String breed) {
        super(position,name,gender,weight,noLegs);
        this.breed = breed;
    }

    public String AnimalSound(){
        return "Woof Woof";
    }

    @Override
    public String toString() {
        return super.toString()+"Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Dog))
            return false;
        Dog dog = (Dog)other;
        return super.equals(dog) && breed.equals(dog.breed);
    }
}
