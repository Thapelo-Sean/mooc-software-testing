package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void positiveShiftMultipleCharacters(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String actualResult = cs.CaesarShiftCipher("abc", 3);
        String expectedResult = "def";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeShiftMultipleCharacters(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String actualResult = cs.CaesarShiftCipher("xyz", -3);
        String expectedResult = "uvw";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveShiftSingleCharacter(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String actualResult = cs.CaesarShiftCipher("a", 1);
        String expectedResult = "b";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeShiftOneCharacter(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String actualResult = cs.CaesarShiftCipher("a", -1);
        String expectedResult = "z";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
