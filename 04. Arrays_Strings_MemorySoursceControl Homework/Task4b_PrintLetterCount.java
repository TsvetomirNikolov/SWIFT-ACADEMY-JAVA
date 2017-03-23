
package pkg04.arrays.and.strings;

import java.util.Scanner;


public class Task4b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] counters = new int[0x100];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            counters[(int) c]++;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c+ "("+ counters[(int) c] + ")");
        }
    }
}
    

