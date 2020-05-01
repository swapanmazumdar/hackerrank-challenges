import java.util.*;

/**
 * Java Substring Comparisons
 * <p>
 * Problem: We define the following terms:
 * <p>
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
 * A < B <... < Y < Z < a < b <... < y < z
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 * <p>
 * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a,
 * b, c, ab, bc, and abc.
 * Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and
 * largest substrings of length k.
 */
public class JavaStringCompare_Solution {

    /**
     * 'smallest' must be the lexicographically smallest substring of length 'k'
     * 'largest' must be the lexicographically largest substring of length 'k'
     */
    public static String getSmallestAndLargest(String s, int k) {
        char[] chars = s.toCharArray();
        SortedSet<String> words = new TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            words.add(s.substring(i, k + i));
        }
        return words.first() + "\n" + words.last();
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}