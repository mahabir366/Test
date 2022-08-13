//reserve a string in Java without using reverse function
package com.girmiti.assessment1;

public class StringExample_ReverseString {

	public static void main(String[] args) {
		String str = "Software";
		char str1[] = str.toCharArray();
		int n=str.length();
		System.out.println("Original String is : " +str);
		System.out.print("Reverse String is : ");
		for(int i=n-1;i>=0;i--)
		{
   			System.out.print(str1[i]);
		}

	}

}
