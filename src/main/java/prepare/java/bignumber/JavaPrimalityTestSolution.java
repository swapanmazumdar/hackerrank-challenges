package prepare.java.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTestSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bigInteger = new BigInteger(n);
        boolean isProbablePrime = bigInteger.isProbablePrime(1);
        System.out.println(isProbablePrime ? "prime" : "not prime");

        bufferedReader.close();
    }
}
