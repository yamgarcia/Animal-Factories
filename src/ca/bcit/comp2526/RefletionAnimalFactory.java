package ca.bcit.comp2526;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public class RefletionAnimalFactory
        implements AnimalFactory {
    @Override
    public Animal createAnimal(final String animalType)
            throws InvalidAnimalException {

        try {
            final Class<Animal> animalClass;
            final Constructor<Animal> animalConstructor;
            final Animal animal;

            animalClass = (Class<Animal>) Class.forName("ca.bcit.comp2526." + animalType); // It has to exist in this package
//            animalConstructor = animalClass.getConstructor(); // this get only public constructors
            animalConstructor = animalClass.getDeclaredConstructor(); // this get any constructor a class have
            animal = animalConstructor.newInstance();

            return animal;

        } catch (ClassNotFoundException e){
            throw new InvalidAnimalException(animalType);

        } catch (final NoSuchMethodException e) {
            throw new InvalidAnimalException(animalType, "No no--arg constructor", e);

        } catch (final IllegalAccessException e) {
            throw new InvalidAnimalException(animalType, "No no--arg constructor is not accessible", e);

        } catch (final InstantiationException e) {
            throw new InvalidAnimalException(animalType, "??", e);

        } catch (final InvocationTargetException e) {
            throw new InvalidAnimalException(animalType, "Had an error while creating", e);

        }
    }


}
