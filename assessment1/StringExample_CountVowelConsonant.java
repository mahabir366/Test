//Java Program to count the total number of vowels and consonants in a string

package com.girmiti.assessment1;

public class StringExample_CountVowelConsonant {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		String s = str.toLowerCase();
		int VowlCount = 0;
		int ConsonantCount =0;
		for (int i = 0; i < s.length(); i++) {
			 if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {      
	                VowlCount++;    
	            }  
			 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                 
				 ConsonantCount++;    
	            }    
			}
		
		System.out.println("Number of vowels: " + VowlCount);    
        System.out.println("Number of consonants: " + ConsonantCount);
		}

	}
