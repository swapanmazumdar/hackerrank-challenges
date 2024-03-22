package prepare.java.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaListSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // The first line contains an integer, N (the initial number of elements in L).

        List<Integer> LL = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            LL.add(in.nextInt()); // The second line contains N space-separated integers describing L.
        }

        int Q = in.nextInt(); // The third line contains an integer, Q (the number of queries).
        while (Q-- > 0) {
            String query = in.next(); // If the first line of a query contains the String Insert, then the second line
            // contains two space separated integers x y, and the value y must be inserted into L at index x.
            if (query.equals("Insert")) {
                int index = in.nextInt();
                int num = in.nextInt();
                LL.add(index, num);
            } else if (query.equals("Delete")) {
                LL.remove(in.nextInt());
            }
        }
        Iterator itr = LL.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\n");
    }
}
