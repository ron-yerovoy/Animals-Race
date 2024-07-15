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
 * The Eagle class represents an eagle, characterized by its altitude of flight.
 * This class extends the AirAnimal class.
 */
public class Eagle extends AirAnimal{
    private static final int MAX_ALTITUDE = 1000;
    private double altitudeOfFlight;

/**
     * Constructs an Eagle object with the specified position, name, gender, weight, and wingspan.
     */
    public Eagle(Point position, String name, Gender gender, double weight,double wingspan) {
        super(position, name, gender, weight,wingspan);
        this.altitudeOfFlight = 0;
    }

    //add func that changes altitude of flight

/**
     * Returns the sound made by the eagle.
     */ 
    public String AnimalSound(){
        return "Clack-wack-chack";
    }
/**
     * Returns a string representation of the Eagle object.
     */
    @Override
    public String toString(){
        return super.toString()+"Eagle{" +
                "altitudeOfFlight=" + altitudeOfFlight +
                '}';
    }
 /**
     * Indicates whether some other object is "equal to" this one.
     */ 
    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Eagle))
            return false;
        Eagle eagle = (Eagle)other;
        return super.equals(eagle) && altitudeOfFlight == eagle.altitudeOfFlight;
    }

}
