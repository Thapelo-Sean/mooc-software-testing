package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsTest {

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, result = {3}")
    @CsvSource({"1,2,10,0", "5,2,11,1", "1,1,12,-1", "1,1,13,-1"})
    public void totalOfBagsTooBig(int small, int big, int total, int expectedResult){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "sm   all = {0}, big = {1}, total = {2}, result = {3}")
    @CsvSource({"5,1,5,0", "5,2,10,0", "5,0,10,-1", "5,1,10,5"})
    public void bigBarsOnly(int small, int big, int total, int expectedResult){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, result = {3}")
    @CsvSource({"1,1,5,0", "1,1,6,1", "0,1,6,-1", "2,2,12,2"})
    public void smallAndBigBars(int small, int big, int total, int expectedResult){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, result = {3}")
    @CsvSource({"0,0,1,-1", "1,1,2,-1", "2,1,2,2", "4,1,3,3"})
    public void smallBarsOnly(int small, int big, int total, int expectedResult){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
}
