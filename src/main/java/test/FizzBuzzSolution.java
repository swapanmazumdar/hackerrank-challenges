package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given a number n, for each integer iin the range from 1 to n inclusive, print one value per line as follows:
 * <p>
 * If i is a multiple of both and 5, print FizzBuzz.
 * <p>
 * If i is a multiple of 3 (but not 5), print Fizz.
 * <p>
 * If i is a multiple of 5 (but not 3), print Buzz.
 * <p>
 * If i is not a multiple of 3 or 5, print the value of i.
 * <p>
 * Function Description
 * <p>
 * Complete the function fizzBuzz in the editor below.
 * <p>
 * fizzBuzz has the following parameter(s):
 * <p>
 * int n: upper limit of values to test (inclusive)
 * <p>
 * Returns: NONE
 * <p>
 * Prints:
 * <p>
 * The function must print the appropriate response for each value i in the set (1, 2 n in ascending order, each on a
 * separate line.
 * <p>
 * Constraints
 * <p>
 * 0<n<2x 105
 */
class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void fizzBuzz(int i) {
        // Write your code here
        for (int n = 1; n <= i; n++) {
            if (n % 3 == 0 && n % 5 != 0) {
                System.out.println("Fizz");
            }
            if (n % 3 != 0 && n % 5 == 0) {
                System.out.println("Buzz");
            }
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (n % 3 != 0 && n % 5 != 0) {
                System.out.println(n);
            }
        }
    }

}

public class FizzBuzzSolution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }

}
