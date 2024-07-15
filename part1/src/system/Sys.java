/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */

package system;
import animals.*;
import mobility.*;
import Olympics.*;

import java.util.Scanner;
/**
 * The Sys class represents a system for creating and managing various types of animals.
*/
public class Sys {
/**
     * Main method to execute the animal management system.
     */
    public static void main(String[] args) {
        System.out.println("Enter num of enimals you want to create: ");
        Scanner sc = new Scanner(System.in);
        int numOfAnimals = sc.nextInt();

//create a array of animals
        Animal[] animals = new Animal[numOfAnimals];
        for(int i = 0; i < numOfAnimals; i++)
        {
            System.out.println("please enter the kind of the animal that you prefer:\n[1]Air Animal \n[2]Water Animal \n[3]Terrestrial Animal");
            int kind = sc.nextInt();
            switch(kind){
                case 1: {
                    System.out.println("please enter the name of specific air-Animal of the list:\n[1]Eagle \n[2]Pigeon \n");
                    int specificAir = sc.nextInt();

                    switch(specificAir){
                        case 1: {
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the wingspan of the animal: ");
                            double wingspan = sc.nextDouble();
                           
                                                        
                            animals[i] = new Eagle(position,name,Animal.Gender.values()[gender],weight,wingspan);
                            break;
                           
                        }
                        

                        case 2:{
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the wingspan of the animal: ");
                            double wingspan = sc.nextDouble();
                            System.out.println("please enter the family of the animal: ");
                            String family= sc.next();

                            animals[i] = new Pigeon(position,name,Animal.Gender.values()[gender],weight,wingspan,family);
                            break;
                        }

                        default:
                            System.out.println("Invalid valeu\n");
                            break;
                    }

                    break;
                }
                case 2:{
                    System.out.println("please enter the name of specific Water-Animal of the list:\n[1]Alligator \n[2]Dolphin \n[3]Whale \n");
                    int specificWater = sc.nextInt();

                    switch(specificWater){
                        case 1: {
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the area of living of the animal: ");
                            String AreaOfLiving = sc.next();


                            animals[i] = new Alligator(position,name,Animal.Gender.values()[gender],weight,AreaOfLiving);
                            break;
                        }

                        case 2: {
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the type of water where the animal lives:\n[1]Sea \n[2]Sweet");
                            int waterType = sc.nextInt();
                            waterType = waterType-1;
                            
                            
                            


                            animals[i] = new Dolphin(position,name,Animal.Gender.values()[gender],weight,Dolphin.WaterType.values()[waterType]);
                            break;

                        }

                        case 3: {
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the type of the food: ");
                            String foodType = sc.next();

                            animals[i] = new Whale(position,name,Animal.Gender.values()[gender],weight,foodType);
                            break;
                        }
                        default:
                        System.out.println("Invalid valeu\n");
                        break;
                    }
                    break;

                }
                case 3: {
                    System.out.println("please enter the name of specific Terrestrial-Animal of the list:\n[1]Dog \n[2]Cat \n[3]Snake \n");
                    int specificTerrestrial = sc.nextInt();

                    switch(specificTerrestrial){
                        case 1: {
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the number of legs the animal has: ");
                            int legCount = sc.nextInt();
                            System.out.println("please enter the breed of the animal: ");
                            String breed = sc.next();

                            animals[i] = new Dog(position,name,Animal.Gender.values()[gender],weight,legCount, breed);
                            break;
                        }
                        case 2: {
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the number of legs the animal has: ");
                            int legCount = sc.nextInt();
                            System.out.println("please enter if the castrated of the animal:\n[true]/[false] ");
                            boolean castrated = sc.nextBoolean();
                            if (castrated==true)
                                animals[i] = new Cat(position,name,Animal.Gender.values()[gender],weight,legCount, true);
                            else if(castrated==false)
                                animals[i] = new Cat(position,name,Animal.Gender.values()[gender],weight, legCount,false);
                            break;
                        }
                        case 3: {
                            System.out.println("please enter the gender of the animal:\n[1]Male \n[2]Female \n[3]Hermaphrodite");
                            int gender = sc.nextInt();
                            gender = gender-1;
                            System.out.println("please enter the weight of the animal: ");
                            double weight = sc.nextDouble();
                            Point position = new Point();
                            System.out.println("please enter the name of the animal: ");
                            String name = sc.next();
                            System.out.println("please enter the number of legs the animal has: ");
                            int legCount = sc.nextInt();
                            System.out.println("please enter if the snake is poisonous or not:\n[1]yes \n[2]no ");
                            int poisonous = sc.nextInt();
                            poisonous = poisonous-1;
                            System.out.println("please enter the length of the snake: ");
                            double length = sc.nextDouble();

                            animals[i] = new Snake(position,name,Animal.Gender.values()[gender],weight,legCount,Snake.Poisonous.values()[poisonous],length);
                            break;
                        }
                        default:
                        System.out.println("Invalid valeu\n");
                        break;
                    }
                    break;

                }

            }
        }
// Menu loop for interacting with created animals        
        System.out.println("Menu:\n [1] Print the data of all animals\n  [2] Print the all sounds of animals\n [3]Exit");
        int choice = sc.nextInt();
        while (choice<4) {
            switch (choice) {
                case 1:
                    for (Animal animal : animals) {
                        String AllData = animal.toString();
                        System.out.println(AllData);
                        
                    }
                    break;
                case 2:
                    for (Animal animal : animals) {
                         animal.makeSound();
                    }
                    break;
                case 3:
                    System.out.println("Good bye :)");
                    sc.close();
                    break;    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println("\nMenu:\n [1] Print the data of all animals\n  [2] Print the all sounds of animals\n [3] Exit");
            choice = sc.nextInt();
        }
    
    }
    

}

