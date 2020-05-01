import java.util.HashMap;
import java.util.Set;

/**
 * Java Anagrams
 * <p>
 * Problem: Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 * <p>
 * Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print
 * "Not Anagrams" instead.
 */
public class JavaAnagrams_Solution {

    static boolean isAnagram(String a, String b) {
        HashMap<String, Integer> aMap = new HashMap<>();
        HashMap<String, Integer> bMap = new HashMap<>();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        for (int i = 0; i < aChars.length; i++) {
            String key = String.valueOf(aChars[i]).toUpperCase();
            if (aMap.get(key) != null) {
                aMap.put(key, Integer.valueOf(aMap.get(key)) + 1);
            } else {
                aMap.put(key, 1);
            }
        }

        for (int i = 0; i < bChars.length; i++) {
            String key = String.valueOf(bChars[i]).toUpperCase();
            if (bMap.get(key) != null) {
                bMap.put(key, Integer.valueOf(bMap.get(key)) + 1);
            } else {
                bMap.put(key, 1);
            }
        }

        Set<String> akeys = aMap.keySet();
        Set<String> bkeys = bMap.keySet();
        if (bkeys.size() != akeys.size()) {
            return false;
        }
        for (String key : akeys) {
            if (aMap.get(key.toUpperCase()) != bMap.get(key.toUpperCase())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((isAnagram("anagram", "margana")) ? "Anagrams" : "Not Anagrams");
        System.out.println((isAnagram("Hello", "hello")) ? "Anagrams" : "Not Anagrams");
        System.out.println((isAnagram("anagramm", "marganaa")) ? "Anagrams" : "Not Anagrams");
        System.out.println((isAnagram("ab", "abXY")) ? "Anagrams" : "Not Anagrams");
    }
}
