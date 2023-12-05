package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void playersGoTooHigh(){
        int result = new BlackJack().play(23,22);
        Assertions.assertEquals(0, result);
    }
}
