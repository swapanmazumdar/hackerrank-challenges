/**
 * Sorting: Bubble Sort
 * Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted,
 * print the following three lines:
 * <p>
 * Array is sorted in numSwaps swaps., where numSwaps is the number of swaps that took place.
 * First Element: firstElement, where firstElement is the first element in the sorted array.
 * Last Element: lastElement, where lastElement is the last element in the sorted array.
 */
public class Sorting_BubbleSort_Solution {

    static void countSwaps(int[] arr) {
        int swaps = 0;
        int unsortedLen = arr.length - 1;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < unsortedLen; i++) {
                if (arr[i] > arr[i + 1]) {
                    swaps += swap(arr, i, i + 1);
                    isSorted = false;
                }

            }
            unsortedLen--;
        }
        System.out.printf("Array is sorted in %d swaps.%n", swaps);
        System.out.printf("First Element: %d%n", arr[0]);
        System.out.printf("Last Element: %d%n", arr[arr.length - 1]);
    }

    static int swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return 1;
    }

    public static void main(String[] args) {
        countSwaps(new int[]{3, 2, 1});
        countSwaps(new int[]{1, 2, 3});
    }
}