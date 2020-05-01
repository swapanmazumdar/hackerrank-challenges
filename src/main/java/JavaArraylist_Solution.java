import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Java Arraylist
 * <p>
 * Problem: Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to
 * solve this problem using Arraylist.
 * <p>
 * You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need
 * to tell the number located in yth position of xth line.
 * <p>
 * Take your input from System.in.
 */
public class JavaArraylist_Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<ArrayList> list = new ArrayList(n);

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            ArrayList<Integer> numList = (ArrayList<Integer>) Arrays.stream(line.split(" "))
                    .map(Integer::parseInt).collect(Collectors.toList());
            list.add(i, numList);
        }

        int readCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < readCount; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                ArrayList<Integer> embeddedList = list.get(x - 1);
                System.out.println(embeddedList.get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
