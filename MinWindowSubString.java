package com.week2;

public class MinWindowSubString {
	
	// Function to find minimum window substring
    public static String minWindow(String s, String t) {
        int[] need = new int[128]; 
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0, count = 0;
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (need[c] > 0) count++;
            need[c]--;

            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;
                if (need[leftChar] > 0) count--;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }


	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = minWindow(s, t);
        System.out.println("Minimum Window Substring: " + result);

	}

}
