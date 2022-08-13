package com.girmiti.assessment1;

public class StringBuilderReplace {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mr. Mahabir");
		StringBuilder rsb = sb.replace(4, 11, "Mohala");
		System.out.println("Result :"+rsb);

	}

}
