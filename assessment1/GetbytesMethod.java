package com.girmiti.assessment1;

import java.util.Arrays;

public class GetbytesMethod {

	public static void main(String[] args) {
		String str = "Java is a popular programming language";
		byte[] result;
		//convert string to bytes
		result  = str.getBytes();
		System.out.println(Arrays.toString(result));

	}

}
