package com.techpalle;


public class ReversingWords {

	public static void main(String[] args) {
		
		String input = "hello world java";

        // Split words
        String[] words = input.split(" ");

        System.out.println("Reversed word order:");
        for (int i=words.length-1;i>=0;i--) {
            System.out.print(words[i]+" ");
        }
       
	}

}
