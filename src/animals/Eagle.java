package animals;
import mobility.*;

public class Eagle extends AirAnimal{
    private static final int MAX_ALTITUDE = 1000;
    private double altitudeOfFlight;

    public Eagle(Point position, String name, Gender gender, double weight,double wingspan) {
        super(position, name, gender, weight,wingspan);
        this.altitudeOfFlight = 0;
    }

    //add func that changes altitude of flight

    public String AnimalSound(){
        return "Clack-wack-chack";
    }

    @Override
    public String toString(){
        return super.toString()+"Eagle{" +
                "altitudeOfFlight=" + altitudeOfFlight +
                '}';
    }

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
