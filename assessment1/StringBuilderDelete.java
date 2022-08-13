package com.girmiti.assessment1;

public class StringBuilderDelete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mr. Mahabir Mohala");
		StringBuilder dsb = sb.delete(11, 18);
		System.out.println("Result :"+dsb);

	}

}
