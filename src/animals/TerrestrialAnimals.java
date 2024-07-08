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
 * The TerrestrialAnimals class represents an animal that lives on land, characterized by the number of legs.
 * This is an abstract class that extends the Animal class.
 */
public abstract class TerrestrialAnimals extends Animal{

    private int noLegs = 0;
    
/**
     * Constructs a TerrestrialAnimals object with the specified position, name, gender, weight, and number of legs.
     */     
    public TerrestrialAnimals(Point position,String name,Gender gender,double weight,int noLegs) {
        super(position=new Point(0,20),name, gender, weight);
        this.noLegs = noLegs;
    }
/**
     * Returns a string representation of the TerrestrialAnimals object.
     */ 
    @Override
    public String toString() {
        return super.toString()+"TerrestrialAnimals{" +
                "noLegs=" + noLegs +
                '}';
    }
/**
     * Indicates whether some other object is "equal to" this one.
     */
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof TerrestrialAnimals))
            return false;
        TerrestrialAnimals terrestrialAnimals = (TerrestrialAnimals)other;
        return super.equals(terrestrialAnimals) && noLegs == terrestrialAnimals.noLegs;
    }
 /**
     * Returns the sound made by the terrestrial animal.
     */
    public abstract String AnimalSound();

}
