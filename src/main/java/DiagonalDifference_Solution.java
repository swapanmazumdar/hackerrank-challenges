import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


/**
 * Diagonal Difference
 * <p>
 * Problem: Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * For example, the square matrix  is shown below:
 * <p>
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. Their absolute difference
 * is |15 - 17] = 2.
 */
public class DiagonalDifference_Solution {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Stream.of("11 2 4".split(" ")).map(Integer::parseInt).collect(toList()));
        arr.add(Stream.of("4 5 6".split(" ")).map(Integer::parseInt).collect(toList()));
        arr.add(Stream.of("10 8 -12".split(" ")).map(Integer::parseInt).collect(toList()));

        System.out.println(Result.diagonalDifference(arr));
    }
}

class Result {

    /**
     * Prints the absolute difference between the sums of the matrix's two diagonals as a single integer.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonalSum = 0, rightDiagonalSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    leftDiagonalSum += arr.get(i).get(j);
                }
                if (i + j == arr.get(i).size() - 1) {
                    rightDiagonalSum += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }
}
