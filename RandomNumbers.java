package com.java.course.week1;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		        Random randomNumbers = new Random();
		        
		        int numberOfDigits = 4;
                int numberOfNumbers = 3;
        
        // Generate and print random numbers
        for (int i = 0; i < numberOfNumbers; i++) {
            String randomNumber = generateRandomNumber(randomNumbers, numberOfDigits);
            System.out.println(randomNumber);
        }
    }
    
    public static String generateRandomNumber(Random random, int length) {
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10); // Generate a random digit (0-9)
            numberBuilder.append(digit);
        }
        return numberBuilder.toString();
    }
}



