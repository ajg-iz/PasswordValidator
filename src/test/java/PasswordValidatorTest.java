import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @org.junit.jupiter.api.Test
    void isValid_shouldReturnTrue_ifAllChecksReturnTrue() {
        assertTrue(PasswordValidator.isValid("Blablabla?22"));
    }

    @org.junit.jupiter.api.Test
    void hasMinLength_shouldReturnTrue_ifGivenStringLongerOrEqualTo8() {
        assertTrue(PasswordValidator.hasMinLength("Blabla?2", 8));
    }

    @org.junit.jupiter.api.Test
    void hasMinLength_shouldReturnFalse_ifGivenStringSmallerThen8() {
        assertFalse(PasswordValidator.hasMinLength("Bla?2", 8));
    }

    @org.junit.jupiter.api.Test
    void containsDigit_shouldReturnTrue_ifStringContainsAtLeastOneDigit() {
        assertTrue(PasswordValidator.containsDigit("Blabla2?"));
    }

    @org.junit.jupiter.api.Test
    void containsDigit_shouldReturnFalse_ifStringContainsNoDigit() {
        assertFalse(PasswordValidator.containsDigit("Blablabla?"));
    }

    @org.junit.jupiter.api.Test
    void containsUpperAndLower_shouldReturnTrue_ifStringContainsUpperAndLower() {
        assertTrue(PasswordValidator.containsUpperAndLower("Blabla2?"));
    }

    @org.junit.jupiter.api.Test
    void containsUpperAndLower_shouldReturnFalse_ifStringDoesntContainsUpperAndLower() {
        assertFalse(PasswordValidator.containsUpperAndLower("blabla2?"));
    }

    @org.junit.jupiter.api.Test
    void isCommonPassword_shouldReturnTrue_ifStringIsInListOfCommonPasswords() {
        assertTrue(PasswordValidator.isCommonPassword("password"));
    }

    @org.junit.jupiter.api.Test
    void isCommonPassword_shouldReturnFalse_ifStringIsNotInListOfCommonPasswords() {
        assertFalse(PasswordValidator.isCommonPassword("Blabla?2"));
    }

    @org.junit.jupiter.api.Test
    void containsSpecialChar_shouldReturnTrue_ifStringContainsAtLeastOneSpecialCharacter() {
        assertTrue(PasswordValidator.containsSpecialChar("BlaBla2?", "!\"§$%&/()=?²³¼½¬{[]}\\,;.:+-*'#~|<>^°"));
    }

    @org.junit.jupiter.api.Test
    void containsSpecialChar_shouldReturnFalse_ifStringDoesntContainsAtLeastOneSpecialCharacter() {
        assertFalse(PasswordValidator.containsSpecialChar("BlaBla22", "!\"§$%&/()=?²³¼½¬{[]}\\,;.:+-*'#~|<>^°"));
    }
}