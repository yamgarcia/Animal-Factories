package ca.bcit.comp2526;

public class Main {

    public static void main(final String[] argv)  { //main should never throw an exception
        try {
            final Animal animal;

            animal = createAnimal(argv[0]);
            animal.speak("hello"); // sout = System.out.println() souf = System.out.printf()

            System.out.println(animal.getName());
            System.out.println(animal.getNumberOfLegs());
        } catch (final InvalidAnimalException ex){
//            ex.printStackTrace(); but it'll crash
            System.out.println(ex.getLocalizedMessage());
        }
    }

    public static Animal createAnimal(final String animalType) throws InvalidAnimalException {

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
