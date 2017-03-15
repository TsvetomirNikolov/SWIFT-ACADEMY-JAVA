package com.company;

import java.util.Scanner;


public class Task3_IsAduls {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
//        Read an Integer digit from the console
        int age = Integer.parseInt(scanner.nextLine());
        boolean isAdult = false;
//        Make if statement
        if (age > 18) {
            isAdult = true;
            System.out.println(isAdult);
        }
        else{
            System.out.println(isAdult);
        }
    }
}

