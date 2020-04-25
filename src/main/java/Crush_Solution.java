/**
 * Array Manipulation
 * Problem: Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of
 * the array element between two given indices, inclusive. Once all operations have been performed, return the maximum
 * value in your array.
 */
public class Crush_Solution {

    static long arrayManipulation(int n, int[][] queries) {
        int result = 0;
        int[] arr = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int j = 0;
            int indexI = queries[i][j++] - 1;
            int indexJ = queries[i][j++] - 1;
            int value = queries[i][j];

            for (int k = indexI; k <= indexJ; k++) {
                arr[k] += value;
                result = arr[k] > result ? arr[k] : result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(arrayManipulation(10, new int[][]{{1, 5, 3}, {4, 8, 7}, {6, 9, 1}}));
        System.out.println(arrayManipulation(5, new int[][]{{1, 2, 100}, {2, 5, 100}, {3, 4, 100}}));
    }
}

