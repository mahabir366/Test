//Java Program to divide a string in 'N' equal parts.

package com.girmiti.assessment1;

public class StringExample_DivideString {

	public static void main(String[] args) {
		String str = "abccdeefh";
		int n = 3;
		int temp = 0;
		
		int length = str.length();
		int chars = length/n; 
         
		
        String[] equalStr = new String [n];  
        
        //Check whether a string can be divided into n equal parts  
        if(length % n != 0) {  
            System.out.println("The size of the given string is not divisible by \" + n");  
        }  
        else {  
            for(int i = 0; i < length; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }
            
            System.out.println(n + " equal parts of given string are "); 
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  

	}

}
