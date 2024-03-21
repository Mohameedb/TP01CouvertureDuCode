package LineCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void  binarySearchShouldRiseExceptionIfTheArrayInputIsNull() {

        assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(null,2));

    }
    @Test
    void  binarySearchShouldReturnTheRightIndexIfElementExistInArray() {
        int[] array= new int[5];

        array[0]=8;
        array[1]=9;
        array[2]=12;
        array[3]=13;
        array[4]=97;


        assertEquals(3,BinarySearch.binarySearch(array,13));
    }
    @Test
    void  binarySearchShouldReturnMinusOneTheElementDoesNotExist() {
        int[] array= new int[4];

        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        assertEquals(-1,BinarySearch.binarySearch(array,0));


    }
    }
