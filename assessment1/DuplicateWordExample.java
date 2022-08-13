package com.girmiti.assessment1;

public class DuplicateWordExample {

	public static void main(String[] args) {
		String string = "big box but small not enough but big box also enough";
		int count;

		// Converts to lowercase
		string = string.toLowerCase();

		// Split the string into words
		String words[] = string.split(" ");

		System.out.println("Duplicate words : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			// Displays the duplicate word if count is greater than 1
			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);
		}

	}

}
