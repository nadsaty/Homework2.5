package exeption;

public class IfLoginIsWrong extends RuntimeException {

    public IfLoginIsWrong(String error) {
        super(error);
    }
}
