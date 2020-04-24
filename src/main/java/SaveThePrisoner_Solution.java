import java.io.IOException;

public class SaveThePrisoner_Solution {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner_BruteForce(int n, int m, int s) {
        return ((s - 1 + m - 1) % n) + 1;
    }

    public static void main(String[] args) throws IOException {
        int n = 5, m = 2, s = 1;
        int result = saveThePrisoner_BruteForce(n, m, s);
        System.out.printf("The number of prisoners: %d%nThe number of sweets: %d%nThe chair number to start passing" +
                " out treats at %d%n", n, m, s);
        System.out.printf("Warn prisoner: %d%n", result);

        n = 5;
        m = 2;
        s = 2;
        result = saveThePrisoner_BruteForce(n, m, s);
        System.out.printf("The number of prisoners: %d%nThe number of sweets: %d%nThe chair number to start passing" +
                " out treats at %d%n", n, m, s);
        System.out.printf("Warn prisoner: %d%n", result);
    }
}

