/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */
package animals;
import mobility.Point;
/**
 * The WaterAnimal class represents an animal that lives in water, characterized by its diving depth.
 * This is an abstract class that extends the Animal class.
 */
public abstract class WaterAnimal extends Animal{

    private static final int MAX_DIVE = -800;
    private double diveDept;

/**
     * Constructs a WaterAnimal with the specified position, name, gender, and weight.
     */ 
    public WaterAnimal(Point position,String name,Gender gender,double weight) {
        super(position = new Point(50,0),name, gender, weight);
        this.diveDept = 0;
    }
/**
     * Dives the water animal by a specified depth.
     */ 
    public boolean Dive(double dive) {
        if (diveDept+dive<= MAX_DIVE)
            return false;
        this.diveDept += dive;
        return true;

    }
/**
     * Returns a string representation of the WaterAnimal object.
     */ 
    @Override
    public String toString() {
        return super.toString()+"WaterAnimal{" +
                "diveDept=" + diveDept +
                '}';
    }
  /**
     * Indicates whether some other object is "equal to" this one.
     */
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
        return false;
        if (!(other instanceof WaterAnimal))
            return false;
        WaterAnimal waterAnimal = (WaterAnimal)other;
        return super.equals(waterAnimal) && diveDept == waterAnimal.diveDept;
    }
 /**
     * Returns the sound made by the water animal.
     */ 
    public abstract String AnimalSound();
}
