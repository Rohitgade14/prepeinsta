package com.array;

public class FindDuplicateNumber {
   
	public static void main(String[] args) {
		int [] arr= {11,15,11,17,22,33,17};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.print(arr[i]);
				}
			}
		}
	}
}
