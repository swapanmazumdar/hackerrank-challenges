/**
 * Apple and Orange
 * <p>
 * Problem: Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the
 * red region denotes his house, where s is the start point, and t is the endpoint. The apple tree is to the left of his
 * house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple
 * tree is at point a, and the orange tree is at point b.
 * <p>
 * When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. A negative
 * value of d means the fruit fell d units to the tree's left, and a positive value of d means it falls d units to the
 * tree's right.
 * <p>
 * Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house
 * (i.e., in the inclusive range [s, t])?
 * <p>
 * For example, Sam's house is between s = 7 and t = 10. The apple tree is located at a = 4 and the orange at b = 12.
 * There are m = 3 apples and n = 3 oranges. Apples are thrown apples = [2, 3, -4] units distance from a, and oranges =
 * [3, -2, 4] units distance. Adding each apple distance to the position of the tree, they land at [4+2, 4+3, 4+ -4] =
 * [6, 7, 0]. Oranges land at [12 + 3, 12 + -2, 12 + -4] = [15, 10, 8]. One apple and two oranges land in the inclusive
 * range 7 - 10 so we print
 * 1
 * 2
 */
public class AppleAndOrange_Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples = 0, countOranges = 0;
        // calculate distance where apples land
        for (int i = 0; i < apples.length; i++) {
            apples[i] = apples[i] + a;
            // while we are at it check if it falls in the inclusive range
            if (apples[i] >= s && apples[i] <= t) {
                countApples++;
            }
        }
        System.out.println(countApples);
        // calculate distance where oranges land
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = oranges[i] + b;
            // while we are at it check if it falls in the inclusive range
            if (oranges[i] >= s && oranges[i] <= t) {
                countOranges++;
            }
        }
        System.out.println(countOranges);
    }

    public static void main(String[] args) {
        countApplesAndOranges(7, 10, 4, 12, new int[]{2, 3, -4}, new int[]{3, -2, -4});
    }
}
