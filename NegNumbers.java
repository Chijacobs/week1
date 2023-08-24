package com.java.course.week1;

import java.util.Scanner;


public class NegNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num1 = sc.nextInt();
		
		if (num1 > 0) { 
			System.out.println("positive");
			
			
		}else {
			System.out.println("negative");
		}
		
		sc.close();
	}

}
