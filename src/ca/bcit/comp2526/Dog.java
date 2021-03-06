package ca.bcit.comp2526;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public class Dog extends AbstractAnimal
{
    /**
     * Default constructor. dogs have 4 legs
     */
    public Dog(){
        this(
                4);
    }

    /**
     *
     * @param nm dog's name
     */
    public Dog(final String nm){

        this(nm, 4);
    }

    /**
     * @param numLegs to be provided in case it doesn't have exactly 4 legs
     */
    public Dog(final int numLegs){

        super(numLegs);
    }

    /**
     *
     * @param nm dog's name
     * @param numLegs to be provided to dog
     */
    public Dog(final String nm, final int numLegs){

        super(nm, numLegs);
    }

    @Override
    public void speak(final String message) {

        if (message.equals("hello")){
            System.out.println("woof");
        }
        else if (message.equals("good bye")){
            System.out.println("whine");
        } else {
            System.out.println("<wag tail>");
        }

    }
}
