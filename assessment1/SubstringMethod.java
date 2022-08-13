package com.girmiti.assessment1;

public class SubstringMethod {

	public static void main(String[] args) {
		
		String str1 = "Girmiti is a solutions and services company";
		
		// extract substring from index 0 to 7
		String s1 = str1.substring(0,7);
		
		//using contains method, checking its present or not
		if(s1.contains("Girmiti")) {
			System.out.println("Present!");
		}else {
			System.out.println("Not Present!");
		}
		
	}

}
