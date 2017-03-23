package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task4d_ConvertibleStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String convertedString = scanner.nextLine();
        char[] charArray = convertedString.toCharArray();
        int index = 0;
        boolean isConvertable = true;
        int startIndex = 0;
        while (isConvertable && index < charArray.length) {
            inputString = inputString.substring(startIndex);
            startIndex = inputString.indexOf(charArray[index]);
            isConvertable = (startIndex != -1);
            index++;
        }
        if (index == charArray.length && isConvertable) {
            System.out.println(isConvertable);
        } else {
            isConvertable = false;
            System.out.println(isConvertable);
        }
    }
}


