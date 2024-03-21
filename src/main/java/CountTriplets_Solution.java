import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

// 1 5 5 25
public class CountTriplets_Solution {
/**
    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Collections.sort(arr);
        int count = 0;

        int i = 0;
        long a = arr.get(0);
        int tripletCount = 1;
        while(i++ < arr.size()) {
            // now look for ar
            long ar = arr.get(i);
            if(ar % a == 0) {
                tripletCount++;
            }
            arr.contains(a * Math.pow(ar, 2));
        }
        for (int i = 0; i < arr.size(); i++) {
            long a = arr.get(i); // this is a
            long letR = a;
            System.out.print(a + " ");
            for (int j = i + 1; j < arr.size(); j++) {
                long aTimesR = a * r;
                if(arr.get(j).equals(aTimesR)) {
                    System.out.print("found:" + aTimesR);
                    for (int k = j + 1; k < arr.size(); k++) { // now look for a times r to the power 2
                        double power = 2;
                        long letRSquare = (long) Math.pow(aTimesR, power);
                        if(arr.get(k).equals(letRSquare)) {
                            System.out.print("found:" + letRSquare);
                            letR = letRSquare;
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] nr = {"1", "5"};
        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        //List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong).collect(toList());
        List<Long> arr = Stream.of("1 5 5 25".split(" ")).map(Long::parseLong).collect(toList());

        long ans = countTriplets(arr, r);

        //bufferedWriter.write(String.valueOf(ans));
        //bufferedWriter.newLine();
        //bufferedReader.close();
        //bufferedWriter.close();
    }
 **/
}