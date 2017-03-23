package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task2d_PrintMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());
        int row = 4;
        int col = 4;
        int[][] matrix = new int[row][col];
        int number = 1;
        int indexR = 0;
        int indexC = 0;
        while (number <= row * col) {
            matrix[indexR][indexC] = number;
            number++;
            boolean isDown = (indexR + 1) < row && matrix[indexR + 1][indexC] == 0 && !((indexC - 1) >= 0 && matrix[indexR][indexC - 1] == 0);
            if (isDown) {
                indexR++;
                continue;
            }
            boolean isRight = (indexC + 1) < col && matrix[indexR][indexC + 1] == 0;
            if (isRight) {
                indexC++;
                continue;
            }
            boolean isUp = (indexR - 1) >= 0 && matrix[indexR - 1][indexC] == 0;
            if (isUp) {
                indexR--;
                continue;
            }
            boolean isLeft = (indexC - 1) >= 0 && matrix[indexR][indexC - 1] == 0;
            if (isLeft) {
                indexC--;
                continue;
            }
            for (int i = 0; i < digit; i++) {
                for (int j = 0; j < digit; j++) {
                    System.out.printf("%4d", matrix[j][i]);
                }
                System.out.println();
            }
        }
        //        Second way with help from internet
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int A[][] = new int[input][input];
        int k = 1;
        int c1 = 0;
        int c2 = input - 1;
        int r1 = 0;
        int r2 = input - 1;

        while (k <= input * input) {
            for (int i = c1; i <= c2; i++) {
                A[r1][i] = k++;
            }
            for (int j = r1 + 1; j <= r2; j++) {
                A[j][c2] = k++;
            }
            for (int i = c2 - 1; i >= c1; i--) {
                A[r2][i] = k++;
            }
            for (int j = r2 - 1; j >= r1 + 1; j--) {
                A[j][c1] = k++;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        // Printing the Circular matrix
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }
    }
}
