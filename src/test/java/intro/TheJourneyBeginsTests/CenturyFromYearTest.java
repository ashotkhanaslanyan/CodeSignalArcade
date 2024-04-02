package intro.TheJourneyBeginsTests;

import static org.junit.Assert.*;
import org.junit.Test;

import intro.TheJourneyBegins.CenturyFromYear;

// Tests for CenturyFromYear

public class CenturyFromYearTest {

    @Test
    public void testStartOfCentury() {
        int year = 1901;
        int result = CenturyFromYear.solution(year);
        System.out.println(STR."Test Start of Century: Year = \{year}, Expected Century = 20, Actual Century = \{result}");
        assertEquals("Calculating century at the start of 20th century failed", 20, result);
    }

    @Test
    public void testEndOfCentury() {
        int year = 2000;
        int result = CenturyFromYear.solution(year);
        System.out.println(STR."Test End of Century: Year = \{year}, Expected Century = 20, Actual Century = \{result}");
        assertEquals("Calculating century at the end of 20th century failed", 20, result);
    }

    @Test
    public void testMiddleOfCentury() {
        int year = 1950;
        int result = CenturyFromYear.solution(year);
        System.out.println(STR."Test Middle of Century: Year = \{year}, Expected Century = 20, Actual Century = \{result}");
        assertEquals("Calculating century in the middle of 20th century failed", 20, result);
    }

    @Test
    public void testFirstCentury() {
        int year = 100;
        int result = CenturyFromYear.solution(year);
        System.out.println(STR."Test First Century: Year = \{year}, Expected Century = 1, Actual Century = \{result}");
        assertEquals("Calculating century for the first century failed", 1, result);
    }
}
