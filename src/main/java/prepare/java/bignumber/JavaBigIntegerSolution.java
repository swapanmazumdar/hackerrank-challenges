package prepare.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigIntegerSolution { // rename this class to Solution
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputA = scanner.nextLine();
        String inputB = scanner.next();
        BigInteger a = new BigInteger(inputA);
        BigInteger b = new BigInteger(inputB);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
