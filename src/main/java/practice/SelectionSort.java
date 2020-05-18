package practice;

import java.util.stream.IntStream;

public class SelectionSort {

    public static int[] sort(int[] arr) {
        int indexMin = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            swap(arr, indexMin, i);
        }
        return arr;
    }

    private static void swap(int[] arr, int indexMin, int i) {
        int temp = arr[indexMin];
        arr[indexMin] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        IntStream.of(SelectionSort.sort(new int[]{23, 78, 45, 8, 32, 56, 1})).forEach(System.out::println);
    }
}
