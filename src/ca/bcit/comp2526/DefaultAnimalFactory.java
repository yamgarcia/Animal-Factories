package ca.bcit.comp2526;

public class DefaultAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(final String animalType) throws InvalidAnimalException {
        final Animal animal;

        switch(animalType){
            case "Cat":
                animal = new Cat();
                break;
            case "Dog":
                animal = new Dog();
                break;
            default:
                throw new InvalidAnimalException(animalType);
        }
        return animal;
    }
}
