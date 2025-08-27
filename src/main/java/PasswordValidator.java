public final class PasswordValidator {
    public static void main(String[] args) {
        boolean valid = isValid(args[0]);
        System.out.println(String.valueOf(valid));
    }

    public static boolean isValid(String password) {
        return false;
    }
    public static boolean hasMinLength(String password, int min) {
        return false;
    }
    public static boolean containsDigit(String password) {
        return false;
    }
    public static boolean containsUpperAndLower(String password) {
        return false;
    }
    public static boolean isCommonPassword(String password) {
        return false;
    }
    public static boolean containsSpecialChar(String password, String allowed) {
        return false;
    }

}
