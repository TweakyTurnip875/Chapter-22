package com.noah.Main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string for s1: ");
		String str1 = input.nextLine();
		
		System.out.print("Enter a string s2: ");
		String str2 = input.nextLine();

 		System.out.println("Matched index at: " + isSubstring(str1, str2));
		
	}
	// time complexity: O(n)
	public static int isSubstring(String str1, String str2) {
		int st = str1.toLowerCase().indexOf(str2.toLowerCase());
		
		return st;
	}
}