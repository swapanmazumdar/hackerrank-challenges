import java.util.Arrays;

public class FraudulentActivityNotifications_Solution {

    static int activityNotifications(int[] expenditure, int d) {
        int n = expenditure.length;
        if (d <= 1 && d >= n) {
            return 0;
        }
        int count = 0;
        int index = 0;
        for (int i = d; i < expenditure.length; i++) {
            int[] newArray = Arrays.copyOfRange(expenditure, index, d + index);
            sort(newArray);
            double median = median(newArray);
            if (expenditure[d + index++] >= median * 2) {
                count++;
            }
        }
        return count;
    }

    static double median(int[] arr) {
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[(arr.length / 2)] + arr[(arr.length / 2) - 1]) / 2.0;
        }
    }

    static int[] sort(int arr[]) {
        int n = arr.length;
        int output[] = new int[n]; // output array
        int count[] = new int[256];

        for (int i = 0; i < n; ++i)
            ++count[arr[i]]; // store count of each element

        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1]; // sum of previous count

        // Build the output character array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now contains sorted characters
        for (int i = 0; i < n; ++i) {
            arr[i] = output[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        //System.out.println(activityNotifications(new int[]{10, 20, 30, 40, 50, 60}, 3));
        //System.out.println(activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));
        //
        System.out.println(activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
    }
}
