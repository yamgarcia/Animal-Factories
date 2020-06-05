package ca.bcit.comp2526;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public class Bird extends AbstractAnimal
{
    /**
     * Default constructor. dogs have 4 legs
     */
    public Bird(){
        this(
                2);
    }

    /**
     *
     * @param nm dog's name
     */
    public Bird(final String nm){

        this(nm, 4);
    }

    /**
     * @param numLegs to be provided in case it doesn't have exactly 4 legs
     */
    public Bird(final int numLegs){

        super(numLegs);
    }

    /**
     *
     * @param nm dog's name
     * @param numLegs to be provided to dog
     */
    public Bird(final String nm, final int numLegs){

        super(nm, numLegs);
    }

    @Override
    public void speak(final String message) {
        System.out.println("chirp");
    }
}
