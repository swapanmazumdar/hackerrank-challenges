/**
 * Birthday Cake Candles
 * <p>
 * Problem: You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for
 * each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your
 * task is to find out how many candles she can successfully blow out.
 * <p>
 * For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4, 4, 1, 3, she will
 * be able to blow out 2 candles successfully, since the tallest candles are of height 4 and there are 2 such candles.
 */
public class BirthdayCakeCandles_Solution {

    static int birthdayCakeCandles(int[] ar) {
        if (ar == null) {
            return 0;
        }
        int birthdayCandlesCount = 0;
        int tallestCandle = 0;
        for (int i = 0; i < ar.length; i++) {
            if (tallestCandle < ar[i]) {
                tallestCandle = ar[i];
                birthdayCandlesCount = 1;
            } else if (ar[i] == tallestCandle) {
                birthdayCandlesCount++;
            }
        }
        return birthdayCandlesCount;
    }

    public static void main(String[] args) {
        //System.out.println(birthdayCakeCandles(new int[]{3, 2, 1, 3}));
        System.out.println(birthdayCakeCandles(new int[]{4}));
        //System.out.println(birthdayCakeCandlesDivideAndConquer(new int[]{3, 2, 1, 3}));
    }
}
