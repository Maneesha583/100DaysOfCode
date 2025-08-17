package com.week2;

public class ValidParenthesisRecursion {
	
	 public static boolean isValid(String s) {
	        // Base condition
	        if (s.isEmpty()) return true;

	        // Try removing valid pairs
	        String replaced = s.replace("()", "")
	                           .replace("{}", "")
	                           .replace("[]", "");

	        // If no change → invalid
	        if (replaced.equals(s)) return false;

	        // Recurse again on reduced string
	        return isValid(replaced);
	    }

	public static void main(String[] args) {
		String s = "{[()]}";
        System.out.println(isValid(s)); // true

	}

}
