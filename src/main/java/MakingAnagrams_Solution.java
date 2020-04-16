import java.io.IOException;
import java.util.Scanner;

public class MakingAnagrams_Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the makeAnagram function below.
    public static int bruteForce_MakeAnagram(String str1, String str2) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int index = str2.indexOf(c);
            if (index != -1) {
                str2 = str2.replaceFirst(String.valueOf(c), "");
                stringBuilder.append(c);
            }
            if (index == -1) {
                ++count;
            }
        }
        return count + str2.length(); // add the count of left over string length
    }

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int res = bruteForce_MakeAnagram(a, b);
        System.out.println(res);
        //bufferedWriter.write(String.valueOf(res));
        //bufferedWriter.newLine();
        //bufferedWriter.close();

        //scanner.close();
    }
}
