package com.java.course.week1;

public class Strings {
	/*
	 * A string is a data structure that holds a sequence of characters.
	 * All methods have a set of brackets after the name unlike in arrays.
	 * Using the concat method is the object oriented approach for concatenating
	 * String contains helps us to check if some characters are in .
	 * Strings are immutable meaning they cannot change
	 */

	public static void main(String[] args) {
		
		char[] str0 = { 'B', 'P', 'T', 'N'};
		String str1 = new String(str0);
		
		//String str1 = "Hello";
		
		System.out.println(str1);
		
		int size = str1.length(); //another way of
		System.out.println(str1.length());
		
		//String concatenation
		String str3 = (str1 + "" + str2);
		
	}

}
