import java.util.stream.IntStream;

/**
 * Breaking the Records
 * <p>
 * Problem: Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She
 * tabulates the number of times she breaks her season record for most points and least points in a game. Points scored
 * in the first game establish her record for the season, and she begins counting from there.
 * <p>
 * For example, assume her scores for the season are represented in the array scores = [12, 24, 10, 24]. Scores are in
 * the same order as the games played. She would tabulate her results as follows:
 * <p>
 * <pre>
 *                                   Count
 * Game  Score  Minimum  Maximum   Min Max
 * 0      12     12       12       0   0
 * 1      24     12       24       0   1
 * 2      10     10       24       1   1
 * 3      24     10       24       1   1
 * </pre>
 * Given Maria's scores for a season, find and print the number of times she breaks her records for most and least
 * points scored during the season.
 */
public class BreakingBestAndWorstRecords_Solution {

    /**
     * Returns an integer array containing the numbers of times she broke her records. Index 0 is for breaking most
     * points records, and index 1 is for breaking least points records.
     *
     * Time Complexity: O(n)
     */
    static int[] breakingRecords(int[] scores) {
        int maxScore = 0, worstScore = 0;
        int countMaxRecord = 0, countWorstRecord = 0;
        maxScore = scores[0];
        worstScore = scores[0];

        for (int score : scores) { // the first loop is redundant but let it be
            if (score > maxScore) {
                maxScore = score;
                countMaxRecord++;
            } else if (score < worstScore) {
                worstScore = score;
                countWorstRecord++;
            }
        }
        return new int[]{countMaxRecord, countWorstRecord};
    }

    public static void main(String[] args) {
        IntStream.of(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})).forEach(e -> {
            System.out.printf("%d ", e);
        });
        System.out.println();
        IntStream.of(breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42})).forEach(e -> {
            System.out.printf("%d ", e);
        });
    }
}
