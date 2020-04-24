package practice;

/**
 * Algorithmic Thinking: Peak Finding
 * <p>
 * Peak Finder
 */
public class PeakFinder {

    /**
     * One-dimensional version
     * Position 2 is a peak if and only if b >= a and b <= c. Position 9 is a peak i >= h.
     * <p>
     * ┌───┬───┬───┬───┬───┬───┬───┬───┬───┐
     * │ 0 │ 1 │ 2 │ 3 │ 5 │ 6 │ 7 │ 8 │ 9 │
     * ├───┼───┼───┼───┼───┼───┼───┼───┼───┤
     * │ a │ b │ c │ d │ e │ f │ g │ h │ i │
     * └───┴───┴───┴───┴───┴───┴───┴───┴───┘
     */
    static int findPeak_DivideAndConquer(int[] arr) {
        if (arr.length < 2) // need a minimum of 2 elements
            return -1;
        int n = arr.length;
        if (arr[n - 1] > arr[n - 2]) // position n (last mumber) is a peak if it is >= n - 1
            return n - 1;

        int i = n / 2;
        int j = n / 2;
        while (i >= 0 || j <= n) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i; // found it
            }
            if (arr[j] > arr[j - 1] && arr[j] > arr[j + 1]) {
                return j; // found it
            }
            i--;
            j++;
        }
        return -1; // didn't find it
    }

    /**
     * O(n) complexity in worst case.
     * Look at n/2 elements on average, could look at n elements in the worst case.
     */
    static int findPeak_StraightForwardAlgorithm(int[] arr) {
        if (arr.length < 2) // need a minimum of 2 elements
            return -1;
        int i = 1;
        int j = arr.length - 1;
        if (arr[j] > arr[j - 1]) // position n (last mumber) is a peak if it is >= n - 1
            return j; // found it
        while (i != j) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i; // found it
            } else if (arr[j] > arr[j - 1] && arr[j] > arr[j + 1]) {
                return j; // found it
            }
            i++;
            j--;
        }
        return -1; // didn't find it
    }

    public static void main(String[] args) {
        System.out.println(findPeak_StraightForwardAlgorithm(new int[]{9, 7, 4, 0, 2, 3, 6, 5}));
        System.out.println(findPeak_StraightForwardAlgorithm(new int[]{0}));
        System.out.println(findPeak_StraightForwardAlgorithm(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        System.out.println(findPeak_DivideAndConquer(new int[]{9, 7, 4, 0, 2, 3, 6, 5}));
        System.out.println(findPeak_DivideAndConquer(new int[]{0}));
        System.out.println(findPeak_DivideAndConquer(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
