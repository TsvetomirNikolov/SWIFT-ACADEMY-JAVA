package pkg05.objects.and.classess.Task1_Methods;

import java.util.Scanner;

public class Task1b_AreEqual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        System.out.println(isEqualOrNot(firstDigit, secondDigit));
    }

    public static boolean isEqualOrNot(int firstDigit, int secondDigit) {
        if (firstDigit == secondDigit) {
            return true;
        }
        return false;
    }
}
