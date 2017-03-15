package com.company;

import java.util.Scanner;


public class Task1a_ReadInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int digit = Integer.parseInt(scanner.nextLine());
        digit++;
        System.out.println(digit);

    }
}

