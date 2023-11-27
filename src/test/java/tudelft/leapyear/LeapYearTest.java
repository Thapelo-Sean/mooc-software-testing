package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    boolean result;
    LeapYear ly;

    @Test
    public void leapYearThatIsNonCenturial(){
        ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2020));
    }

    @Test
    public void leapCenturialYear(){
        ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYear(){
        ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2023));
    }

    @Test
    public void nonLeapYear()
    {
        ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1900));
    }
}
