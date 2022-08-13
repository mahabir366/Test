package com.girmiti.assessment1;

public class StringBuilderUsingIndexOf {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("I am");
		StringBuilder asb = sb.append("Mahabir");
		int Isb = asb.indexOf("am");
		System.out.println("String IndexOf :"+Isb);

	}

}
