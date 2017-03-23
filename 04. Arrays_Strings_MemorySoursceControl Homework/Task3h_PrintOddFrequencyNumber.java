package pkg04.arrays.and.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task3h_PrintOddFrequencyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int[] a = new int[inputDigit];
        for (int i = 0; i < inputDigit; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(oddElements(a)));
    }

    public static int[] oddElements(int[] arrayInput) {
        if (arrayInput.length < 2) {
            return arrayInput;
        }
        int[] sorted = arrayInput.clone();
        Arrays.sort(sorted); // We sort the array.
        boolean odd = true;
        int len = 0;
        for (int i = 1; i < sorted.length; ++i) {
            if (sorted[i] == sorted[i - 1]) { // If current iteration is equal to previous iteration the odd element is different
                odd = !odd;
            } else {
                if (odd) {
                    sorted[len++] = sorted[i - 1];
                }
                odd = true;
            }
        }
        if (odd) {
            sorted[len++] = sorted[sorted.length - 1];
        }
        return Arrays.copyOf(sorted, len);
    }
}
