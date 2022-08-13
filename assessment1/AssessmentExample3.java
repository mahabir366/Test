//write a program to count the number of words in a string

package com.girmiti.assessment1;

public class AssessmentExample3 {

	public static void main(String[] args) {
		
		String str = "welcome to Girmiti Software";
		int count = 1;
		int value = str.length();
 
        for (int i = 0; i < value - 1; i++) {
        	
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);

	}

}
