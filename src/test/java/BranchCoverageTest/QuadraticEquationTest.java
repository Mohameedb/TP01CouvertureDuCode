package BranchCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void  QuadraticEquationShouldRiseExceptionIfaIsZero() {

        assertThrows(IllegalArgumentException.class,()-> QuadraticEquation.solve(0,1,5));

    }
    @Test
    void  QuadraticEquationShouldReturnNullIfDeltalessThanZero() {

        assertEquals(null,QuadraticEquation.solve(4,1,5));

    }
    @Test
    void  QuadraticEquationShouldReturnRacineDoubleIfDeltaIsZero() {

        assertArrayEquals(new double[]{-1},QuadraticEquation.solve(1,2,1));

    }
    @Test
    void  QuadraticEquationShouldReturnTwoRacineIfDeltaIsbiggerThanZero() {

        assertArrayEquals(new double[]{1,-3},QuadraticEquation.solve(1,2,-3));

    }

}