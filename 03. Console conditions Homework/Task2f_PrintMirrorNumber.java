package com.company;
import java.util.Scanner;


public class Task2f_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        First way with StringBuilder :)
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        int digit = Integer.parseInt(sb.toString());
        System.out.println(digit);
//        Second standard way
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int tempDigit = 0;
        while (inputDigit != 0) {
            tempDigit = inputDigit % 10;
            System.out.print(tempDigit);
            inputDigit = inputDigit / 10;
        }
    }
}



