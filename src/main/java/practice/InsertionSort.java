package practice;

import java.util.stream.IntStream;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        int currInd;
        for (int pos = 1; pos < arr.length; pos++) {
            currInd = pos;
            while (currInd > 0 && arr[currInd] < arr[currInd - 1]) {
                swap(arr, currInd, currInd - 1);
                currInd--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int indexMin, int indexMax) {
        int temp = arr[indexMin];
        arr[indexMin] = arr[indexMax];
        arr[indexMax] = temp;
    }

    public static void main(String[] args) {
        IntStream.of(InsertionSort.sort(new int[]{5, 2, 4, 6, 1, 3})).forEach(System.out::println);
    }
}
