package ConditionCoverageTest;

import org.example.BinarySearch;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    @Test
    public void ArrayNullShouldReturnException(){
        assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(null,3));
    }

    @Test
    public void ArrayWithoutElementShouldReturnMinusOne(){
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int index = BinarySearch.binarySearch(array, 6);
        assertEquals(-1, index);
    }

    @Test

    public  void ArrayWithElementShouldReturnTheRightIndex(){
        int[] array = {1, 2, 3, 4,5, 6, 7, 8, 9, 10};
        int index = BinarySearch.binarySearch(array, 5);
        assertEquals(4, index);
    }
}