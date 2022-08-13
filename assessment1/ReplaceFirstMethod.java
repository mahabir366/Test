package com.girmiti.assessment1;

public class ReplaceFirstMethod {

	public static void main(String[] args) {
		String str1 = "Learn2356Java8569from236girmiti";
		String replace = "\\d+";
		//using replaceFirst method
		String result = str1.replaceFirst(replace, " ");
		System.out.println(result);

	}

}
