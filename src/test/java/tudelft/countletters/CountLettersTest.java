package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void twoMatchingWords(){
        int words = new CountLetters().count("programmer | programs");
        Assertions.assertEquals(2,words);
    }

    @Test
    public void mismatchedLastWord(){
        int words = new CountLetters().count("languages | java");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void mismatchedWords(){
        int words = new CountLetters().count("javascript | main");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void mismatchedFirstWord(){
        int words = new CountLetters().count("maven | regex");
        Assertions.assertEquals(1, words);
    }
}