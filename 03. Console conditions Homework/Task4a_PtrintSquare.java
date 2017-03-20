package pkg03.console.applications;

import java.util.Scanner;

public class Task4a_PtrintSquare {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatStr("* ", input));
        for (int row = 0; row < input - 2; row++) {
            System.out.print("*");
            for (int i = 0; i < input - 2; i++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println(" *");
        }
        System.out.println(repeatStr("* ", input));
    }
//    Create a method that returns string which is repeated
    public static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
