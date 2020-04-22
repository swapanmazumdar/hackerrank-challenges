public class Sorting_BubbleSort_Solution {

    // Complete the countSwaps function below.
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
        //IntStream.of(arr).forEach(System.out::println);
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
        int n = 3;
        int[] a = new int[n];

        String[] aItems = "3 2 1".split(" ");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);
    }
}