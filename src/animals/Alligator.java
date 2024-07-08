package animals;
import mobility.*;


public class Alligator extends WaterAnimal implements IReptile{

    private String AreaOfLiving=null;

    public Alligator(Point position,String name,Gender gender,double weight,String AreaOfLiving) {
        super(position,name,gender,weight);
        this.AreaOfLiving = AreaOfLiving;
  
    }

    public boolean speedUp(int speed){
        if(speed>MAX_SPEED)
        {
            return false;
        }
        super.SetSpeed(speed);
        return true;
    }

    public String AnimalSound(){
        return "Roar";
    }

    @Override
    public String toString() {
        return super.toString()+"Alligator{" +
                "AreaOfLiving='" + AreaOfLiving + '\'' +
                '}';
    }

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
