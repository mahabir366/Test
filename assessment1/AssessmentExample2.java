//write a program to reverse a string without using any inbuilt methods

package com.girmiti.assessment1;

import java.util.Scanner;

public class AssessmentExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		
		System.out.print("After reverse string is: ");
		for (int i = s.length(); i > 0; --i)
		{
			System.out.print(s.charAt(i - 1));
		}

	}

}
