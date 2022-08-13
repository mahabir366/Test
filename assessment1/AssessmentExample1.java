//Write a program to remove space in a string without using trim() method.
package com.girmiti.assessment1;

public class AssessmentExample1 {

	public static void main(String[] args) {
		String str1 = "Girmiti Software pvt ltd";

		// Removes the white spaces whith using replaceAll method
		str1 = str1.replaceAll("\\s+", "");

		System.out.println("Removed white space :" + str1);

	}

}
