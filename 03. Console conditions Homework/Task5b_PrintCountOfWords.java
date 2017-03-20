package pkg03.console.applications;

import java.util.Scanner;


public class Task5b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Split the input with array 
        String[] arrayInput = scanner.nextLine().split("[,:.:!:?: ]");
        int counter = 0;
        for (int start = 0; start < arrayInput.length-1; start++) {
            counter++;
        }
        System.out.println(counter);
    }
}


