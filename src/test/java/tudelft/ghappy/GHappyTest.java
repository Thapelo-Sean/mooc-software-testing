package tudelft.ghappy;

import org.jugit nit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void noGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxxxxx");
        Assertions.assertEquals(false, input);
    }

    @Test
    public void singleGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxgxxx");
        Assertions.assertEquals(false, input);
    }

    @Test
    public void doubleGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxggxx");
        Assertions.assertEquals(true, input);
    }

    @Test
    public void multipleGcharacters(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxggyyggxx");
        Assertions.assertEquals(true, input);
    }

    @Test
    public void separatedGcharacters(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxggyygxx");
        Assertions.assertEquals(false, input);
    }

    @Test
    public void onlyGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("gggggg");
        Assertions.assertEquals(true, input);
    }
}