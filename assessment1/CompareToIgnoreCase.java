package com.girmiti.assessment1;

public class CompareToIgnoreCase {

	public static void main(String[] args) {
		String str1 = "APPLE";
		String str2 = "Apple";
		//Compare str1 and str2
		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("str1 and str2 are equal");
		} else {
			System.out.println("str1 and str2 are not equal");
		}

	}

}
