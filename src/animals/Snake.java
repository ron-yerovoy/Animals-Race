package animals;
import mobility.*;

public class Snake extends TerrestrialAnimals implements IReptile{
    public static enum Poisonous{yes,no};
    private Poisonous poisonous = Poisonous.no;
    private double length = 0;


    public Snake(Point position,String name,Gender gender,double weight,int noLegs,Poisonous poisonous,double length) {
        super(position,name,gender,weight,noLegs);
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

    @Override
    public String toString() {
        return super.toString()+"Snake{" +
                "poisonous=" + poisonous +
                ", length=" + length +
                '}';
    }

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
