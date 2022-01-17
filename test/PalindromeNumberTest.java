import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void testPalindromeNumber() {

        assertTrue(PalindromeNumber.isPalindrome(0));
        assertFalse(PalindromeNumber.isPalindrome(12));
        assertFalse(PalindromeNumber.isPalindrome(123));
        assertFalse(PalindromeNumber.isPalindrome(1234));
        assertFalse(PalindromeNumber.isPalindrome(1222));
        assertFalse(PalindromeNumber.isPalindrome(-1));
        assertFalse(PalindromeNumber.isPalindrome(-11));
        assertFalse(PalindromeNumber.isPalindrome(-111));

        assertTrue(PalindromeNumber.isPalindrome(11));
        assertTrue(PalindromeNumber.isPalindrome(111));
        assertTrue(PalindromeNumber.isPalindrome(1221));
        assertTrue(PalindromeNumber.isPalindrome(12321));
        assertTrue(PalindromeNumber.isPalindrome(123321));
        assertTrue(PalindromeNumber.isPalindrome(1212121));
        assertTrue(PalindromeNumber.isPalindrome(1234321));
        assertTrue(PalindromeNumber.isPalindrome(12344321));
    }
}