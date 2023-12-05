package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void playersGoTooHigh(){
        int result = new BlackJack().play(23,22);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void playersGoSameScore(){
        int result = new BlackJack().play(21,21);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void leftPlayerWins(){
        int result = new BlackJack().play(20,2);
        Assertions.assertEquals(20, result);
    }


}
