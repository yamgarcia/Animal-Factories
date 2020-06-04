package ca.bcit.comp2526;

import java.util.Random;

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
