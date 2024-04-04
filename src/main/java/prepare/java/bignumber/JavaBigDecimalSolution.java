package prepare.java.bignumber;

import java.math.BigDecimal;
import java.util.*;

/**
 * Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
 * <p>
 * Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must
 * be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed
 * as 0.1. If two numbers represent numerically equivalent values (e.g., .1 ≡ 0.1), then they must be listed in the
 * same order as they were received as input).
 * <p>
 * Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the
 * instructions above.
 *
 * <b>Input Format</b>
 * <p>
 * The first line consists of a single integer, n, denoting the number of integer strings.
 * Each line i of the n subsequent lines contains a real number denoting the value of s<sub>i</sub>.
 *
 * <b>Constraints</b>
 * 1 <= n <= 200
 * Each s<sub>i</sub> has at most 300 digits.
 *
 * <b>Output Format</b>
 * <p>
 * Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering
 * the array's elements.
 */
public class JavaBigDecimalSolution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.stream(s).sorted(Comparator.comparing(BigDecimal::new, Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
