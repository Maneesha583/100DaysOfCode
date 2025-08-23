package com.week2;

import java.util.Stack;

public class ValidParenthesisStack {
	
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Check closing brackets
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // must be empty if valid
    }

	public static void main(String[] args) {
		String s = "{[()]}";
        System.out.println(isValid(s)); // true
        System.out.println(isValid("{[(])}")); // false


	}

}
