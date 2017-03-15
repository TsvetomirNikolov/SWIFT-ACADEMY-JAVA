package com.company;

import java.util.Scanner;

public class Task8_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextInt();
//        Find days, hours, minutes and seconds
        long sec = seconds % 60;
        long minutes = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        long days = seconds / 86400;
        System.out.println(String.format("%1d days,%2d hours,%3d minutes,%4d sec",days,hours,minutes,sec));
    }
}




