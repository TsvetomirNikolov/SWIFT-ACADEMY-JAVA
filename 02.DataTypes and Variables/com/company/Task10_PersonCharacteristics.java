package com.company;

import java.util.Scanner;


public class Task10_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        short dateOfBirth = Short.parseShort(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        short height = Short.parseShort(scanner.nextLine());
        String proffesion = scanner.nextLine();
//        Formmating the result.
        System.out.println(String.format("%1s %2s is %3d years old. " +
                "His weight is %4.1f and he is %5d cm tall. He is %6s.",firstName,lastName,2017-dateOfBirth,weight,height,proffesion));
    }
}

