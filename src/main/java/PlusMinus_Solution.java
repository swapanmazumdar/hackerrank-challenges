/**
 * Plus Minus
 * <p>
 * Problem: Given an array of integers, calculate the fractions of its elements that are positive, negative, and are
 * zeros. Print the decimal value of each fraction on a new line.
 */
public class PlusMinus_Solution {

    static void plusMinus(int[] arr) {
        float countZero = 0, countPositive = 0, countNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else if (arr[i] > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        System.out.println(countPositive / arr.length);
        System.out.println(countNegative / arr.length);
        System.out.println(countZero / arr.length);
    }

    public static void main(String[] args) {
        plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
    }
}
