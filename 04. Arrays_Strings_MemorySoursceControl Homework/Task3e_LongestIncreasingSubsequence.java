package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task3e_LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int[] subsequenceArray = new int[inputDigit];
        int start = 0;
        int counter = 0;
        int max = 0;
        for (int i = 0; i < inputDigit; i++) {
            subsequenceArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < subsequenceArray.length - 1; i++) {
            if (subsequenceArray[i] <= subsequenceArray[i + 1] - 1) {
                counter++;
                if (counter > max) {
                    start = i - counter;
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        for (int i = start + 1; i <= start + max + 1; i++) {
            System.out.print(subsequenceArray[i] + " ");
        }
        System.out.println();
    }
}
