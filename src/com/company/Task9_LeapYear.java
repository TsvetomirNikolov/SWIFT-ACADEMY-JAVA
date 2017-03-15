package com.company;

import java.util.Scanner;


public class Task9_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeapOrNot = true;
//        Check if the year is leap or not with if-else statement.
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
            System.out.println(isLeapOrNot);
        }
        else{
            isLeapOrNot = false;
            System.out.println(isLeapOrNot);
        }
    }
}


