package prepare.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You are given a phone book that consists of people's names and their phone number. After that you will be given some
 * person's name as query. For each query, print the phone number of that person.
 *
 * <b>Input Format</b>
 * <p>
 * The first line will have an integer n denoting the number of entries in the phone book. Each entry consists of two
 * lines: a name and the corresponding phone number.
 * <p>
 * After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
 *
 * <b>Constraints:</b>
 * A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in
 * the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
 * <p>
 * 1 <= n <= 100000
 * 1 <= Query <= 100000
 *
 * <b>Output Format</b>
 * <p>
 * For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and
 * phone number. See sample output for the exact format.
 * <p>
 * To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or
 * write completely on your own.
 */
public class JavaMapSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // number of entries in the phone book

        HashMap<String, Integer> phoneBook = new HashMap<>();
        // add entries into the phone book
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phoneNumber = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // query phone book
        while (in.hasNext()) {
            String name = in.nextLine(); // query by person's name
            if (phoneBook.containsKey(name)) {
                System.out.printf("%s=%s%n", name, phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
