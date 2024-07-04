package animals;
import mobility.*;
import java.util.ArrayList;
import Olympics.*;


public abstract class Animal extends Mobile {

    private String name="Animal";
    public static enum Gender {Male, Female,Hermaphrodite};
    private Gender gender=Gender.Male;
    private double weight=0;
    private double speed=0;
    private ArrayList<Medal> medalArr;
    private Point position=new Point();

    
    public Animal(Point position,String name,Gender gender,double weight,double speed) {
        super(position);
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
        this.medalArr = new ArrayList<Medal>();
    }

    public String getName() {
        return name;
    }
    protected boolean SetSpeed(double speed){
        this.speed=speed;
        return true;
    }
    public double GetSpeed(){
        return speed;
    }
    
    public abstract String AnimalSound();

    public void makeSound(){
        System.out.println("Animal"+this.getName()+"said: "+AnimalSound());

    }

    @Override
    public String toString() {
        return super.toString()+"Animal{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", speed=" + speed +
                ", medalArr=" + medalArr +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if(!(super.equals(other)))
            return false;
        if (!(other instanceof Animal))
            return false;
        Animal animal = (Animal)other;
        if(medalArr.size()!= animal.medalArr.size()){
            return false;
        }
        for(Medal m : medalArr){
            if(!animal.medalArr.contains(m)){
                return false;
            }
        }
        return super.equals(animal) && name.equals(animal.name) && gender == animal.gender && weight == animal.weight && speed == animal.speed && position.equals(animal.position);
    }

}
