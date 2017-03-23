package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task2c_PrintMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = scanner.nextInt();
        int row = 4;
        int col = 4;
        int[][] matrix = new int[row][col];
        int index = 1;
        for (int i = row - 1; i >= 0; i--) {
            int startRight = i;
            for (int j = 0; j < row - startRight; j++) {
                if (j > col - 1) {
                    break;
                }
                matrix[startRight + j][j] = index;
                index++;
            }
        }
        for (int i = 1; i < col; i++) {
            int startC = i;
            for (int j = 0; j < col - startC; j++) {
                if (j > row - 1) {
                    break;
                }
                matrix[j][startC + j] = index;
                index++;
            }
        }
        for (int i = inputDigit - 1; i >= 0; i--) {
            for (int j = 0; j < inputDigit; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
