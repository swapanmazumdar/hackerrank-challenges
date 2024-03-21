import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWord_Solution {

    public static void main(String[] args) {
        String regex = "";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        String input = "Goodbye bye bye world world world";

        Matcher m = p.matcher(input);
        while (m.find()) {
            input = input.replaceAll("", "");
        }
        // Prints the modified sentence.
        System.out.println(input);
    }
}
