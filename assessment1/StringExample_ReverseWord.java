package com.girmiti.assessment1;

public class StringExample_ReverseWord {

	public static void main(String[] args) {
		StringExample_ReverseWord rs=new StringExample_ReverseWord(); 
		String str = "I am a Good Boy";
		System.out.println("Reverse of a String  is : "+rs.reversestr(str));
		}  
		//reverse string method  
		static String reversestr(String s)  
		{  
		String r="";  
		for(int i=s.length();i>0;--i)  
		{  
		r=r+(s.charAt(i-1));   
		}  
		return r;  
	}

}
