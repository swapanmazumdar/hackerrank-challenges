import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BalancedBrackets_Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        String result = "YES"; // default
        char[] brackets = s.toCharArray();

        Stack<Character> stackOfBrackets = new Stack();

        for (char c : brackets) {
            if (c == '{' || c == '[' || c == '(') {
                stackOfBrackets.push(c);
                continue;
            }

            if(stackOfBrackets.size() == 0) { // there is no point in proceeding ahead when there could be Closed brackets without any open brackets in the stack
                return "NO";
            }
            Character characterAtTheTop = stackOfBrackets.peek();

            if (characterAtTheTop.charValue() == '(' && c == ')') {
                stackOfBrackets.pop();
            } else if (characterAtTheTop.charValue() == '{' && c == '}') {
                stackOfBrackets.pop();
            } else if (characterAtTheTop.charValue() == '[' && c == ']') {
                stackOfBrackets.pop();
            } else {
                return "NO";
            }
        }
        return stackOfBrackets.empty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("}][}}(}][))]"));
        System.out.println(isBalanced("[](){()}"));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("({}([][]))[]()"));
        System.out.println(isBalanced("{)[](}]}]}))}(())("));
        System.out.println(isBalanced("([[)"));
    }
}

