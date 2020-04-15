package example;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int sLen = s.length();

        IntStream characterStream = s.chars();
        long count = characterStream.filter(c -> c == 'a').count();
        int remainder = (int) (n % sLen);
        int remainingCount = 0;
        for(int i=0; i<remainder; i++) {
            if(s.charAt(i) == 'a') {
                remainingCount++;
            }
        }
        return n / sLen * count + remainingCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String s = scanner.nextLine();
        String s = "aba";
        long n = 10;
        //long n = scanner.nextLong();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
    }
}

