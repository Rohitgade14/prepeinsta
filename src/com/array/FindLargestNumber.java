package com.array;

public class FindLargestNumber {
	public static void main(String[] args) {
		int [] arr= {15,12,78,19,22,56};
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
			
			else if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}

}
