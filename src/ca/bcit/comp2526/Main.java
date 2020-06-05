package ca.bcit.comp2526;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public class Main {

    public static void main(final String[] argv)  { //main should never throw an exception
        try {

            final AnimalFactory animalFactory;

            animalFactory = new RefletionAnimalFactory();

            final Animal animal;

//            animal = animalFactory.createAnimal(argv[0]);
            animal = animalFactory.createAnimal(argv[0]);
            animal.speak("good bye"); // sout = System.out.println() souf = System.out.printf()

            System.out.println(animal.getName());
            System.out.print("number of legs: ");
            System.out.println(animal.getNumberOfLegs());
            System.out.println(animal);

        } catch (final InvalidAnimalException ex){
//            ex.printStackTrace(); but it'll crash
            System.out.println(ex.getLocalizedMessage());

        }
    }

}
