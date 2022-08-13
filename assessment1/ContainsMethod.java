package com.girmiti.assessment1;

import java.util.Scanner;

public class ContainsMethod {

	public static void main(String[] args) {
		//using scanner class getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int value = sc.nextInt();
		String str1 = "Water";
		switch(value) {
		case 1:
			if(str1.contains(str1)) {
				System.out.println("Bottle Contains"+" "+str1+", "+"Please Drink!");
			}
			break;
			
		case 2:
			if (str1.contains(str1)){
				System.out.println(str1 + " " + "Filling start!");
			}

		}
		
	}

}
