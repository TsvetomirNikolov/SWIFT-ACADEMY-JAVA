package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task1e_Print2dArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 4;
        int col = 4;
        int[][] matrix = new int[row][col];
        int index = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[j][i] = index;
                index++;
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }
    }
}
