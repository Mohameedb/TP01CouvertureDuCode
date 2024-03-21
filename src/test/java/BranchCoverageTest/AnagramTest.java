package BranchCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void  isAnagramShouldRaiseExceptionIfOneElementIsNull() {
        assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,null));

    }
    @Test
    void  isAnagramShouldReturnFalseIfLengthOfElementAreDifferent() {

        assertFalse( Anagram.isAnagram("MOHAMED","CYBER"));
    }
    @Test//this is not passed because there is fault in code (<=) must be (<) in the first loop for
    void  isAnagramShouldReturnFalseIfElementHaveDifferentCaractersAndHaveTheSameLength() {

        assertFalse( Anagram.isAnagram("WISE","POOR"));
    }
    @Test// the same here
    void  isAnagramShouldReturnTrueIfElementHaveSameCaractersAndHaveTheSameLength() {

        assertTrue( Anagram.isAnagram("WHO","HOW"));
    }
}