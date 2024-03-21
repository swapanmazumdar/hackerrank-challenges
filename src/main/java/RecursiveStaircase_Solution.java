public class RecursiveStaircase_Solution {

    static int stepPerms(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        return fibonacci(n - 1) + fibonacci(n - 2) + fibonacci(n - 3);
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(stepPerms(5));
    }
}
