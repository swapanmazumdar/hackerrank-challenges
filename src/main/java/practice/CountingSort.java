package practice;

/**
 * Counting Sort
 * <p>
 * Consider the data in the range 0 to 9.
 * Input data: 1, 4, 1, 2, 7, 5, 2
 * 1) Take a count array to store the count of each unique object.
 * Index:     0  1  2  3  4  5  6  7  8  9
 * Count:     0  2  2  0   1  1  0  1  0  0
 * <p>
 * 2) Modify the count array such that each element at each index
 * stores the sum of previous counts.
 * Index:     0  1  2  3  4  5  6  7  8  9
 * Count:     0  2  4  4  5  6  6  7  7  7
 * <p>
 * The modified count array indicates the position of each object in
 * the output sequence.
 * <p>
 * 3) Output each object from the input sequence followed by
 * decreasing its count by 1.
 * Process the input data: 1, 4, 1, 2, 7, 5, 2. Position of 1 is 2.
 * Put data 1 at index 2 in output. Decrease count by 1 to place
 * next data 1 at an index 1 smaller than this index.
 */

import java.util.stream.IntStream;

public class CountingSort {

    static int[] sort(int arr[]) {
        int n = arr.length;
        int output[] = new int[n]; // output array
        int count[] = new int[256];

        for (int i = 0; i < n; ++i)
            ++count[arr[i]]; // store count of each element

        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1]; // sum of previous count

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i]; // build output array
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i)
            arr[i] = output[i]; // copy sorted elements
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 1, 2, 7, 5, 2};
        IntStream.of(sort(arr)).forEach(System.out::println);
    }
}
