//Java Program to Count the Total Number of Punctuation Characters Exists in a String

package com.girmiti.assessment1;

public class StringExample_CountPunctuation {

	public static void main(String[] args) {
		String str1 = "Sir,Good Morning!.My name is Mahabir from odisha!.This is my contact number @8072057573";
		
		int periodCount = 0;
		int commaCount = 0;
		int exclamatoryCount = 0;
		int atCount = 0;
		int total = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			switch(str1.charAt(i)) {
			case '.':
				periodCount++;
		        break;
		     
			case ',':
				commaCount++;
				break;
			case '!':
				exclamatoryCount++;
				break;
			case '@':
				atCount++;
				break;
			}
			total += 1;
		}
		
		System.out.println("There is periodCount :"+ periodCount);
		System.out.println("There is commaCount :"+ commaCount);
		System.out.println("There is exclamatoryCount :"+ exclamatoryCount);
		System.out.println("There is atCount :"+ atCount);

	}

}
