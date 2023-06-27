import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String expression = sc.next();
            System.out.println(isBalanced(expression));
        }
        sc.close();
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}