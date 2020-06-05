package ca.bcit.comp2526;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public interface AnimalFactory {
    Animal createAnimal(String animalType) throws InvalidAnimalException;

}
