import java.util.HashSet;
import java.util.Set;

/**
 * Sock Merchant
 * Problem: John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an
 * array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * <p>
 * For example, there are n = 7 socks with colors arr = [1, 2, 1, 2, 1, 3, 2]. There is one pair of color 1 and one of
 * color 2. There are three odd socks left, one of each color. The number of pairs is 2.
 */
public class SockMerchant_Solution {

    /**
     * Complete the sockMerchant function in the editor below. It must return an integer representing the number of
     * matching pairs of socks that are available.
     * <p>
     * sockMerchant has the following parameter(s):
     * <p>
     * n: the number of socks in the pile
     * ar: the colors of each sock
     */
    static int sockMerchant(int n, int[] arr) {
        int pairs = 0;
        Set<Integer> colors = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int arrItem = arr[i];
            if (!colors.contains(arrItem)) {
                colors.add(arrItem);
            } else {
                ++pairs;
                colors.remove(arrItem);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(7, new int[]{1, 2, 1, 2, 1, 3, 2}));
        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}

