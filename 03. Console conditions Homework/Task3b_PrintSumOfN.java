
package pkg03.console.applications;

import java.util.Arrays;
import java.util.Scanner;


public class Task3b_PrintSumOfN {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        First way to find sum of digits
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        for (int start = 1; start <= inputDigit; start++) {
            int secondInput = scanner.nextInt();
            sumOfDigits += secondInput;
        }
        System.out.println(sumOfDigits);
//       Second way to find sum of digits
        int inputDigits = Integer.parseInt(scanner.nextLine());
        int[] sumOfsecondDigits = new int[inputDigits];
        for (int start = 0; start < inputDigits; start++) {

            sumOfsecondDigits[start] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.stream(sumOfsecondDigits).sum());
    }
}

    

