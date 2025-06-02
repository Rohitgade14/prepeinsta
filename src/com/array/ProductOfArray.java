package com.array;

public class ProductOfArray {
	public static void main(String[] args) {
		int [] arr= {1,3,5,7};
		int product=1;
		
		for(int i=0;i<arr.length;i++) {
			product=product*arr[i];
			
		}
		System.out.println(product);
	}

}
