
package pkg03.console.applications;

import java.util.Scanner;


public class Task5d_SumOfNumbersInString {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.nextLine();
        int sumOfDigits = 0;
        int value = 0;
//        Use switch case for digits from 0 to 9 
        for (int startIndex = 0; startIndex < inputSentence.length(); startIndex++) {
            char stringToChar = inputSentence.charAt(startIndex);
            switch (stringToChar) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    value = value*10 + (stringToChar - '0');
                    break;
                default:
                    sumOfDigits += value;
                    value = 0;
                    break;
            }
        }
        // Remember the last number.
        sumOfDigits += value;
        System.out.println(sumOfDigits);
    }
}

    

