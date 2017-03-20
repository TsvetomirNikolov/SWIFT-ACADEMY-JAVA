package pkg03.console.applications;

import java.util.Scanner;

public class Task4b_PrintZfigure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
//        Use two nested loops to print the Z figure
        for (int row = 0; row < input; row++) {
            for (int column = 0; column < input; column++) {
                if (row == 0 || row == input - 1 || column == input - 1 - row) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
