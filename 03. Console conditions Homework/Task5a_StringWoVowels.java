package pkg03.console.applications;

import java.util.Scanner;


public class Task5a_StringWoVowels {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int start = 0; start < input.length(); start++) {
//            Check every one charackter in input string
          char letter = input.charAt(start);
             if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                continue;
            }
             System.out.print(letter);
        }
    }
}
    

