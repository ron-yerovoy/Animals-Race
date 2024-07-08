package animals;
import mobility.*;

public class Whale extends WaterAnimal {

    private String foodType = "food";

    public Whale(Point position, String name, Gender gender, double weight,String foodType) {
        super(position, name, gender, weight);
        this.foodType = foodType;
    }

    public String AnimalSound(){
        return "Splash";
    }

    @Override
    public String toString(){
        return super.toString()+"Whale{" +
                "foodType='" + foodType + '\'' +
                '}';
    }

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
