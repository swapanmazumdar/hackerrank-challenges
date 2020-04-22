import java.io.IOException;
import java.util.Arrays;

/**
 * Problem:
 * <p>
 * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There
 * are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to
 * spend, and he wants to maximize the number of toys he buys with this money.
 * <p>
 * Function Description:
 * <p>
 * Complete the function maximumToys in the editor below. It should return an integer representing the maximum number
 * of toys Mark can purchase. maximumToys has the following parameter(s):
 * <p>
 * prices: an array of integers representing toy prices
 * k: an integer, Mark's budget
 */
public class MarkAndToys_Solution {

    // Complete the maximumToys function below.
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

    public static void main(String[] args) throws IOException {
        int k = 7;
        int n = 4;
        int[] prices = new int[n];
        String[] pricesItems = "1 2 3 4".split(" ");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        System.out.println(result);
    }
}

