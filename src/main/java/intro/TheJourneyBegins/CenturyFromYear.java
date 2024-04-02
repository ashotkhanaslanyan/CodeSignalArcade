package intro.TheJourneyBegins;

// Given a year, return the century it is in.
// The first century spans from the year 1 up
// to and including the year 100, the second
// from the year 101 up to and including the
// year 200, etc.

public class CenturyFromYear {

    public static int solution(int year) {
        return 1 + (year - 1) / 100;
    }

    public static void main(String[] args) {
        System.out.println("CenturyFromYear solution");
    }
}
