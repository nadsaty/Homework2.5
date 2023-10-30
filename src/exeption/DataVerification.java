package exeption;
public class DataVerification {
    private static final int MAX_LENGTH = 20;
    public static final String LEGAL_CHARACTERS = "qwertyuiopasdfghjklzxcvbnm1234567890_QWERTYUIOPASDFGHJKLZXCVBNM";

    public static void verification(String login, String password, String confirmPassword) {
        loginVerification(login);
        passwordVerification(password, confirmPassword);
    }

    //Проверка логина
    public static void loginVerification(String login) {
        for (int i = 0; i < login.length(); ++i) {
            if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
                throw new IfLoginIsWrong("Логин содержит недопустимые символы!");
            }
        }
        if (login.length() > MAX_LENGTH) {
            throw new IfLoginIsWrong("Длина логина не должна превышать " + MAX_LENGTH + " символов!");
        }
    }


    //Проверка пароля
    public static void passwordVerification(String password, String confirmPassword) {
        for (int i = 0; i < password.length(); ++i) {
            if (LEGAL_CHARACTERS.indexOf(password.charAt(i)) == -1) {
                throw new IfPasswordIsWrong("Пароль содержит недопустимые символы!");
            }
        }

        if (password.length() > MAX_LENGTH) {
            throw new IfLoginIsWrong("Длина пароля не должна превышать " + MAX_LENGTH + " символов!");
        }
        if (!password.equals(confirmPassword)) {
            throw new IfLoginIsWrong("Пароли не совпадают!");
        }
    }
}
