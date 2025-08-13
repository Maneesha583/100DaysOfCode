package com.week2;

import java.util.HashSet;
import java.util.Set;

public class LargestSubStringWithoutRepeat {
	public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char x = s.charAt(right);

            // Remove duplicates by moving left pointer
            while (set.contains(x)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character and update max length
            set.add(x);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kannada";
        System.out.println("Length of longest substring without repeating characters: " 
                           + lengthOfLongestSubstring(s));
		

	}

}
