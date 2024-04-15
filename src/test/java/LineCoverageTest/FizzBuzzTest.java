package LineCoverageTest;

import org.example.FizzBuzz;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void InvalideInputReturnException(){
        assertThrows(IllegalArgumentException.class,()-> FizzBuzz.fizzBuzz(-1));
    }

    @Test
    public void DivisbleFifteenReturnFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void DivisbleThreeReturnFizz(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void DivisbleFiveReturnBuzz(){
        assertEquals("Buzz",FizzBuzz.fizzBuzz(20));
    }

    @Test
    public void NonDivisbleReturnNumberIntoString(){
        assertEquals("29",FizzBuzz.fizzBuzz(29));
    }
}