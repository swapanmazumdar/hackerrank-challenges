/**
 * Divisible Sum Pairs
 * <p>
 * Problem: You are given an array of n integers, ar = [ar[0], ar[1],..., ar[n - 1]] and a positive integer, k. Find and
 * print the number of (i, j) pairs where i < j and ar[i] + ar[j] is divisible by k.
 * <p>
 * For example, ar = [1, 2, 3, 4, 5, 6] and k = 5. Our three pairs meeting the criteria are [1, 4], [2, 3] and [4, 6].
 * <p>
 * Time Complexity: O(n square)
 */
public class DivisibleSumPairs_Solution {

    /**
     * Return the integer count of pairs meeting the criteria.
     */
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 5, new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }
}
