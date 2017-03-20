package pkg03.console.applications;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3d_PrintReversedSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       Read an int digit from console
        int inputDigit = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> reversedDigits = new ArrayList<>();
        for (int start = 0; start < inputDigit; start++) {
            int secondInput = scanner.nextInt();
            reversedDigits.add(secondInput);
        }
        Collections.reverse(reversedDigits);
        System.out.println(reversedDigits);
    }
}
