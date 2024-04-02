package intro.EdgeOfTheOceanTests;

import static org.junit.Assert.*;
import org.junit.Test;

import intro.EdgeOfTheOcean.AdjacentElementsProduct;

// Tests for AdjacentElementsProduct

public class AdjacentElementsProductTest {

    @Test
    public void testPositiveNumbers() {
        int[] inputArray = {1, 2, 3, 4};
        int result = AdjacentElementsProduct.solution(inputArray);
        System.out.println(STR."Test Positive Numbers: Expected = 12, Actual = \{result}");
        assertEquals("Max product of positive numbers failed", 12, result);
    }

    @Test
    public void testNegativeNumbers() {
        int[] inputArray = {-1, -2, -3, -4};
        int result = AdjacentElementsProduct.solution(inputArray);
        System.out.println(STR."Test Negative Numbers: Expected = 12, Actual = \{result}");
        assertEquals("Max product of negative numbers failed", 12, result);
    }

    @Test
    public void testMixedNumbers() {
        int[] inputArray = {-1, 2, -3, 4, -5};
        int result = AdjacentElementsProduct.solution(inputArray);
        System.out.println(STR."Test Mixed Numbers: Expected = -2, Actual = \{result}");
        assertEquals("Max product of mixed numbers failed", -2, result);
    }

    @Test
    public void testSingleNegativeMaximum() {
        int[] inputArray = {5, 6, -9, 4, 2};
        int result = AdjacentElementsProduct.solution(inputArray);
        System.out.println(STR."Test Single Negative Maximum: Expected = 30, Actual = \{result}");
        assertEquals("Max product with single negative maximum failed", 30, result);
    }

    @Test
    public void testSmallestArray() {
        int[] inputArray = {2, 5};
        int result = AdjacentElementsProduct.solution(inputArray);
        System.out.println(STR."Test Smallest Array: Expected = 10, Actual = \{result}");
        assertEquals("Max product with smallest array failed", 10, result);
    }
}
