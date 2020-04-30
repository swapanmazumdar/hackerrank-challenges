import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tag Content Extractor
 * <p>
 * Problem: In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like
 * <tag>contents</tag>. Note that the corresponding end tag starts with a /.
 * <p>
 * Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences
 * of well-organized tags meeting the following criterion:
 * <p>
 * The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text
 * starts with an h1 tag and ends with a non-matching h2 tag.
 * <p>
 * Tags can be nested, but content between nested tags is considered not valid. For example, in
 * <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
 * <p>
 * Tags can consist of any printable characters.
 */
public class TagContentExtractor_Solution {

    /**
     * Complexity is O(n) i.e. size of the String
     */
    static void parseText(String text) {
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = false;

        while (matcher.find()) {
            System.out.println(matcher.group(2));
            matchFound = true;
        }
        if (!matchFound) {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        parseText("<h1>Nayeem loves counseling</h1>");
        parseText("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
        parseText("<Amee>safat codes like a ninja</amee>");
        parseText("<SA premium>Imtiaz has a secret crush</SA premium>");
    }
}




