//Java Program to count the total number of characters in a string

package com.girmiti.assessment1;

import java.util.Scanner;

public class StringExample_CountCharacter {

	public static void main(String[] args) {
		//Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		int count = 0;
		int i = 0;
		
		while(i < str.length())
		{
			if (str.charAt(i) != ' ')
			{
				count++;
			}
			i++;
		}
		
		System.out.println("The total numbers of character is :" + count);

	}

}
