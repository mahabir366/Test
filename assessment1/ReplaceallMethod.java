package com.girmiti.assessment1;

public class ReplaceallMethod {

	public static void main(String[] args) {
		String str1 = "Learn2356Java8569from236girmiti";
		String replace = "\\d+";
		//using replaceall method
		String result = str1.replaceAll(replace, " ");
		System.out.println(result);

	}

}
