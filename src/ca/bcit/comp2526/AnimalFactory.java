package ca.bcit.comp2526;

public interface AnimalFactory {
    Animal createAnimal(String animalType) throws InvalidAnimalException;

}
