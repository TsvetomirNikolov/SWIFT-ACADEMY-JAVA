package com.company;
import java.util.Scanner;


public class Task5_InchToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputCM = Double.parseDouble(scanner.nextLine()); // We could use double inputCM = scanner.nextDouble();
        double result  = inputCM*2.54;
        System.out.printf("%.4f",result);
    }
}
