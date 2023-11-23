package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralTest {
    private RomanNumeral roman = new RomanNumeral();
    @BeforeEach
    public void init(){
        roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithDoubleDigits(){
        int result = roman.convert("XCIX");
        Assertions.assertEquals(99,result);
    }

    @Test
    public void numberWithTripleDigits() {
        int result = roman.convert("C");
        Assertions.assertEquals(100, result);
    }

    @Test
    public void numberWithFourDigits(){
        int result = roman.convert("MMMMMMMMMCMXCIX");
        Assertions.assertEquals(9999, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void invalidNumbers() {
        Integer result = roman.convert("IXO"); //Invalid number
        Assertions.assertEquals(0, result);
    }
}