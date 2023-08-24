package com.java.course.week1;

public class VariableOperations {

	public static void main(String[] args) {
		
		//original Variables
		int a = 15;
		int b = 10;
		int d = a / b;
		 
		 System.out.println(d);
		 
		//Assign new values
		 a = 34;
		 b = 13;
		 int e = a % b;
		 
		 System.out.println(e);
		 
		 //declaring variables with different data types
		 
		 String movie = "homeAlone";
		 String food = "Plantain";
		 
		 System.out.println("I like eating " + food +" when watching the movie " + movie + ".");
		 
		 double averageScore = 75.5;
		 
		 boolean grade = true;
		 
		 if (averageScore >= 75.5) {
			 grade = true;
		 } else if  (averageScore <= 60) {
			 grade = false;
		 }
		 System.out.println("Your grade is: " + grade);
		 
	}
}

