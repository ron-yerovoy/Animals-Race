/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */

package animals;
import mobility.*;

/**
 * The Dog class represents a dog, characterized by its breed.
 * This class extends the TerrestrialAnimals class.
 */
public class Dog extends TerrestrialAnimals{
    private String breed = null;
/**
     * Constructs a Dog object with the specified position, name, gender, weight, number of legs, and breed.
     */    
    public Dog(Point position,String name,Gender gender,double weight,int noLegs,String breed) {
        super(position,name,gender,weight,noLegs);
        this.breed = breed;
    }
/**
     * Returns the sound made by the dog.
     */
    public String AnimalSound(){
        return "Woof Woof";
    }
/**
     * Returns a string representation of the Dog object.
     */
    @Override
    public String toString() {
        return super.toString()+"Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
 /**
     * Indicates whether some other object is "equal to" this one.
     */
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
