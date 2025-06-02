package com.array;

public class DistinctElement {
	public static void main(String[] args) {
		int [] arr = {11,34,11,46,56,34};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j] && i!=j) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
