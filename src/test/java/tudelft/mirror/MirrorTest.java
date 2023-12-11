package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

   @ParameterizedTest
    @CsvSource({"abccd", "reddar", "deffied", "spoops", ""})
    public void mirrorTest(String input){
       Mirror mirror = new Mirror();
       String expected = expectedResult(input);
       String result = mirror.mirrorEnds(input);
       Assertions.assertEquals(expected, result);
   }

    private String expectedResult(String input) {
        switch (input) {
            case "reddar":
                return "r";
            case "deffied":
                return "de";
            case "spoops":
                return "spo";
            default:
                return "";
        }
   }
}
