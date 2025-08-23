package com.week2;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr= {10,11,20,21,30,40,50};
		int left=0;
		int right=arr.length-1;
		int target=61;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println("found at "+left+".."+right);
				return;
			}
			else if(sum<target){
			left++;
			}
			else 
				right++;
		}System.out.println("not found in list");

	}

}
