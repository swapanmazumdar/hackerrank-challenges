public class Solution {

    /// method to get the maximum possible number obtained by inserting digit '5'
    /// at any position in the given number.
    /// </summary>
    /// <param name="num">given number</param>
    /// <returns>possible maximum number after inserting 5 at any position</returns>
    public static int getMaxNumberByInserting5(int num) {
        final int digit5 = 5;

        if (num == 0) { // base case
            return digit5 * 10;
        }

        num = Math.abs(num); // get the absolute value of given number
        int n = num;
        int maximumValue = Integer.MIN_VALUE; // // maximum number obtained after inserting digit.

        int counter = 0;
        // count digits
        while (n > 0) {
            counter++;
            n = n / 10;
        }

        int negativeNumber = num / Math.abs(num); // -1 if num is negativeNumber number else 1
        // Significant work is carried out here wrt time complexity - looks like it is linear to the size of digits in
        // the number and some constant operations

        int pos = 1;
        // Place digit
        for (int i = 0; i <= counter; i++) {
            int newVal = ((num / pos) * (pos * 10)) + (digit5 * pos) + (num % pos);

            if (newVal * negativeNumber > maximumValue) {
                maximumValue = newVal * negativeNumber;
            }
            pos = pos * 10;
        }
        return maximumValue;
    }

    public static void main(String[] args) {
        System.out.printf("Maximum possible number for %d is: %d%n", 268, getMaxNumberByInserting5(268));
        System.out.printf("Maximum possible number for %d is: %d%n", 670, getMaxNumberByInserting5(670));
        System.out.printf("Maximum possible number for %d is: %d%n", 0, getMaxNumberByInserting5(0));
        System.out.printf("Maximum possible number for %d is: %d%n", -999, getMaxNumberByInserting5(-999));
    }

}
