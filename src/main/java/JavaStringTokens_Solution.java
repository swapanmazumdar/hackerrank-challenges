/**
 * Java String Tokens
 * <p>
 * Problem: Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We
 * define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed
 * by each token on a new line.
 */
public class JavaStringTokens_Solution {

    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he.";
        String[] items = s.trim().split("[ !,?\\._'@]+");

        if (s == null || s.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(items.length);
        }

        for (String item : items) {
            System.out.println(item);
        }
    }
}

