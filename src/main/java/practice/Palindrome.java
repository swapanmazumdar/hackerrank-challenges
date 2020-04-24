package practice;

public class Palindrome {

    private int createPalindrome(int num, int b, int isOdd) {
        int n = num;
        int palindrome = num;

        if (isOdd == 1)
            n /= b;

        while (n > 0) {
            palindrome = palindrome * b + (n % b);
            n /= b;
        }
        return palindrome;
    }

    public void generatePalindromes(int n) {
        int number;
        int sum = 0;
        for (int j = 0; j < 2; j++) {
            int i = 1;
            while ((number = createPalindrome(i, 10, j % 2)) < n) {
                System.out.print(number + " ");
                sum += number;
                i++;
            }
        }
        System.out.println();
        System.out.println("Sum:" + sum);
    }

    public static void main(String[] args) {
        int n = 104;
        Palindrome palindrome = new Palindrome();
        palindrome.generatePalindromes(10000);
    }
}