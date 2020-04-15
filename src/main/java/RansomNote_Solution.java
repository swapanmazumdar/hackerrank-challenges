import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class RansomNote_Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> wordMap = new Hashtable<>();
        for (int i = 0; i < magazine.length; i++) {
            wordMap.put(magazine[i], wordMap.get(magazine[i]) != null ? wordMap.get(magazine[i]).intValue() + 1 : 1);
        }

        boolean canCreateReplica = true;
        for (String word : note) {
            int index = 0;
            try {
                index = wordMap.computeIfPresent(word, (key, value) -> value - 1); // word is not present
            } catch (NullPointerException e) {
                canCreateReplica = false;
            }
            if (index == -1) {
                canCreateReplica = false;
                break;
            }
        }
        System.out.println(canCreateReplica ? "Yes" : "No");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
