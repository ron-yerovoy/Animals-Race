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
 * The Dolphin class represents a dolphin, characterized by its water type.
 * This class extends the WaterAnimal class.
 */
public class Dolphin extends WaterAnimal {
    /**
     * An enumeration representing the type of water the dolphin inhabits.
     */
    public static enum WaterType {Sea, Sweet}
    private WaterType waterType=WaterType.Sea;

/**
     * Constructs a Dolphin object with the specified position, name, gender, weight, and water type.
     */
    public Dolphin(Point position, String name, Gender gender, double weight,WaterType waterType) {
        super(position, name, gender, weight);
        this.waterType = waterType;
    }
/**
     * Returns the sound made by the dolphin.
     */ 
    public String AnimalSound(){
        return "Click-click";
    }
/**
     * Returns a string representation of the Dolphin object.
     */ 
    @Override
    public String toString(){
        return super.toString()+"Dolphin{" +
                "waterType='" + waterType + '\'' +
                '}';
    }
/**
     * Indicates whether some other object is "equal to" this one.
     */
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Dolphin))
            return false;
        Dolphin dolphin = (Dolphin)other;
        return super.equals(dolphin) && waterType.equals(dolphin.waterType);
    }

}
