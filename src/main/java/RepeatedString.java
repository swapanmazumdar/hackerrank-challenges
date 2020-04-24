import java.util.stream.IntStream;

/**
 * Repeated String
 * <p>
 * Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.
 * <p>
 * Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.
 * <p>
 * For example, if the string s = 'abcac' and n = 10, the substring we consider is abcacabcac, the first 10 characters
 * of her infinite string. There are 4 occurrences of a in the substring.
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        int sLen = s.length();

        IntStream characterStream = s.chars();
        long count = characterStream.filter(c -> c == 'a').count();
        int remainder = (int) (n % sLen);
        int remainingCount = 0;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                remainingCount++;
            }
        }
        return n / sLen * count + remainingCount;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 10));
        System.out.println(repeatedString("aba", 10));
    }
}

