package prepare.java.datastructures;

import java.util.Scanner;

public class JavaGenericsSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner scanner = new Scanner(System.in);

        Integer[] ints = new Integer[] {1, 2, 3};

        String[] strings = new String[] {"Hello", "World"};
        printArray(ints);
        printArray(strings);
    }

    static <T> void printArray(T[] t) {
        for (T element : t) {
            System.out.println(element);
        }
    }

}