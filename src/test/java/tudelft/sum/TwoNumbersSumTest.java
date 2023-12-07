package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void addTwoNumbers(){
        TwoNumbersSum tns = new TwoNumbersSum();

        ArrayList <Integer> firstResult = tns.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1,5)),
                new ArrayList<>(Arrays.asList(0,1)));
        Assertions.assertEquals(Arrays.asList(1,6), firstResult);
        System.out.println(firstResult);
    }

    @Test
    void testAddThreeNumbers() {
        TwoNumbersSum tns = new TwoNumbersSum();

        ArrayList<Integer> secondResult = tns.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9,9,8)),
                new ArrayList<>(Arrays.asList(0,0,1)));
        Assertions.assertEquals(Arrays.asList(9,9,9), secondResult);
        System.out.println(secondResult);
    }

    @Test
    void addTwoNumbers_WithCarry() {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        ArrayList<Integer> thirdResult = twoNumbersSum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1,0,0,0)),
                new ArrayList<>(Arrays.asList(0,0,0,1)));
        Assertions.assertEquals(Arrays.asList(1,0,0,1), thirdResult);
    }

    @Test
    void addTwoNumbers_DifferentLengths() {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        ArrayList<Integer> fourthResult = twoNumbersSum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(2,0,0)),
                new ArrayList<>(Arrays.asList(1,0)));
        Assertions.assertEquals(Arrays.asList(2,1,0), fourthResult);
    }

    @Test
    void addTwoNumbersWithEmptyList() {
        TwoNumbersSum tns = new TwoNumbersSum();

        ArrayList<Integer> fifthResult = tns.addTwoNumbers(
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(1,0)));
        Assertions.assertEquals(Arrays.asList(1,0), fifthResult);
    }

    @Test
    void addTwoNumbersWithNegativeValues() {
        TwoNumbersSum tns = new TwoNumbersSum();

        ArrayList<Integer> sixthResult = tns.addTwoNumbers(
                new ArrayList<>(Arrays.asList(-5,0)),
                new ArrayList<>(Arrays.asList(-1,0)));
        Assertions.assertEquals(Arrays.asList(-6,0), sixthResult);
        System.out.println(sixthResult);
    }
}