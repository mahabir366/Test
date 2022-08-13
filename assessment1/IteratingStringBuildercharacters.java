package com.girmiti.assessment1;

public class IteratingStringBuildercharacters {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("I am a good boy");
		System.out.println("Characters :");
		for(int i=0;i<sb.length();i++){
			System.out.println(sb.charAt(i));
			}
		}
	}
