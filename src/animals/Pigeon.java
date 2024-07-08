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
 * The Pigeon class represents a pigeon, characterized by its family.
 * This class extends the AirAnimal class.
 */
public class Pigeon extends AirAnimal{
    private String family = null;

/**
     * Constructs a Pigeon object with the specified position, name, gender, weight, wingspan, and family.
     */
    public Pigeon(Point position, String name, Gender gender, double weight,double wingspan,String family) {
        super(position, name, gender, weight,wingspan);
        this.family = family;
    }

/**
     * Returns the sound made by the pigeon.
     */
    public String AnimalSound(){
        return "Arr-rar-rar-rar-raah";
    }
/**
     * Returns a string representation of the Pigeon object.
     */
    @Override
    public String toString(){
        return super.toString()+"Pigeon{" +
                "family='" + family + '\'' +
                '}';
    }
/**
     * Indicates whether some other object is "equal to" this one.
     */ 
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Pigeon))
            return false;
        Pigeon pigeon = (Pigeon)other;
        return super.equals(pigeon) && family.equals(pigeon.family);
    }
}
