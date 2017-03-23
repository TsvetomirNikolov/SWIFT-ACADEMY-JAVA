package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task4e_BracketMatching {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arrayFromInput = input.toCharArray(); // Put the input string in char array
        System.out.println(CheckForRepeatingChars(arrayFromInput));
    }

    public static boolean CheckForRepeatingChars(char charArray[]) {
        int point = 0;
        for (int i = 0; i < charArray.length; i++) // Array length of char and check every one if is equal to iterations
        {
            char check = charArray[i];
            for (int j = 0; j < point; j++) {
                if (check == charArray[j]) {
                    return false;
                } else if (check != charArray[j]) {
                    return true;
                }
            }
            point ++; // At this time we now have a new character
        }
        return true;
    }
}
