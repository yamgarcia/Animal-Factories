package ca.bcit.comp2526;

public class InvalidAnimalException extends Exception {

    private final String type;

    public InvalidAnimalException(final String ty){
        this(ty, "is not a recognized animal");

    }
    public InvalidAnimalException(final String ty, final String msg){
        super(String.format("\'%s\' %s", ty, msg));
        type = ty;
    }

    public InvalidAnimalException(final String       ty,
                                  final String       msg,
                                  final Throwable    cause){
        super(String.format("\"%s\" %s", ty, msg), cause);
        type = ty;
    }

    public String getType() {
        return type;
    }
}
