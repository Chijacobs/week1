package com.java.course.week1;

	import java.util.Scanner;

	public class Calculator {
	    public static void main(String[] args) {
	        //write your code below:
	    	Scanner scan = new Scanner(System.in);
	        int option = scan.nextInt() ;
	        double num1, num2, result ;
	        
	        if ( option == 1){
	            System.out.print("Enter the first number: ");
	            num1 = scan.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scan.nextDouble();
	            result = num1 + num2;
	            System.out.println("The sum of the numbers " + num1 + " and " +  num2  + " is = " + result);
	            
	        } else if (option ==2 ) {
	            System.out.print("Enter the first number: ");
	            num1 = scan.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scan.nextDouble();
	            result = num1 - num2;
	            System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is = " + result);
	            
	        } else if (option == 3) {
	            System.out.print("Enter the first number: ");
	            num1 = scan.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scan.nextDouble();
	            result = num1 * num2;
	            System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
	            
	        } else if (option == 4) {
	            System.out.print("Enter the first number: ");
	            num1 = scan.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scan.nextDouble();
	            result = num1 / num2;
	            System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + result);
	            
	            System.out.println("The remainder is " + num1 % num2);
	        } else if (option == 5) {
	            System.out.print("Enter the number to find square: ");
	            num1 = scan.nextDouble();
	            result = num1 * num1;
	            System.out.println("The Square of the number" +  num1 + " is = " + result);
	            
	        } else if (option == 6){
	            System.out.print("Enter the number to find square root: ");
	            num1 = scan.nextDouble();
	            result = Math.sqrt(num1);
	            System.out.println("The Square of the number" +  num1 + " is = " + result);
	            
	        } else if(option == 7){
	            System.out.print("Enter the number to find Reciprocal: ");
	            num1 = scan.nextDouble();
	            result = 1/ num1;
	            System.out.println("The Reciprocal of the number" +  num1 + " is = " + result);
	        }
	        else {
	            System.out.println("Invalid choice");
	        }
	       scan.close();
	    }
	}