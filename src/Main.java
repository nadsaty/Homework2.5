import exeption.DataVerification;
import exeption.IfLoginIsWrong;
import exeption.IfPasswordIsWrong;

public class Main {
    public static void main(String[] args) {
        String login = "nadsaty333!";
        String password = "password333";
        String confirmPassword = "password333";

        try {
            DataVerification.verification(login, password, confirmPassword);
        } catch (IfLoginIsWrong ifLoginIsWrong) {
            System.out.println(ifLoginIsWrong);
        } catch (IfPasswordIsWrong ifPasswordIsWrong) {
            System.out.println(ifPasswordIsWrong);
        }
    }
}