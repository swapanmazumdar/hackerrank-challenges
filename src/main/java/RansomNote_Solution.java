import java.util.Hashtable;
import java.util.Map;

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

    public static void main(String[] args) {
        checkMagazine("give me one grand today night".split(" "), "give one grand today".split(" "));
        checkMagazine("two times three is not four".split(" "), "two times two is four".split(" "));
        checkMagazine("ive got a lovely bunch of coconuts".split(" "), "ive got some coconuts".split(" "));
    }
}
