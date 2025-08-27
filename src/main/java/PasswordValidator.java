import java.util.Arrays;
import java.util.List;

public final class PasswordValidator {

    public static void main(String[] args) {
        boolean valid = false;
        if (!args[0].isEmpty()) {
            valid = isValid(args[0]);
        }
        System.out.println(valid);
    }

    public static boolean isValid(String password) {
        boolean validated = false;
        String specialChars = "!\"§$%&/()=?²³¼½¬{[]}\\,;.:+-*'#~|<>^°";
        int minLength = 8;
        if (hasMinLength(password, minLength)
                && containsDigit(password)
                && containsUpperAndLower(password)
                && !isCommonPassword(password)
                && containsSpecialChar(password, specialChars)) {
            validated = true;
        }
        return validated;
    }
    public static boolean hasMinLength(String password, int min) {
        return password.length() >= min;
    }
    public static boolean containsDigit(String password) {
        boolean foundDigit = false;
        for (int i = 0; i < 10; i++) {
            if (password.contains(String.valueOf(i))) {
                foundDigit = true;
                break;
            }
        }
        return foundDigit;
    }
    public static boolean containsUpperAndLower(String password) {
        boolean hasBoth = false;
        if (!password.toLowerCase().equals(password)
                && !password.toUpperCase().equals(password)) {
            hasBoth = true;
        }
        return hasBoth;
    }
    public static boolean isCommonPassword(String password) {
        boolean foundCommon = false;
        List<String> mostCommon = Arrays.asList(new String[]{"qwerty","password","qwertyuiop","mynoob","18atcskd2w","1q2w3e4r","3rjs1la7qe","google","1q2w3e4r5t","123qwe","zxcvbnm","1q2w3e"});
        if (mostCommon.contains(password)) {
            foundCommon = true;
        }
        return foundCommon;
    }
    public static boolean containsSpecialChar(String password, String specialChars) {
        boolean foundSpecialChar = false;
        for (int i = 0; i < specialChars.length(); i++) {
            for (int j = 0; j <password.length(); j++) {
                if (specialChars.charAt(i) == password.charAt(j)) {
                    foundSpecialChar = true;
                    break;
                }
            }
        }
        return foundSpecialChar;
    }

}
