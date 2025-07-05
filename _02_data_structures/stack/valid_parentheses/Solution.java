package _02_data_structures.stack.valid_parentheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // if open parenthesis remain in the stack
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("{({}[])}"));
        System.out.println(isValid("{({(}[])}"));
    }
}
