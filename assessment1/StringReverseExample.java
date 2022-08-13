package com.girmiti.assessment1;

public class StringReverseExample {

	public static void main(String[] args) {
		String string = "Mahabir";
		String revStr = "";

		//using for loop for reverse
		for (int i = string.length() - 1; i >= 0; i--) {
			revStr = revStr + string.charAt(i);
		}

		System.out.println("Original string: " + string);
		System.out.println("Reverse of given string: " + revStr);

	}

}
