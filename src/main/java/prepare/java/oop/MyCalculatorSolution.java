package prepare.java.oop;

public class MyCalculatorSolution {

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.divisor_sum(6));
    }
}

class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        int result = 0;
        System.out.println(n);
        int sqrt = (int) Math.floor(Math.sqrt(n));
        System.out.println(sqrt);
        for (int i = 1; i <= sqrt; i++) {
            if(n % i == 0) {
                result += i + n/i;
            }
        }
        return result;
    }
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}