package pkg03.console.applications;

import java.util.Scanner;


public class Task5c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Split the input and print the iterations on new line 
        String[] inputSentence = scanner.nextLine().split("[.:?:!]");
        for (int startIndex = 0; startIndex < inputSentence.length; startIndex++) {
            System.out.printf("%s.\n",inputSentence[startIndex].trim());
        }
    }
}
    

