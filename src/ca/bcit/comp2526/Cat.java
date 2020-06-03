package ca.bcit.comp2526;

public class Cat extends AbstractAnimal
{

    public Cat(final int numLegs){
        super(numLegs);
    }

    public Cat(final String nm, final int numLegs){
        super(nm, numLegs);
    }

    @Override
    public void speak(final String message) {

    }
}
