package ConditionCoverageTest;

import org.example.QuadraticEquation;
import org.example.RomanNumeral;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralTest {

    @Test
    public void InputOutOfRangeShouldRaiseExecptionSecond(){
        assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(-3));
    }

    @Test
    public void InputOutOfRangeShouldRaiseExecption(){
        assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(4000));
    }



    @Test
    public void ValideInputShouldReturnTheRightTerm(){
        assertEquals("X",RomanNumeral.toRoman(10));
    }

}