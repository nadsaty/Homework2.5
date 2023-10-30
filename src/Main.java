import exeption.DataVerification;
import exeption.WrongLoginException;
import exeption.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "nadsaty333";
        String password = "password333";
        String confirmPassword = "password333";

        try {
            DataVerification.verification(login, password, confirmPassword);
            System.out.println("Верификация успешно завершена!");
        } catch (WrongLoginException ifLoginIsWrong) {
            ifLoginIsWrong.printStackTrace();
        } catch (WrongPasswordException ifPasswordIsWrong) {
            ifPasswordIsWrong.printStackTrace();
        }
    }
}