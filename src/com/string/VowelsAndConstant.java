package com.string;

import java.util.Scanner;

public class VowelsAndConstant {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the characters");
		char c=sc.next().charAt(0);
		
		   if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
			   System.out.println(c+" vowels");
		   }
		   else {
			   System.out.println(c+" constant");
		   }
	    
	}

}
