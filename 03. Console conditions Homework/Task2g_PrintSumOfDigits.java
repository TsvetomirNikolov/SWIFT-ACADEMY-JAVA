package com.company;

import java.util.Scanner;


public class Task2g_PrintSumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        First way read input as string and conver toCharArray
        String inputAsString = scanner.nextLine();
        char[] array = inputAsString.toCharArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i] - '0';
        }
        System.out.println(sum);
      //  Second Classic way
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int divider = inputDigit;
        while(inputDigit != 0){
            sum+=inputDigit%10;
            inputDigit /= 10;
        }
        System.out.println(sum1);
    }
}

