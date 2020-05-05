import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Birthday Chocolate
 * <p>
 * Problem: Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an
 * integer on it. She decides to share a contiguous segment of the bar selected such that the length of the segment
 * matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine
 * how many ways she can divide the chocolate.
 * <p>
 * Consider the chocolate bar as an array of squares, s = [2, 2, 1, 3, 2]. She wants to find segments summing to Ron's
 * birth day, d = 4 with a length equalling his birth month, m = 2. In this case, there are two segments meeting her
 * criteria: [2, 2] and [1, 3].
 */
public class TheBirthdayBar_Solution {

    /**
     * Returns an integer denoting the number of ways Lily can divide the chocolate bar.
     */
    static int birthday(List<Integer> s, int birthDay, int birthMonth) {
        int count = 0;
        int[] chocolates = s.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i <= chocolates.length - birthMonth; i++) {
            if (Arrays.stream(chocolates, i, i + birthMonth).sum() == birthDay) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = Stream.of("2 2 1 3 2".split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        System.out.println(birthday(s, 4, 2));

        s = Stream.of("1 2 1 3 2".split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        System.out.println(birthday(s, 3, 2));

        s = Stream.of("4".split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        System.out.println(birthday(s, 4, 1));
    }
}
