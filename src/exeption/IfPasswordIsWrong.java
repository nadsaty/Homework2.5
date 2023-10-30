package exeption;

public class IfPasswordIsWrong extends RuntimeException {
    public IfPasswordIsWrong(String error) {
        super(error);
    }
}
