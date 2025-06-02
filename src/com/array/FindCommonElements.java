package com.array;

public class FindCommonElements {
   
	public static void main(String[] args) {
		int [] arr= {11,15,11,17,22,33,17};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] ) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
