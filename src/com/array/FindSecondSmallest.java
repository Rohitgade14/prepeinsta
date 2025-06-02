package com.array;

public class FindSecondSmallest {
    public static void main(String[] args) {
    	int [] arr = {12,34,77,56,19,45};
    	
    	for(int i=0;i<arr.length;i++) {
    	    for(int j=i+1;j<arr.length;j++) {
    	    	if(arr[i]>arr[j]) {
    	    		int temp=arr[i];
    	    		arr[i]=arr[j];
    	    		arr[j]=temp;
    	    		
    	    	}
    	    }
    	}
    	
    	for(int num:arr) {
    		System.out.println(num);
    	}
    	System.err.println(arr[1]);
	}
}
