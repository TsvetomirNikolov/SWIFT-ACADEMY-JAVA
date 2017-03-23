package pkg04.arrays.and.strings;

import java.util.Scanner;


public class Task3c_PrintClusterCount {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int[] clusterArray = new int[inputDigit];
        int counter = 0;
        int max = 0;
        int start = 0;
        int secondCounter = 0;
        for (int i = 0; i < inputDigit; i++) {
            clusterArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < clusterArray.length - 1; i++) {
            if (clusterArray[i] == clusterArray[i + 1]) {
                counter++;
                if (counter > max) {
                    start = i - counter;
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        for (int i = start + 1; i <= start + max + 1; i++) {
            secondCounter++;
        }
        System.out.println(secondCounter);
    }
}

    

