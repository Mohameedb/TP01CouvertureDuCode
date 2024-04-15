package BranchCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    public void InputOutOfRangeRaiseExecption(){
        assertThrows(IllegalArgumentException.class,()-> RomanNumeral.toRoman(8562));
    }
    @Test
    public void InputOutOfRangeRaiseAnotherException(){
        assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(-53));
    }

    @Test
    public void ValideInputReturnTheRightTerm(){
        assertEquals("VI",RomanNumeral.toRoman(6));
    }

}