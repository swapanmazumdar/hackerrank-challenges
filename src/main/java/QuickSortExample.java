import java.util.stream.IntStream;

public class QuickSortExample {

    public void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private void quicksort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quicksort(arr, left, index - 1);
        quicksort(arr, index, right);
    }

    private int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 6, 3, 1, 5, 7, 2, 4, 9};
        QuickSortExample quickSortExample = new QuickSortExample();
        quickSortExample.quicksort(arr);
        IntStream.of(arr).forEach(System.out::println);
    }
}
