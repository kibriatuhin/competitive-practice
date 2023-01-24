package geeksforGeeks;

import java.util.Stack;

public class ParenthesisChecker {
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();
        for (int i=0 ; i<x.length() ; i++){
            char ch = x.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[' ){
                stack.push(ch);
            } else if (ch == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            }else if (ch == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            } else if (ch == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.empty();

    }
    public static void main(String[] args) {
        String st = "{([]}";
        System.out.println(ispar(st));
    }
}
