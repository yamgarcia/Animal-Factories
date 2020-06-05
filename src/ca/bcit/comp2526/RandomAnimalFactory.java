package ca.bcit.comp2526;

import java.util.Random;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public class RandomAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(final String animalType){

        final Random random;
        final Animal animal;
        final int number;

        random = new Random();
        number = random.nextInt(100) + 1;

        if(number <= 33){
            animal = new Cat();
        } else {
            animal = new Dog();
        }

        return animal;
    }
}
