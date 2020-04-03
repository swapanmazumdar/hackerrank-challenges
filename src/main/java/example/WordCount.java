package example;// Include program imports here

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    private static Pattern pattern;

    public static void main(String[] args) throws IOException {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        // Get user input for filename and word
        String fileName = scanner.nextLine();
        // Search for word and output the results
        String word = scanner.nextLine();
        pattern = Pattern.compile("\\b(" + word + ")\\b");
        String contents = readFile(fileName);
        System.out.println(contents);
        wordCount(contents, word);
    }

    public static String readFile(String filename) throws IOException {
        InputStreamReader reader = new InputStreamReader(WordCount.class.getResourceAsStream("/" + filename));
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        int i;
        while ((i = bufferedReader.read()) != -1) {
            builder.append((char) i);
        }
        // Read the file contents and return a String
        return builder.toString(); // You will need to update the return value
    }

    /**
     * Return the number of times the provided word appears in the given text
     */
    public static int wordCount(String contents, String word) {

        StringTokenizer stringTokenizer = new StringTokenizer(contents);
        Matcher matcher = pattern.matcher(word);
        boolean matches = matcher.matches();
        int groupCount = matcher.groupCount();

        int count = groupCount + 1;
        System.out.printf("%s occurred %d time(s)", word, count);

        return count;
    }
}

