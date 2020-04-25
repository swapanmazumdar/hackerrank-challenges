/**
 * Array Manipulation
 * Problem: Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of
 * the array element between two given indices, inclusive. Once all operations have been performed, return the maximum
 * value in your array.
 */
public class Crush_Solution {

    static long arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int j = 0;
            int lower = queries[i][j++];
            int upper = queries[i][j++];
            int sum = queries[i][j];
            arr[lower - 1] += sum;
            if (upper < n) {
                arr[upper] -= sum;
            }
        }

        long max = 0;
        long temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i];
            if (temp > max) max = temp;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(arrayManipulation(10, new int[][]{{1, 5, 3}, {4, 8, 7}, {6, 9, 1}}));
        System.out.println(arrayManipulation(5, new int[][]{{1, 2, 100}, {2, 5, 100}, {3, 4, 100}}));
    }
}

