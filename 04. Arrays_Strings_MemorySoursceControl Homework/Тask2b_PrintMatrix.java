package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Тask2b_PrintMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());
        int row = 4;
        int col = 4;
        int[][] matrix = new int[row][col];
        int number = 1;
        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < digit; j++) {
                if (i % 2 == 0) {
                    matrix[j][i] = number;
                    number++;
                } else {
                    matrix[row - 1 - j][i] = number;
                    number++;
                }
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
