package pkg03.console.applications;

import java.util.Scanner;

public class Task2i_ToBinaryAndHexa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Read int digit from console 
        int digitToConvert = scanner.nextInt();
//        Create a StringBuilder for reversed values
        StringBuilder sb = new StringBuilder();
        while (digitToConvert > 0) {
            int reverse = digitToConvert % 2;
            sb.append(reverse);
            digitToConvert = digitToConvert / 2;
        }
        System.out.println(sb.reverse());
        System.out.println(ConvertToHexadecimal(digitToConvert));
    }
//    Create a method which convert digit to hexadecimal
    public static String ConvertToHexadecimal(int digits) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int reminder = 0;
        String secondString = "";
        char hexadecimal[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (digit > 0) {
            reminder = digit % 16;
            secondString = hexadecimal[reminder] + secondString;
            digit = digit/ 16;
        }
        return secondString;
    }
}


