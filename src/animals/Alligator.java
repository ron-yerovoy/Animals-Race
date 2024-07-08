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
 * The Alligator class represents an alligator, characterized by its area of living.
 * This class extends the WaterAnimal class and implements the IReptile interface.
 */
public class Alligator extends WaterAnimal implements IReptile{

    private String AreaOfLiving=null;
/**
     * Constructs an Alligator object with the specified position, name, gender, weight, and area of living.
     */
    public Alligator(Point position,String name,Gender gender,double weight,String AreaOfLiving) {
        super(position,name,gender,weight);
        this.AreaOfLiving = AreaOfLiving;
  
    }
/**
     * Speeds up the alligator to the specified speed.(Implemented from the IReptile interface)
     */ 
    public boolean speedUp(int speed){
        if(speed>MAX_SPEED)
        {
            return false;
        }
        super.SetSpeed(speed);
        return true;
    }
    
/**
     * Returns the sound made by the alligator.
     */ 
    public String AnimalSound(){
        return "Roar";
    }
/**
     * Returns a string representation of the Alligator object.
     */
    @Override
    public String toString() {
        return super.toString()+"Alligator{" +
                "AreaOfLiving='" + AreaOfLiving + '\'' +
                '}';
    }
/**
     * Indicates whether some other object is "equal to" this one.
     */ 
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Alligator))
            return false;
        Alligator alligator = (Alligator)other;
        return super.equals(alligator) && AreaOfLiving.equals(alligator.AreaOfLiving);
    }
}
