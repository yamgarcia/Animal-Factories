package ca.bcit.comp2526;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
            animalConstructor = animalClass.getConstructor();
            animal = animalConstructor.newInstance();

            return animal;

        } catch (ClassNotFoundException ex){
            throw new InvalidAnimalException(animalType);

        } catch (final NoSuchMethodException ex) {
            throw new InvalidAnimalException(animalType, "No no--arg constructor");

        } catch (final IllegalAccessException e) {
            throw new InvalidAnimalException(animalType, "No no--arg constructor is not accessible");

        } catch (final InstantiationException e) {
            throw new InvalidAnimalException(animalType, "??");

        } catch (final InvocationTargetException e) {
            throw new InvalidAnimalException(animalType, "??!!");

        }
    }


}
