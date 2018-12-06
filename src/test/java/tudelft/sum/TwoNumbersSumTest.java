package tudelft.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    private TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

    @Test
    public void simpleTest() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(1);
        second.add(2);

        List<Integer> result = twoNumbersSum.addTwoNumbers(first, second);
    }

    @Test
    public void simpleTest10() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(9);
        second.add(1);

        List<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        assertEquals(1, (int) result.get(0));
        assertEquals(0, (int) result.get(1));
    }

    @Test
    public void threeDigitTest() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(2);
        first.add(4);
        first.add(3);

        second.add(5);
        second.add(6);
        second.add(4);

        List<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        assertEquals(8, (int) result.get(0));
        assertEquals(0, (int) result.get(1));
        assertEquals(7, (int) result.get(2));
    }

    @Test
    public void threeDigitTestLastTwoDigitEqualsTen() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(2);
        first.add(4);
        first.add(3);

        second.add(5);
        second.add(6);
        second.add(7);

        List<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        assertEquals(8, (int) result.get(0));
        assertEquals(1, (int) result.get(1));
        assertEquals(0, (int) result.get(2));
    }

    @Test
    public void threeDigitTestFirstDigitEqualsTen() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(2);
        first.add(4);
        first.add(1);

        second.add(8);
        second.add(6);
        second.add(2);

        List<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        assertEquals(1, (int) result.get(0));
        assertEquals(1, (int) result.get(1));
        assertEquals(0, (int) result.get(2));
        assertEquals(3, (int) result.get(3));
    }

    @Test
    public void threeDigitTestFirstAndLastDigitEqualsTen() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(2);
        first.add(4);
        first.add(8);

        second.add(8);
        second.add(6);
        second.add(2);

        List<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        assertEquals(1, (int) result.get(0));
        assertEquals(1, (int) result.get(1));
        assertEquals(1, (int) result.get(2));
        assertEquals(0, (int) result.get(3));
    }

}
