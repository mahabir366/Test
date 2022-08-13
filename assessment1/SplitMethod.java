package com.girmiti.assessment1;

public class SplitMethod {

	public static void main(String[] args) {
		
		String text = "Python is a Good Programming Language";
		//using split method
		String[] result = text.split(" ");
		for(String Str : result) {
			System.out.print(Str+", ");
		}

	}

}
