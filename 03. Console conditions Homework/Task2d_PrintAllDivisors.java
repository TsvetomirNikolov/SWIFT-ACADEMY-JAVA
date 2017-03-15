package com.company;

import java.util.Scanner;


public class Task2d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        for (int startIndex = 1; startIndex <= inputDigit ; startIndex++) {
            if (inputDigit % startIndex == 0) {
                System.out.print(startIndex + " ");
            }
        }
    }
}

