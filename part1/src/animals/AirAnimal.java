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
 * The AirAnimal class represents an animal that can fly, characterized by its wingspan.
 * This is an abstract class that extends the Animal class.
 */ 
public abstract class AirAnimal extends Animal{

    private double wingspan = 0;

 /**
     * Constructs an AirAnimal with the specified position, name, gender, weight, and wingspan.
     */ 
    public AirAnimal(Point position,String name,Gender gender,double weight,double wingspan) {

        super(position = new Point(0,100),name, gender, weight);
        this.wingspan = wingspan;

    }
 /**
     * Returns a string representation of the AirAnimal object.
     */ 
    @Override
    public String toString() {
        return super.toString()+"AirAnimal{" +
                "wingspan=" + wingspan +
                '}';
    }
 /**
     * Indicates whether some other object is "equal to" this one.
     */ 
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof AirAnimal))
            return false;
        AirAnimal airAnimal = (AirAnimal)other;
        return super.equals(airAnimal) && wingspan == airAnimal.wingspan;
    }
 /**
     * Returns the sound made by the air animal.
     */
    public abstract String AnimalSound();
}
