package LineCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void  ShouldRiseExceptionIfaIsZero() {

        assertThrows(IllegalArgumentException.class,()-> QuadraticEquation.solve(0,1,5));

    }
}