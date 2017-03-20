package pkg03.console.applications;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3c_PrintOnlyEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        First way to do print the even numbers 
        int inputDigit = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> evenDigits = new ArrayList<>();
        for (int start = 1; start <= inputDigit; start++) {
            int readDigits = scanner.nextInt();
            if (readDigits % 2 == 0) {
                evenDigits.add(readDigits);
            }
        }
        System.out.println(evenDigits);
//        Second way to print the even numbers 
        int inputDigits = Integer.parseInt(scanner.nextLine());
        for (int start = 0; start < inputDigits; start++) {
            int secondInput = scanner.nextInt();
            if (secondInput % 2 == 0) {
                System.out.println(secondInput + " ");
            }
        }
    }
}
