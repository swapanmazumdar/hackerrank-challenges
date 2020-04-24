package practice;

public class FibonacciSequence {

    public int fibonacci(int num) {
        int a = 0;
        int b = 1;
        int sum = a + b;
        int c = 0;
        while (c < num) {
            c = a + b;
            if (c % 2 != 0) {
                sum += c;
            }
            a = b;
            b = c;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new FibonacciSequence().fibonacci(10000));
    }

}
