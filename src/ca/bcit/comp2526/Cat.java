package ca.bcit.comp2526;

import java.security.spec.RSAOtherPrimeInfo;

public class Cat extends AbstractAnimal
{
    /**
     * Default constructor. Cats have 4 legs
     */
    public Cat(){
        this(4);
    }

    /**
     *
     * @param nm cat's name
     */
    public Cat(final String nm){
        this(nm, 4);
    }

    /**
     * @param numLegs to be provided in case it doesn't have exactly 4 legs
     */
    public Cat(final int numLegs){
        super(numLegs);
    }

    /**
     *
     * @param nm cat's name
     * @param numLegs to be provided to cat
     */
    public Cat(final String nm, final int numLegs){
        super(nm, numLegs);
    }







    @Override
    public void speak(final String message) {
        System.out.println("meow");
    }
}
