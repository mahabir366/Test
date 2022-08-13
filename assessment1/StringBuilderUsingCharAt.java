package com.girmiti.assessment1;

public class StringBuilderUsingCharAt {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Girmiti");
		System.out.println("String :"+sb);
		//using charAt method
		char csb = sb.charAt(3);
		System.out.println("Character :" +csb);

	}

}
