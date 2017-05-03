package pkg10.data.structuress;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task6_WordReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numberWords = Integer.parseInt(scanner.nextLine());
        Map<String, String> dictionary = new HashMap<>();
        String endResult = "";
        String inputWords;
        for (int i = 0; i < numberWords; i++) {
            String[] words = scanner.nextLine().split(" ");
            dictionary.put(words[0].trim().toLowerCase(), words[1].trim().toLowerCase());
        }
        String[] inputToArray = input.split(" ");
        for (int i = 0; i < inputToArray.length; i++) {
            inputWords = inputToArray[i];
            if (dictionary.containsKey(inputToArray[i].toLowerCase())) {
                inputToArray[i] = dictionary.get(inputWords.toLowerCase());
            }
        }
        for (String string : inputToArray) {
            endResult += string + " ";
        }
        System.out.println(endResult);
    }
}
