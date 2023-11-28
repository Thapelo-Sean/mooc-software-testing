package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsTest {

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, result = {3}")
    @CsvSource({"5,3,15,0", "1,5,16,1", "5,1,11,-1", "3,2,15,-1"})
    public void totalOfBagsTooBig(int small, int big, int total, int expectedResult){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, result = {3}")
    @CsvSource({"2,1,8,-1", "1,3,17,-1", "1,1,5,0", "2,3,15,0"})
    public void bigBarsOnly(int small, int big, int total, int expectedResult){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, result = {3}")
    @CsvSource({"0,1,6,-1", "1,2,15,-1", "2,1,7,2," ,"3,2,12,2"})
    public void smallAndBigBars(int small, int big, int total, int expectedResult){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1" })
    public void onlySmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
}
