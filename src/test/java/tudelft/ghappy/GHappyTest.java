package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void noGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxyyxxyy");
        Assertions.assertFalse(input);
    }

    @Test
    public void singleGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxgxxx");
        Assertions.assertFalse(input);
    }

    @Test
    public void doubleGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxggxx");
        Assertions.assertTrue(input);
    }

    @Test
    public void multipleGcharacters(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxggyyggxx");
        Assertions.assertTrue(input);
    }

    @Test
    public void separatedGcharacters(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("xxggyygxx");
        Assertions.assertFalse(input);
    }

    @Test
    public void onlyGcharacter(){
        GHappy gHappy = new GHappy();
        boolean input = gHappy.gHappy("gggggg");
        Assertions.assertTrue(input);
    }
}