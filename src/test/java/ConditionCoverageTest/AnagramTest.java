package ConditionCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void RaiseExceptionIfFirstInputNull(){
        assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,"med"));
    }

    @Test
    public void RaiseExceptionIfsecondInputNull(){
        assertThrows(NullPointerException.class,()-> Anagram.isAnagram("med",null));
    }


    @Test
    public void ShouldReturnFalseIfItIsnotTheSameLength(){
        assertFalse(Anagram.isAnagram("mohamed","bouslah"));
    }

    @Test
    public void ShouldReturnFalseIfTwoStringSameLength(){
        assertFalse(Anagram.isAnagram("mohamed","bouslah"));
    }

    @Test
    public void ShouldReturnTrueIfTwoStringSameLengthAndAnagram(){
        assertTrue(Anagram.isAnagram("how","who"));
    }
}