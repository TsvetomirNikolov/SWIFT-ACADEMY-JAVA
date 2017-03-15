package com.company;

import java.util.Scanner;


public class Task2b_PrintNonDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
//        Create for loop to see the digits between 1 and inputDigit
        for (int divider = 1; divider <= inputDigit ; divider++) {
            if (divider % 3 == 0 || divider % 7 == 0  ) {
                continue; //  We continue and print the digits
            }
            System.out.print(divider + " ");
        }
    }
}

