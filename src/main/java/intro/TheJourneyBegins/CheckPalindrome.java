package intro.TheJourneyBegins;

import java.lang.*;

// Given the string, check if it is a palindrome.

public class CheckPalindrome {

    public static boolean solution(String inputString) {
        return inputString.contentEquals(new StringBuilder(inputString).reverse());
    }

    public static void main(String[] args) {
        System.out.println("CheckPalindrome solution");
    }
}
