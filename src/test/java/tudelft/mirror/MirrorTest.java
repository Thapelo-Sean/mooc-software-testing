package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorWithEmptyString(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void mirrorWithSingleLetterOutput(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("reddar");
        Assertions.assertEquals("r",result);
    }

    @Test
    public void mirrorWithDoubleLetterOutput(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("deffied");
        Assertions.assertEquals("de",result);
    }

    @Test
    public void mirrorWithTripleLetterOutput(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("spoops");
        Assertions.assertEquals("spo", result);
    }
     @Test
    public void mirrorWithUnmatchedLetters(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abccbd");
        Assertions.assertEquals("", result);
    }
}
