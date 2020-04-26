/**
 * Left Rotation
 * <p>
 * Problem: A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. For
 * example, if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].
 * <p>
 * Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as
 * a single line of space-separated integers.
 */
public class ArrayLeftRotation_Solution {

    static int[] rotateLeft(int[] array, int shift) {
        int n = array.length;
        int[] copyArray = new int[n];
        for (int i = 0; i < n; i++) {
            copyArray[(i + n - shift) % n] = array[i];
        }
        return copyArray;
    }

    public static void main(String[] args) {
        int[] arr = rotateLeft(new int[]{1, 2, 3, 4, 5}, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
