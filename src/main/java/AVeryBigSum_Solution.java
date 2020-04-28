import java.util.stream.LongStream;

/**
 * A Very Big Sum
 * <p>
 * problem: Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be
 * quite large.
 */
public class AVeryBigSum_Solution {

    static long aVeryBigSum(long[] ar) {
        return LongStream.of(ar).reduce(0, Long::sum);
    }

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005}));
    }
}
