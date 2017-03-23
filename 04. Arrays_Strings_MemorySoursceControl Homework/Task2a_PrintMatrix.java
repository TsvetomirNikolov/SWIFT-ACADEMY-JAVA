package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task2a_PrintMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int row = 4;
        int col = 4;
        int[][] matrix = new int[row][col];
        int index = 1;
        for (int i = 0; i < inputDigit; i++) {
            for (int j = 0; j < inputDigit; j++) {
                matrix[i][j] = index;
                System.out.printf("%4d", matrix[j][i]);
                index++;
            }
            System.out.println();
        }
    }
}
