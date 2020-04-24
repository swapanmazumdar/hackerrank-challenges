import java.util.Arrays;

/**
 * Mark and Toys
 * <p>
 * Problem:
 * <p>
 * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There
 * are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to
 * spend, and he wants to maximize the number of toys he buys with this money.
 * <p>
 * Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy? For example, if
 * prices = [1, 2, 3, 4] and Mark has k = 7 to spend, he can buy items [1, 2, 3] for 6, or [3, 4] for 7 units of
 * currency. He would choose the first group of 3 items.
 * <p>
 * Function Description:
 * <p>
 */
public class MarkAndToys_Solution {

    /**
     * Complete the function maximumToys in the editor below. It should return an integer representing the maximum number
     * of toys Mark can purchase. maximumToys has the following parameter(s):
     * <p>
     * prices: an array of integers representing toy prices
     * k: an integer, Mark's budget
     */
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int cost = 0;
        int len = prices.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (prices[i] + cost < k) {
                cost += prices[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 2, 3, 4}, 7));
    }
}

