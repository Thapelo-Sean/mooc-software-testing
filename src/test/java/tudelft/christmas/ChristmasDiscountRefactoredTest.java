package tudelft.christmas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ChristmasDiscountRefactoredTest {

    @Test
    public void christmas() {
        Clock clock = Mockito.mock(Clock.class);
        Calendar christmas = new GregorianCalendar(2015, Calendar.DECEMBER, 25);
        Mockito.when(clock.now()).thenReturn(christmas);
        double finalValue = new ChristmasDiscountRefactored(clock).applyDiscount(100.0);
        Assertions.assertEquals(85.0, finalValue, 0.0001);
    }

    @Test
    public void christmasWithNumberZeroAmount()
    {
        Clock clock = Mockito.mock(Clock.class);
        Calendar christmas = new GregorianCalendar(2023, Calendar.DECEMBER,25);
        Mockito.when(clock.now()).thenReturn(christmas);
        double finalValue = new ChristmasDiscountRefactored(clock).applyDiscount(0);
        Assertions.assertEquals(0, finalValue, 0.0001);
    }

    @Test
    public void christmasWithNegativeValue(){
        Clock clock = Mockito.mock(Clock.class);
        Calendar christmas = new GregorianCalendar(2021,Calendar.DECEMBER,25);
        Mockito.when(clock.now()).thenReturn(christmas);
        double finalValue = new ChristmasDiscountRefactored(clock).applyDiscount(-1);
        Assertions.assertEquals(-1, finalValue, 1);
    }
    @Test
    public void notChristmas() {
        Clock clock = Mockito.mock(Clock.class);
        Calendar christmas = new GregorianCalendar(2015, Calendar.JANUARY, 25);
        Mockito.when(clock.now()).thenReturn(christmas);
        double finalValue = new ChristmasDiscountRefactored(clock).applyDiscount(100.0);
        Assertions.assertEquals(100.0, finalValue, 0.0001);
    }

    @Test
    public void notChristmasWithNumberZero(){
        Clock clock = Mockito.mock(Clock.class);
        Calendar christmas = new GregorianCalendar(2013, Calendar.JUNE, 23);
        Mockito.when(clock.now()).thenReturn(christmas);
        double finalValue = new ChristmasDiscountRefactored(clock).applyDiscount(0);
        Assertions.assertEquals(0,finalValue, 0.0001 );
    }
}
