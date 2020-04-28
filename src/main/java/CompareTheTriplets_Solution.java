import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Compare the Triplets
 * <p>
 * Problem: Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points
 * on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
 * <p>
 * We define the rating for Alice's challenge to be the triplet a = (a[0], a[1], a[2]), and the rating for Bob's
 * challenge to be the triplet b = (b[0], b[1], b[2]).
 * <p>
 * Your task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
 * <p>
 * If a[i] > b[i], then Alice is awarded  point.
 * If a[i] < b[i], then Bob is awarded  point.
 * If a[i] = b[i], then neither person receives a point.
 * Comparison points is the total points a person earned.
 * <p>
 * Given a and b, determine their respective comparison points.
 */
public class CompareTheTriplets_Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] result = new int[2]; // Alice's points are at index 0 and Bob's points are at index 1
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                ++result[0];
            } else if (a.get(i) < b.get(i)) {
                ++result[1];
            }
        }
        return Arrays.stream(result).boxed().collect(toList());
    }

    public static void main(String[] args) {
        List<Integer> a = Stream.of(5, 6, 7).collect(toList());
        List<Integer> b = Stream.of(3, 6, 10).collect(toList());
        compareTriplets(a, b).stream().forEach((x) -> {
            System.out.print(x + " ");
        });
    }
}
