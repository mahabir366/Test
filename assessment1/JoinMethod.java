package com.girmiti.assessment1;

import java.util.ArrayList;
import java.util.List;

public class JoinMethod {

	public static void main(String[] args) {
		//using arraylist add the value
		List<String> value = new ArrayList<String>();
		value.add("Girmiti");
		value.add("Software");
		value.add("Ltd");
		value.add("!");
		//using join method 
		String result = String.join(" ", value);
		System.out.println(result);
 
	}

}
