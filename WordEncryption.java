package com.java.course.week1;

import java.util.Scanner;

public class WordEncryption {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] chars = word.toCharArray();

        StringBuilder dc = new StringBuilder();
        for (char chr : chars) {
            if (chr != 'Z' && chr != 'z' && Character.isLetter(chr)) {
                int valueNextAsci = (int) chr + 1;
                dc.append((char) valueNextAsci);

            } else if (chr == 'z') {
                dc.append('a');

            } else if (chr == 'Z') {
                dc.append('A');

            } else if(Character.isDigit(chr)){
                dc.append(chr);
            
            }else {

                dc.append(chr);
        }
        System.out.println(dc);
    }
        scan.close();
}
}