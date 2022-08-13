//Java Program to determine whether two strings are the anagram
package com.girmiti.assessment1;

import java.util.Arrays;

public class StringExample_Anagram {

	public static void main(String[] args) {
		String str1="apple";  
		String str2="cat";  
		
		//Converting arrays to character array  
		char[] string1 = str1.toCharArray();  
		char[] string2 = str2.toCharArray();
		
		//Sorting the arrays
		Arrays.sort(string1);  
		Arrays.sort(string2); 
		
		//Comparing both the arrays
		if(Arrays.equals(string1, string2) == true) {  
		System.out.println("Both the strings are anagram");  
		}else {  
		System.out.println("Both the strings are not anagram");
		}
		
		} 
		
	}

