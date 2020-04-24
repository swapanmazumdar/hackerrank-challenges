package edu.mit.ocw;

public class BottomUpFibonacci {

    static int fibonacci(int n) {
        int[] fib = new int[n];
        int f = 0;
        for (int k = 0; k < n; k++) {
            if (k == 0) {
                f = 0;
            } else if (k < 2) {
                f = 1;
            } else {
                f = fib[k - 1] + fib[k - 2]; // for array starting with index 1 use f = fib[n - 1] + fib[n - 2]
            }
            fib[k] = f;
        }
        return fib[n - 1]; // for array starting with index 1 use fib[n]
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
    }
}
