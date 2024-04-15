package ConditionCoverageTest;

import org.example.QuadraticEquation;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {
    @Test
    public void ArgumentAisZeroShouldRaiseException(){
        assertThrows(IllegalArgumentException.class,()-> QuadraticEquation.solve(0,1,2));
    }

    @Test

    public void DeltaLessThenZeroShouldReturnNull(){

        assertEquals(null,QuadraticEquation.solve(3,0,3));
    }

    @Test
    public void DeltaZeroShouldReturnSolutionDouble(){
        double[] result = QuadraticEquation.solve(1, 2, 1);
        assertArrayEquals(new double[]{1.0}, result);
    }

    @Test
    public void DeltaSupZeroReturnTwoSolution(){
        double[] result = QuadraticEquation.solve(1, 2, -3);
        assertArrayEquals(new double[]{1.0, -3.0}, result);
    }
}