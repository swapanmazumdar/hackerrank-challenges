package edu.mit.ocw;

import java.util.Hashtable;

public class Memoized_Fibonacci {

    static Hashtable<Integer, Integer> dictionary = new Hashtable();

    static int fib(int n) {
        int f = 0;
        if (dictionary.get(n) != null) {
            f = dictionary.get(n);
            return f;
        } else if (n <= 2) {
            return 1;
        } else {
            f = fib(n - 1) + fib(n - 2);
            dictionary.put(n, f);
            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
    }
}
