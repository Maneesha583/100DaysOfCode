package com.techpalle;

public class SecondBiggest {

	public static void main(String[] args) {
	    int[] nums= {10,50,20,40,30,};
	    int largest=nums[0];
	    int second=nums[0];
	    for(int i=1;i<nums.length;i++) {
	    	if(nums[i]>largest) {
	    		second=largest;
	    		largest=nums[i];
	    	}else if(nums[i] > second && nums[i] !=largest) {
	    		second=nums[i];
	    	}
	    }
	    System.out.println("Second Largest element: "+second);

	}

}
