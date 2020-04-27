import java.util.Stack;

/**
 * Stacks: Balanced Brackets
 * <p>
 * Problem: A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
 * <p>
 * Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a
 * closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}
 * , and ().
 * <p>
 * A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])}
 * is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a
 * single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square
 * bracket, ].
 * <p>
 * Some examples of balanced brackets are []{}(), [({})]{}() and ({(){}[]})[].
 * <p>
 * By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
 * <p>
 * It contains no unmatched brackets.
 * The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 * Given a string of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print
 * YES on a new line; otherwise, print NO on a new line.
 */
public class BalancedBrackets_Solution {

    static String isBalanced(String s) {
        char[] brackets = s.toCharArray();

        Stack<Character> stackOfBrackets = new Stack();

        for (char c : brackets) {
            if (c == '{' || c == '[' || c == '(') {
                stackOfBrackets.push(c);
                continue;
            }

            if (stackOfBrackets.size() == 0) { // there is no point in proceeding ahead when there could be Closed brackets without any open brackets in the stack
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

