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
 * The Whale class represents a whale, characterized by its food type.
 * This class extends the WaterAnimal class.
 */
public class Whale extends WaterAnimal {

    private String foodType = "food";
/**
     * Constructs a Whale object with the specified position, name, gender, weight, and food type.
     */
    public Whale(Point position, String name, Gender gender, double weight,String foodType) {
        super(position, name, gender, weight);
        this.foodType = foodType;
    }
/**
     * Returns the sound made by the whale.
     */
    public String AnimalSound(){
        return "Splash";
    }
/**
     * Returns a string representation of the Whale object.
     */ 
    @Override
    public String toString(){
        return super.toString()+"Whale{" +
                "foodType='" + foodType + '\'' +
                '}';
    }
/**
     * Indicates whether some other object is "equal to" this one.
     */ 
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Whale))
            return false;
        Whale whale = (Whale)other;
        return super.equals(whale) && foodType.equals(whale.foodType);
    }

}
