package LineCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromeShouldRaiseExceptionIfStringIsNull() {
        assertThrows(NullPointerException.class,()-> Palindrome.isPalindrome(null));
    }
    @Test
    void isPalindromeShouldReturnTrueIfStringIsPalindrome(){
         assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }
    @Test
    void isPalindromeShouldReturnFalseIfStringIsNotPalindrome(){
        assertFalse(Palindrome.isPalindrome("mohamed"));
    }
}