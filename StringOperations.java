package com.java.course.week1;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        do {
            if (option == 1) {
                System.out.println("Palindrome Check");
                scan.nextLine();
                System.out.println("Enter a string:");
                String text = scan.nextLine();
                String reverseInput = "";

                // Fill in the code below to reverse the input string and store it in the reverseInput variable
                for (int i = text.length() - 1; i >= 0; i--) {
                    reverseInput = reverseInput + text.charAt(i);
                }

                if (text.equals(reverseInput)) {
                    System.out.print(text + " is a palindrome");
                } else {
                    System.out.println(text + " is not a palindrome");
                }
                break;
            } else if (option == 2) {
                scan.nextLine();
                System.out.println("Enter a string:");
                String text = scan.nextLine();
                StringBuilder reverseInput = new StringBuilder();

                for (int i = text.length() - 1; i >= 0; i--) {
                    reverseInput.append(text.charAt(i));
                }

                System.out.println(reverseInput);
                break;

            } else if (option == 3) {
                scan.nextLine();
                System.out.println("Enter First string:");
                String str1 = scan.nextLine();
                System.out.println("Enter Second string:");
                String str2 = scan.nextLine();

                System.out.println(str1 + str2);
                break;

            } else if (option == 4) {
                scan.nextLine();
                System.out.println("String Comparison");
                System.out.println("Enter First string:");
                String str1 = scan.nextLine();
                System.out.println("Enter Second string:");
                String str2 = scan.nextLine();
                System.out.println((str1.equals(str2)) ? "The entered strings are equal" : "The entered strings are not equal");
                break;
            } else if (option == 5) {
                scan.nextLine();
                System.out.println("Length of a string");
                System.out.println("Enter a string:");
                String str5 = scan.nextLine();
                System.out.println("The length of the entered string is: " + str5.length());
                break;
            } else {
                System.out.println("Invalid choice! Please make a valid choice.");
            }

        } while (option >= 1 && option <= 5);
        
        scan.close();

    }
}

