package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithDoubleDigits(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XCIX");
        Assertions.assertEquals(99,result);
    }

    @Test
    public void numberWithTripleDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("C");
        Assertions.assertEquals(100, result);
    }

    @Test
    public void numberWithFourDigits(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MMMMMMMMMCMXCIX");
        Assertions.assertEquals(9999, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void invalidNumbers() {
        RomanNumeral roman = new RomanNumeral();
        Integer result = roman.convert("IXO"); //Invalid number
        Assertions.assertEquals(0, result);
    }
}