package com.girmiti.assessment1;

public class ConvertingStringBuilderObjectToString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Dog is playing");
		//Converting StringBuilder object to String
		String string=sb.toString();
        System.out.println("Converted String builder to string :"+string);
        
        //String operation
        
        //length of the string
        System.out.println("Length of the string :"+string.length());
        //join two string
        String newString = string.concat(" Happily!");
        System.out.println("Joined two String :"+ newString);
        //Compare two string
        boolean result = string.equals(newString);
        System.out.println("compare two string :"+result);
        
        
	}

}
