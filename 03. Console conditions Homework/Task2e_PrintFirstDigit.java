package com.company;
import java.util.Scanner;


public class Task2e_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        First way to get first digit
        String input = scanner.nextLine();
        char[] arrayDigits = input.toCharArray();
        int firstDigit = arrayDigits[0] - '0';
        System.out.println(firstDigit);
//        Second way to get first digit
        int secondInput = Integer.parseInt(scanner.nextLine());
        int divider = secondInput;
        while (secondInput != 0) {
            secondInput%=10;
            divider /=secondInput;
        }
        System.out.println(divider);
    }
}

