import java.io.IOException;
import java.util.Scanner;

/**
 * Making Anagrams
 * <p>
 * We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the
 * second string. In other words, both strings must contain the same exact letters in the same exact frequency.
 * For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * <p>
 * Alice is taking a cryptography class and finding anagrams to be very useful. She decides on an encryption scheme
 * involving two large strings where encryption is dependent on the minimum number of character deletions required to
 * make the two strings anagrams. Can you help her find this number?
 * <p>
 * Given two strings, s1 and s2, that may not be of the same length, determine the minimum number of character deletions
 * required to make s1 and s2 anagrams. Any characters can be deleted from either of the strings.
 * <p>
 * For example, s1 = abc and s2 = amnop. The only characters that match are the a's so we have to remove bc from s1 and
 * mnop from s2 for a total of 6 deletions.
 */
public class MakingAnagrams_Solution {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Time complexity: O(n)
     * The rate of increase in time is dependent on the size of n (length of both the strings).
     */
    public static int makeAnagram(String a, String b) {
        int count = 0;
        int[] frequency = new int[57];

        for (char c : a.toCharArray()) {
            ++frequency[c - 'a'];
        }
        for (char c : b.toCharArray()) {
            --frequency[c - 'a'];
        }
        for (int i = 0; i < frequency.length; i++) {
            count += Math.abs(frequency[i]);
        }
        return count;
    }

    public static int bruteForce_MakeAnagram(String str1, String str2) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int index = str2.indexOf(c);
            if (index != -1) {
                str2 = str2.replaceFirst(String.valueOf(c), "");
                stringBuilder.append(c);
            } else {
                ++count;
            }
        }
        return count + str2.length(); // add the count of left over string length
    }

    public static void main(String[] args) throws IOException {
        System.out.println(makeAnagram("cde", "abc"));
    }
}
