package com.company;

import java.util.Scanner;


public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Create a second variable to store the result
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int startNumber = 0;
        for (int start = 1; start <= inputDigit; start++) {
            startNumber+=start;
        }
        System.out.println(startNumber);
    }
}


