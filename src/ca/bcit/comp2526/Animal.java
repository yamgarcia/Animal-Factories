package ca.bcit.comp2526;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public interface Animal
{
    void setName(String nm);
    String getName();
    int getNumberOfLegs();
    void speak(String message);
}
