package ConditionCoverageTest;

import org.example.Palindrome;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void PalindromeShouldRaiseExceptionIfInputIsNull()
    {
        assertThrows(NullPointerException.class,()-> Palindrome.isPalindrome(null));
    }


    @Test
    public void PalidromeShouldReturnFalseToCoverageCondition(){
        assertFalse(Palindrome.isPalindrome("bouslah"));
    }

}