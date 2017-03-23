package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task4a_IsPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Read the input and put it in charArray
        String palindrome = scanner.nextLine();
        char[] palindromeArray = palindrome.toCharArray();
        System.out.println(IsPalindrome(palindromeArray));
    }
//     Make a method that returns boolean value 
    public static boolean IsPalindrome(char[] words) {
        int digit = 0;
        int digit2 = words.length - 1;
        while (digit2 > digit) {
            if (words[digit] != words[digit2]) {
                return false;
            }
            digit++;
            digit2--;
        }
        return true;
    }
}
