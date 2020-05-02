/**
 * Java String Reverse
 * <p>
 * Problem: A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or
 * forward.(Wikipedia)
 * <p>
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 */
public class JavaStringReverse_Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("aabbbbaa"));
    }

    static String isPalindrome(String str) {
        if (str.length() == 0) return "No";
        int len = str.length();
        int i = 0, j = 0;
        if (len % 2 == 0) {
            j = len - 1;
        } else { // split the string into 2
            j = len - 1;
        }
        char[] chars = str.toCharArray();
        while (i < j) {
            if (chars[i++] != chars[j--]) {
                return "No";
            }
        }
        return "Yes";
    }
}



