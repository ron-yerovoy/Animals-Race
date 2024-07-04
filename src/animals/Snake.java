package animals;
import mobility.*;

public class Snake extends TerrestrialAnimals implements IReptile{
    public static enum Poisonous{yes,no};
    private Poisonous poisonous = Poisonous.no;
    private double length = 0;


    public Snake(Point position,String name,Gender gender,double weight,double speed,int noLegs,Poisonous poisonous,double length) {
        super(position,name,gender,weight,speed,noLegs);
        this.poisonous = poisonous;
        this.length = length;
    }

    public boolean SetSpeed(double speed) {
        return speedUp((int)speed);
    }
    public String AnimalSound() {
        return "SSSSSSSSS";
    }

    public boolean speedUp(int speed){
        if(speed>MAX_SPEED)
        {
            return false;
        }
        super.SetSpeed(speed);
        return true;

    }

}
