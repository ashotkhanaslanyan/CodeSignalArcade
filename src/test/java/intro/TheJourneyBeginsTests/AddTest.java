package intro.TheJourneyBeginsTests;

import static org.junit.Assert.*;
import org.junit.Test;

import intro.TheJourneyBegins.Add;

// Tests for Add

public class AddTest {

    @Test
    public void testPositiveNumbers() {
        int result = Add.solution(2, 3);
        System.out.println(STR."Test Positive Numbers: Expected = 5, Actual = \{result}");
        assertEquals("Positive numbers addition failed", 5, result);
    }

    @Test
    public void testNegativeNumbers() {
        int result = Add.solution(-2, -3);
        System.out.println(STR."Test Negative Numbers: Expected = -5, Actual = \{result}");
        assertEquals("Negative numbers addition failed", -5, result);
    }

    @Test
    public void testMixedNumbers() {
        int result = Add.solution(-2, 2);
        System.out.println(STR."Test Mixed Numbers: Expected = 0, Actual = \{result}");
        assertEquals("Mixed numbers addition failed", 0, result);
    }

    @Test
    public void testZero() {
        int result = Add.solution(0, 0);
        System.out.println(STR."Test Zero: Expected = 0, Actual = \{result}");
        assertEquals("Zero addition failed", 0, result);
    }

    @Test
    public void testLargeNumbers() {
        int maxResult = Add.solution(Integer.MAX_VALUE, 0);
        System.out.println(STR."Test Large Numbers (MAX_VALUE): Expected = \{Integer.MAX_VALUE}, Actual = \{maxResult}");
        assertEquals("Large numbers (MAX_VALUE) addition failed", Integer.MAX_VALUE, maxResult);

        int minResult = Add.solution(Integer.MIN_VALUE, 0);
        System.out.println(STR."Test Large Numbers (MIN_VALUE): Expected = \{Integer.MIN_VALUE}, Actual = \{minResult}");
        assertEquals("Large numbers (MIN_VALUE) addition failed", Integer.MIN_VALUE, minResult);
    }
}