import java.util.stream.IntStream;

/**
 * Simple Array Sum
 * <p>
 * Problem: Given an array of integers, find the sum of its elements.
 * <p>
 * For example, if the array , , so return .
 */
public class SimpleArraySum_Solution {

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    static int simpleArraySumUsingStream(int[] ar) {
        return IntStream.of(ar).sum();
    }

    public static void main(String[] args) {
        System.out.println(simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}));
        System.out.println(simpleArraySumUsingStream(new int[]{1, 2, 3, 4, 10, 11}));
    }
}
