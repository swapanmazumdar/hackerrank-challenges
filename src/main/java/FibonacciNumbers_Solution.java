import java.util.Scanner;

/**
 * Problem: The Fibonacci Sequence
 * <p>
 * The Fibonacci sequence begins with fibonacci(0) and fibonacci(1) as its first and second terms. After these first
 * two elements, each subsequent element is equal to the sum of the previous two elements.
 * <p>
 * Complete the recursive function fibonacci in the editor below. It must return the  element in the Fibonacci sequence.
 * <p>
 * fibonacci has the following parameter(s):
 * n: the integer index of the sequence to return
 */
public class FibonacciNumbers_Solution {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}