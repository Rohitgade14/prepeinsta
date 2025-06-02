package com.array;

public class CalculateSumOfArray {
	public static void main(String[] args) {
		int [] arr = {3,5,7,9,1};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
