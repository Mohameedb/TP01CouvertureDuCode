package BranchCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void  binarySearchShouldRiseExceptionIfTheArrayInputIsNull() {

        assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(null,5));

    }
    @Test
    void  binarySearchShouldReturnTheRightIndexIfElementExistInArray() {
        int[] array= new int[5];

        array[0]=1;
        array[1]=2;
        array[2]=7;
        array[3]=10;
        array[4]=15;


        assertEquals(2,BinarySearch.binarySearch(array,7));
    }
    @Test
    void  binarySearchShouldReturnMinusOneTheElementDoesNotExist() {
        int[] array= new int[4];

        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        assertEquals(-1,BinarySearch.binarySearch(array,8));


    }

}