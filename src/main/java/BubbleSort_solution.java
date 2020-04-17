import java.util.stream.IntStream;

public class BubbleSort_solution {

    public int[] bubbleSort(int[] arr) {
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) { // don't go past the last index
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false; // there was a swap so the array might be unsorted
                }
            }
            lastUnsorted--;
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort_solution bubbleSort_solution = new BubbleSort_solution();
        IntStream.of(bubbleSort_solution.bubbleSort(new int[]{3, 2, 1})).forEach(System.out::print);
        System.out.println();
        IntStream.of(bubbleSort_solution.bubbleSort(new int[]{32, 43, 17, 1, 49, 40, 5, 30, 19, 4, 42, 45, 29, 14, 3,
                36, 6, 37, 35, 15, 10, 7, 22, 34, 33, 9, 2, 12, 38, 25, 13, 28, 21, 24, 41, 8, 11, 16, 31, 39, 46, 20,
                23, 26, 27, 44, 18, 47, 50, 48})).forEach(System.out::print);
    }
}
