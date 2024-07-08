package animals;
import mobility.*;

public class Dolphin extends WaterAnimal {
    public static enum WaterType {Sea, Sweet}
    private WaterType waterType=WaterType.Sea;


    public Dolphin(Point position, String name, Gender gender, double weight,WaterType waterType) {
        super(position, name, gender, weight);
        this.waterType = waterType;
    }

    public String AnimalSound(){
        return "Click-click";
    }

    @Override
    public String toString(){
        return super.toString()+"Dolphin{" +
                "waterType='" + waterType + '\'' +
                '}';
    }

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
