/**
 * Problem: Alice wrote a sequence of words in CamelCase as a string of letters, s, having the following properties:
 * <p>
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given s, print the number of words in  on a new line.
 * <p>
 * For example, s = oneTwoThree. There are  words in the string.
 */
public class Camelcase_Solution {

    static int camelcase(String s) {
        return s.split("[A-Z]").length;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThree"));
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
