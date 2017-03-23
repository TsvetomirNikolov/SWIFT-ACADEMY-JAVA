package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task4c_CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String encodeOrDecode = scanner.nextLine();
        if (encodeOrDecode.equals("encode")) {
            String convertedString = "";
            for (char c : input.toCharArray()) {
                convertedString += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
            }
            System.out.println(convertedString);
        } else {
            String convertedString = "";
            for (char c : input.toCharArray()) {
                convertedString += Character.toString((char) (((c - 'a' - 1) % 26) + 'a'));
            }
            System.out.println(convertedString);
        }
    }
}
