import java.util.stream.IntStream;

/**
 * Arrays - DS
 * <p>
 * Problem: An array is a type of data structure that stores elements of the same type in a contiguous block of memory.
 * In an array, A, of size N, each memory location has some unique index, i (where 0 <= i < N), that can be referenced
 * as A[i].
 * <p>
 * Given an array, A, of N integers, print each element in reverse order as a single line of space-separated integers.
 */
public class ArraysDS_Solution {

    static int[] reverseArray(int[] a) {
        int len = a.length;
        int[] arr = new int[len];
        for (int i = len - 1, j = 0; i >= 0; i--, j++) {
            arr[j] = a[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        IntStream.of(reverseArray(new int[]{})).forEach(System.out::print);
        IntStream.of(reverseArray(new int[]{1, 4, 3, 2})).forEach(System.out::print);
    }
}
