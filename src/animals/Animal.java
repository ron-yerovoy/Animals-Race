package animals;
import mobility.*;
import Olympics.*;

public abstract class Animal extends Mobile {

    private String name="Animal";
    public static enum Gender {Male, Female,Hermaphrodite};
    private Gender gender=Gender.Male;
    private double weight=0;
    private double speed=0;
    private Medal medalArr[];
    private Point position=new Point();

    
    public Animal(Point position,String name,Gender gender,double weight,double speed) {
        super(position);
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
        this.medalArr = new Medal[1];
    }

    public String getName() {
        return name;
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
        return super.equals(animal) && name.equals(animal.name) && gender == animal.gender && weight == animal.weight && speed == animal.speed && medalArr==animal.medalArr && position.equals(animal.position);
    }

}
