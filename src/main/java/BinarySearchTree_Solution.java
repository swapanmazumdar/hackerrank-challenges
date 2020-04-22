import java.util.Arrays;

public class BinarySearchTree_Solution {

    /**
     * Recursively Searches the specified array of ints for the specified value using the binary search algorithm.
     * The array must be sorted prior to making this call.  If it is not sorted, the results are undefined.  If the
     * array contains multiple elements with the specified value, there is no guarantee which one will be found.
     */
    public boolean binarySearchRecursive(int[] arr, int key) {
        int n = arr.length;
        int mid = n / 2;

        if (mid == 0) {
            return arr[0] == key ? true : false;
        } else if (key < arr[mid]) {
            int[] left = new int[mid];
            int[] leftArr = Arrays.copyOfRange(arr, 0, n / 2);
            return binarySearchRecursive(leftArr, key);
        } else {
            int[] right = new int[n - mid];
            int[] rightArray = Arrays.copyOfRange(arr, n / 2, n);
            return binarySearchRecursive(rightArray, key);
        }
    }

    public boolean binarySearchIterative(int[] arr, int key) {
        int n = arr.length;
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + right / 2;
            if (arr[mid] == key) {
                return true;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = right - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 9, 3, 7, 6, 8, 4, 5};
        Arrays.sort(arr);
        BinarySearchTree_Solution binarySearch_Tree_solution = new BinarySearchTree_Solution();
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, -1));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 0));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 1));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 2));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 5));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 9));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 10));

        System.out.println(binarySearch_Tree_solution.binarySearchIterative(arr, -1));
        System.out.println(binarySearch_Tree_solution.binarySearchIterative(arr, 0));
        System.out.println(binarySearch_Tree_solution.binarySearchIterative(arr, 1));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 2));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 5));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 9));
        System.out.println(binarySearch_Tree_solution.binarySearchRecursive(arr, 10));


    }
}
