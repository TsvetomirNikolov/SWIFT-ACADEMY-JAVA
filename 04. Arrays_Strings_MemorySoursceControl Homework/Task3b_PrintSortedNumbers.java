package pkg04.arrays.and.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintSortedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int[] sortArray = new int[inputDigit];
        for (int i = 0; i < inputDigit; i++) {
            sortArray[i] = scanner.nextInt();
        }
        Arrays.sort(sortArray);
        for (int start : sortArray) {
            System.out.print(start + " ");
        }
    }
}

