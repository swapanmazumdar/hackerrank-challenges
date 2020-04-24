package practice;

public class LinearSearch {

    /**
     * The maximum number of times the for-loop can run is n, and this worst case occurs when the value being search is
     * not found. The worst-case running time of linear search grows like the array size n.
     * <p>
     * The running time is Θ(n). When n gets large enough, the running time is at least k1 . n and at most k2 . n for
     * some constants k1 and k2.
     */
    static int search(int[] arr, int targetValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                return i; // found it
            }
        }
        return -1; // didn't find it
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 0));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 4));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 6));
    }
}
