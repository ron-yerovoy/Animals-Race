package animals;
import mobility.*;

public class Pigeon extends AirAnimal{
    private String family = null;


    public Pigeon(Point position, String name, Gender gender, double weight,double wingspan,String family) {
        super(position, name, gender, weight,wingspan);
        this.family = family;
    }

    public String AnimalSound(){
        return "Arr-rar-rar-rar-raah";
    }

    @Override
    public String toString(){
        return super.toString()+"Pigeon{" +
                "family='" + family + '\'' +
                '}';
    }

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
