package intro.TheJourneyBeginsTests;

import static org.junit.Assert.*;
import org.junit.Test;

import intro.TheJourneyBegins.CheckPalindrome;

// Tests for CheckPalindrome

public class CheckPalindromeTest {

    @Test
    public void testSimplePalindrome() {
        boolean result = CheckPalindrome.solution("radar");
        System.out.println(STR."Test Simple Palindrome: Input = radar, Expected = true, Actual = \{result}");
        assertTrue("Simple palindrome test failed", result);
    }

    @Test
    public void testNonPalindrome() {
        boolean result = CheckPalindrome.solution("java");
        System.out.println(STR."Test Non-Palindrome: Input = java, Expected = false, Actual = \{result}");
        assertFalse("Non-palindrome test failed", result);
    }

    @Test
    public void testEmptyString() {
        boolean result = CheckPalindrome.solution("");
        System.out.println(STR."Test Empty String: Input = , Expected = true, Actual = \{result}");
        assertTrue("Empty string test failed", result);
    }

    @Test
    public void testSingleCharacter() {
        boolean result = CheckPalindrome.solution("a");
        System.out.println(STR."Test Single Character: Input = a, Expected = true, Actual = \{result}");
        assertTrue("Single character test failed", result);
    }

    @Test
    public void testMixedCasePalindrome() {
        boolean result = CheckPalindrome.solution("Level");
        System.out.println(STR."Test Mixed Case Palindrome: Input = Level, Expected = false, Actual = \{result}");
        assertFalse("Mixed case palindrome test failed", result);
    }
}
