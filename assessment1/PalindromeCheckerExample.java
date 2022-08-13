package com.girmiti.assessment1;

import java.util.Scanner;

public class PalindromeCheckerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = sc.nextLine(); 
		String revstr = "";
		
		//using for loop for reversing
		for (int i = str1.length() - 1; i >= 0; i--){
           revstr += str1.charAt(i);
        }
		
		//checking the condition
		if (str1.equals(revstr)){
            System.out.println("String is Palindrome :" + str1);
        }else{
        	System.out.println("String is not a Palindrome : "+ str1);
        }

	}

}
