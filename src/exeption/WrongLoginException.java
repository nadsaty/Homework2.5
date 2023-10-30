package exeption;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException(String error) {
        super(error);
    }
}
