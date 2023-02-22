package com.noah.Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println("Max consecutive substring: " + getMaxOrderedSubstring(str));
	}
	/*
	 * Time complexity: best case: O(n), worst case O(n)
	 * 
	 * T(N) = n * c = O(n)
	 */
	public static String getMaxOrderedSubstring(String str) {
		String res = "";
		String currSubStr = "";
		
		// create loop that runs str.length times
		for(int i = 0; i < str.length(); i++) {
			// select current character of str
			char c = str.charAt(i);
			
			// execute if we are on the first iteration or the current character is greater that the previous
			if(i == 0 || c > str.charAt(i - 1)) {
				currSubStr += c; // ADD to current substring
			} else { 
				// execute if the length of our current substring is less than the final result string
				if(currSubStr.length() > res.length()) {
					res = currSubStr; //set result substring to current one. 
				}
				currSubStr = c + ""; //then SET the current substring to the current character
			}
		}
		// compares current substring length and result substring length one last time
		if(currSubStr.length() > res.length()) {
			res = currSubStr;
		}
		return res;
	}
}
