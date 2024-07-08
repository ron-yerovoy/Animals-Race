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
 * The Cat class represents a cat, characterized by whether it is castrated.
 * This class extends the TerrestrialAnimals class.
 */ 
public class Cat extends TerrestrialAnimals{ 
    private boolean Castrated = false;

  /**
     * Constructs a Cat object with the specified position, name, gender, weight, number of legs, and castration status.
     */   
    public Cat(Point position,String name,Gender gender,double weight,int noLegs,boolean Castrated) {
        super(position,name,gender,weight,noLegs);
        this.Castrated = Castrated;
    }
/**
     * Returns the sound made by the cat.
     */
    public String AnimalSound(){
        return "Meow";
    }
 /**
     * Returns a string representation of the Cat object.
     */    
    @Override
    public String toString() {
        return super.toString()+"Cat{" +
                "Castrated=" + Castrated +
                '}';
    }
/**
     * Indicates whether some other object is "equal to" this one.
     */
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
