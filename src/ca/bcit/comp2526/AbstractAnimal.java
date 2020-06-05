package ca.bcit.comp2526;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public abstract class AbstractAnimal
    implements Animal {

    private String name;
    private final int numberOfLegs;

    /**
     *
     * @param numOfLegs
     */
    protected AbstractAnimal(final int numOfLegs){
        this("<unnamed>", numOfLegs);
    }

    protected AbstractAnimal(final String nm,
                             final int numLegs)
    {
        name         = nm;
        numberOfLegs = numLegs;
    }

    public void setName(final String nm){
        name = nm;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    // Useful for debugging
    public String toString() {
        return "AbstractAnimal{" +
                "name='" + name + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
