public class Data {

    private static final String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    private Data() {

    }


    public static boolean checkData (String login, String password, String confirmPassword) {
        try {
            checkAllData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkAllData (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
        if (!checkLoginPassword(login)) {
            throw new WrongLoginException("Неверный формат логина");
        }
        if (!checkLoginPassword(password)) {
            throw new WrongPasswordException("Неверный формат пароля");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }
    }

    private static boolean checkLoginPassword(String string) {
        if (string.length() > 20 || string.length() == 0) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(string.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
