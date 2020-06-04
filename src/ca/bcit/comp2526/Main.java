package ca.bcit.comp2526;

public class Main {

    public static void main(final String[] argv)  { //main should never throw an exception
        try {

            final AnimalFactory animalFactory;

            animalFactory = new RefletionAnimalFactory();

            final Animal animal;

//            animal = animalFactory.createAnimal(argv[0]);
            animal = animalFactory.createAnimal(argv[0]);
            animal.speak("hello"); // sout = System.out.println() souf = System.out.printf()

            System.out.println(animal.getName());
            System.out.println(animal.getNumberOfLegs());
        } catch (final InvalidAnimalException ex){
//            ex.printStackTrace(); but it'll crash
            System.out.println(ex.getLocalizedMessage());
        }
    }

}
