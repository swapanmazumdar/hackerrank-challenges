import java.io.IOException;
import java.util.Scanner;

public class SaveThePrisoner_Solution {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner_BruteForce(int n, int m, int s) {
        return ((s - 1 + m - 1) % n) + 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]); // number of prisoners
            int m = Integer.parseInt(nms[1]); // number of sweets
            int s = Integer.parseInt(nms[2]); // chair number to start passing out treats at
            int result = saveThePrisoner_BruteForce(n, m, s);
            System.out.println(result);
            /*System.out.printf("The number of prisoners: %d%nThe number of sweets: %d%nThe chair number to start passing" +
                    " out treats at %d%n", n, m, s);
            System.out.printf("Warn prisoner: %d%n", result);
            *///    bufferedWriter.write(String.valueOf(result));
            //    bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}

