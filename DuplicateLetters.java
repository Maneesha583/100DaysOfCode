package com.techpalle;

public class DuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Programming";
		str=str.toLowerCase();
		for(char c = 'a';c <= 'z';c++) {
			int count=0;
			for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("Letter "+c+" is duplicate & appears "+count+" times");
		}
		}

	}

}
