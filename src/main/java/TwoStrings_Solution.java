import java.io.IOException;
import java.util.HashMap;

public class TwoStrings_Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<String, Integer> stringIntegerMap = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            stringIntegerMap.put(String.valueOf(c), i);
        }

        for (int i = 0; i < s1.length(); i++) {
            if (stringIntegerMap.containsKey(String.valueOf(s1.charAt(i))))
                return "YES"; // there appears to be a common string; no need to check further
        }
        return "NO";
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int q = scanner.nextInt();
        int q = 1;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //for (int qItr = 0; qItr < q; qItr++) {
        //    String s1 = scanner.nextLine();
        //    String s2 = scanner.nextLine();

        System.out.println(twoStrings("cat", "dog"));
        System.out.println(twoStrings("hello", "world"));
        //bufferedWriter.write(result);
        //bufferedWriter.newLine();
    }

    //bufferedWriter.close();
    //scanner.close();
    //}
}
