/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */
package animals;
import mobility.*;
import java.util.ArrayList;

import Graphics.IAnimal;
import Graphics.IClonable;
import Graphics.IDrawable;
import Graphics.IMoveable;
import Olympics.*;

/**
 * The Animal class represents an animal that can move, has a name, gender, weight, speed,
 * and can hold a list of medals. This is an abstract class that extends the Mobile class.
 */
public abstract class Animal extends Mobile implements IAnimal,IClonable,IMoveable,IDrawable,ILocatable {

    private String name="Animal";
    /**
     * Enum representing the gender of the animal.
     */
    public static enum Gender {Male,Female,Hermaphrodite};
    private Gender gender=Gender.Male;
    private double weight=0;
    private double speed;
    private ArrayList<Medal> medalArr;
    private Point position;

    private IMoveable imoveable;
    private IDrawable idrawable;
    private IClonable iclonable;

    protected Point location;

    private int size; 
    private int id; 
    private Location loc; 
    private Orientation orien; 
    private int maxEnergy;
    private int Energy; 
    private int energyPerMeter; 
    private CompetitionPanel pan; 
    private BufferedImage img1, img2, img3, img4;

    public String getAnimaleName(){
        return this.name;
    }
    
    public int getSpeed(){
        return (int)this.speed;
    }

    @Override
    public boolean move(Point p){
        
        
    }




    public boolean eat(int energy){
        if(this.Energy + energy <= this.maxEnergy)
        {
            this.Energy = this.Energy + energy;
            return true;
        }
        else
            return false;
        


    }




 /**
     * Constructs an Animal with the specified position, name, gender, and weight.
     */     
    public Animal(Point position,String name,Gender gender,double weight) {
        super(position);
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = 0;
        this.medalArr = new ArrayList<Medal>();
        this.position = super.getLocation();    
    }
 /**
     * Gets the name of the animal.
     */ 
    public String getName() {
        return name;
    }
     /**
     * Sets the speed of the animal.
     */ 
    protected boolean SetSpeed(double speed){
        this.speed=speed;
        return true;
    }
    /**
     * Gets the speed of the animal.
     */
    public double GetSpeed(){
        return speed;
    }
    /**
     * Returns the sound made by the animal.
     */
    public abstract String AnimalSound();
/**
     * Makes the animal produce its sound by printing it to the console.
     */
    public void makeSound(){
        System.out.println("Animal "+this.getName()+" said: "+AnimalSound());

    }
/**
     * Returns a string representation of the Animal object.
     */ 
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
 /**
     * Indicates whether some other object is "equal to" this one.
     */ 
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