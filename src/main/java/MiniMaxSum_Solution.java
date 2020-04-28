import java.util.Arrays;

/**
 * Mini-Max Sum
 * <p>
 * Problem: Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
 * four of the five integers. Then print the respective minimum and maximum values as a single line of two
 * space-separated long integers.
 */
public class MiniMaxSum_Solution {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0, maxSum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            minSum += arr[i];
            maxSum += arr[i];
        }
        minSum += arr[0];
        maxSum += arr[arr.length - 1];
        System.out.print(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        miniMaxSum(new int[]{1, 3, 5, 7, 9});
    }
}
