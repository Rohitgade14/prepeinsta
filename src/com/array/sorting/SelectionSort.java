package com.array.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr = {12,77,45,56,68,22};
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
             if(arr[j]<arr[min]) {
            	 min=j;
             }
		}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		
		for(int num:arr) {
			System.out.println(num);
		}

}
}