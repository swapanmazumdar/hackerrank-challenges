import java.util.Arrays;

/**
 * Ice Cream Parlor
 * <p>
 * Problem: Sunny and Johnny like to pool their money and go to the ice cream parlor. Johnny never buys the same flavor
 * that Sunny does. The only other rule they have is that they spend all of their money.
 * <p>
 * Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
 * <p>
 * For example, they have m = 6 to spend and there are flavors costing cost = [1, 3, 4, 5, 6]. The two flavors costing 1
 * and 5 meet the criteria. Using 1-based indexing, they are at indices 1 and 4.
 */
public class IcecreamParlor_Solution {

    /**
     * The complexity for this is , which will time out if the data sets are large.
     */
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == m) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Arrays.stream(icecreamParlor(6, new int[]{1, 3, 4, 5, 6})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(icecreamParlor(4, new int[]{1, 4, 5, 3, 2})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(icecreamParlor(4, new int[]{2, 2, 4, 3})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(icecreamParlor(8, new int[]{1, 3, 4, 4, 6, 8})).forEach(System.out::print);
    }
}

