package pkg04.arrays.and.strings;
import java.util.Scanner;

public class Task1d_PrintString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            char array = inputString.charAt(i);
            System.out.println(array);
        }
    }
}
