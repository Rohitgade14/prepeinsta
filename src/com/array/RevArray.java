package com.array;

public class RevArray {
	public static void main(String[] args) {
		int [] arr = {12,23,45,67,18};
		int  n=arr.length;
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
