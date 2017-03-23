package pkg04.arrays.and.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task3a_PrintLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        First way to find max value in array
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int[] maxNumber = new int[inputDigit];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputDigit; i++) {
            maxNumber[i] = scanner.nextInt();
        }
        for (int i = 0; i < inputDigit; i++) {
            if (maxNumber[i] > max) {
                max = maxNumber[i];
            }
        }
        System.out.println(max);
//        Second way to fin max number in array
        int inputDigits = Integer.parseInt(scanner.nextLine());
        int[] arrayWithMaxNumber = new int[inputDigits];
        for (int i = 0; i < inputDigits; i++) {
            arrayWithMaxNumber[i] = scanner.nextInt();
        }
        System.out.println(Arrays.stream(arrayWithMaxNumber).max());
    }
}
