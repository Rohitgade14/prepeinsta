package com.string;

public class CountVowels {
	
	public static void main(String[] args) {
		String str ="rohit";
		char [] c=str.toCharArray();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(c[i]=='a' || c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				count++;
			}
		}
		System.out.println(count);
		 int count1=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='A'||ch=='e'||ch=='i' ||ch=='o' || ch=='u') {
				count1++;
			}
		}
		System.err.println(count1);
	}

}
