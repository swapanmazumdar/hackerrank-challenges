/**
 * Staircase
 * <p>
 * Problem: Consider a staircase of size n = 4:
 * #
 * ##
 * ###
 * ####
 * Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 * <p>
 * Write a program that prints a staircase of size n.
 */
public class Staircase_Solution {
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - spaces; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void staircaseWhileLoops(int n) {
        for (int i = 1; i <= n; i++) {
            int j = n;
            while (j-- > i) {
                System.out.print(" ");
            }
            while (j-- >= 0) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(3);
        System.out.println();
        staircaseWhileLoops(3);
    }
}

