package ca.bcit.comp2526;

public class InvalidAnimalException extends Exception {

    private final String type;

    public InvalidAnimalException(final String ty){
        super(String.format("\'%s\' is not a recognized animal", ty));

        type = ty;

    }

    public String getType() {
        return type;
    }
}
