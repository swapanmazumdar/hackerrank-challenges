import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds_Solution {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int n = c.length;
        int jumps = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) { // increment the jump count for at most 2 steps
                jumps++;
                if (i < n - 2 && c[i + 2] == 0) {
                    i++;
                }
            }
        }
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = scanner.nextInt();
        int n = 7;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        //String[] cItems = scanner.nextLine().split(" ");
        String[] cItems = "0 1 0 0 0 1 0".split(" ");

        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
    }
}
