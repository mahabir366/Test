package com.girmiti.assessment1;

public class StringBuilderEnsureCapacity {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mahabir");
		int csb = sb.capacity();
		StringBuilder asb = sb.append("Mohala");
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());

	}

}
