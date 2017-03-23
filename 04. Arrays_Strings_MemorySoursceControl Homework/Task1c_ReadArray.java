
package pkg04.arrays.and.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task1c_ReadArray {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int[] arrayInput = new int[firstDigit];
        for (int i = 0; i < firstDigit; i++) {
            arrayInput[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int startInteral : arrayInput) {
            System.out.print(startInteral + ",");
        }
//        or
          System.out.println(Arrays.toString(arrayInput));
    }
}
    

