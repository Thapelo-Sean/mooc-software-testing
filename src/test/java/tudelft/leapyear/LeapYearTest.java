package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    boolean result;

    @Test
    public void leapYearThatIsNonCenturial(){
        LeapYear ly = new LeapYear();
        //boolean result = ly.isLeapYear(2020);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYear(){
        LeapYear ly = new LeapYear();
        boolean result = ly.isLeapYear(2000);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
}
