package pkg04.arrays.and.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task3i_FindKInSorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int digitInArray = Integer.parseInt(scanner.nextLine());
        int[] array = new int[inputDigit];
        for (int i = 0; i < inputDigit; i++) {
            array[i] = scanner.nextInt();
        }
        if (Arrays.stream(array).anyMatch(i -> i == digitInArray)) { // The solution is from Java 8, find it in oracle help center.
            System.out.println(Arrays.binarySearch(array, digitInArray));

        } else {
            System.out.println("NO");
        }
    }
}

