package com.girmiti.assessment1;

public class MatchesMethod {

	public static void main(String[] args) {
		String pattern = "^[0-9]+$-&^%$@";
		String num = "546df";
		
		System.out.println(num.matches(pattern));

	}

}
