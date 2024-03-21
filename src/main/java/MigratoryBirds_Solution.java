import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds_Solution {
    //SortedMap<Integer, Integer> treeMap = new TreeMap<>();
    static int[] birdsCount = new int[6]; // It is guaranteed that each type is , , , , or .

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            ++birdsCount[arr.get(i)];
        }

        int previousId = 0;
        int previousMax = birdsCount[0];
        int maxValue = 0;
        for (int i = 1; i < birdsCount.length; i++) {
            if(birdsCount[i] > previousMax) {
                previousMax = birdsCount[i];
                previousId = i;
            }else if(birdsCount[i] == previousMax) {
                maxValue = birdsCount[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        List<Integer> arr = IntStream.of(new int[]{1, 1, 2, 2, 3, 3, 3}).boxed().collect(toList());
        System.out.println(migratoryBirds(arr));
    }
}

