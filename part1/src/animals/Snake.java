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
 * The Snake class represents a snake, characterized by its poisonous status and length.
 * This class extends the TerrestrialAnimals class and implements the IReptile interface.
 */
public class Snake extends TerrestrialAnimals implements IReptile{
    public static enum Poisonous{yes,no};
    public static enum LevelOfPois{low,medium,high,none};
    private LevelOfPois levelOfPois = LevelOfPois.low;
    private Poisonous poisonous = Poisonous.no;
    private double length = 0;

/**
     * Constructs a Snake object with the specified position, name, gender, weight, number of legs, poisonous status, and length.
     */ 
    public Snake(Point position,String name,Gender gender,double weight,int noLegs,Poisonous poisonous,double length,LevelOfPois levelOfPois) {
        super(position,name,gender,weight,noLegs);
        this.poisonous = poisonous;
        this.levelOfPois = levelOfPois;
        this.length = length;
    }
/**
     * Sets the speed of the snake.
     */
    public boolean SetSpeed(double speed) {
        return speedUp((int)speed);
    }
/**
     * Returns the sound made by the snake.
     */    
    public String AnimalSound() {
        return "SSSSSSSSS";
    }
 /**
     * Speeds up the snake to the specified speed.(Implemented from the IReptile interface)
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
     * Returns a string representation of the Snake object.
     */
    @Override
    public String toString() {
        return super.toString()+"Snake{" +
                "poisonous=" + poisonous +
                ", length=" + length +
                '}';
    }
 /**
     * Indicates whether some other object is "equal to" this one.
     */
    @Override
    public boolean equals(Object other) {
        if (!(super.equals(other)))
            return false;
        if (!(other instanceof Snake))
            return false;
        Snake snake = (Snake) other;
        return super.equals(snake) && poisonous == snake.poisonous && length == snake.length;
    }

}
