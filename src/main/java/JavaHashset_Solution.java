import java.util.HashSet;

/**
 * Java Hashset
 * <p>
 * Problem: In computer science, a set is an abstract data type that can store certain values, without any particular
 * order, and no repeated values(Wikipedia).  {1, 2, 3} is an example of a set, but {1, 2, 2} is not a set. Today you
 * will learn how to use sets in java by solving this problem.
 * <p>
 * You are given n pairs of strings. Two pairs (a, b) and (c, d) are identical if a = c and b = d. That also implies
 * (a, b) is not same as (b, a). After taking each pair as input, you need to print number of unique pairs you currently
 * have.
 */
public class JavaHashset_Solution {

    public static void main(String[] args) {
        String[] pair_left = new String[]{"john", "john", "john", "mary", "mary"};
        String[] pair_right = new String[]{"tom", "mary", "tom", "anna", "anna"};

        HashSet<String> pairs = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            pairs.add(pair_left[i] + ":" + pair_right[i]);
            System.out.println(pairs.size());
        }
    }
}