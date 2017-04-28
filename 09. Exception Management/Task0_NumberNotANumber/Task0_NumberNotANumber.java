package Task0_NumberNotANumber;

import java.util.Scanner;

public class Task0_NumberNotANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            try {
                Integer.parseInt(input);
                System.out.println("Number");
            } catch (NumberFormatException ex) {
                System.out.println("Not a number");
            }
        }
    }
}
