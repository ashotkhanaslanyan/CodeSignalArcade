package intro.EdgeOfTheOcean;

import java.util.stream.*;

// Given an array of integers, find the pair
// of adjacent elements that has the largest
// product and return that product.

public class AdjacentElementsProduct {

    public static int solution(int[] inputArray) {
        return IntStream.range(1, inputArray.length)
                .map(i->inputArray[i]*inputArray[i-1])
                .max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println("AdjacentElementsProduct solution");
    }
}
