package pkg04.arrays.and.strings;
import java.util.Scanner;

public class Task3d_PrintSplitIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        int[] array = new int[inputDigit];
        int sumLeft = 0;
        int sumRight = 0;
        int endIndex = 0;
        int start = 0;
        for (int i = 0; i < inputDigit; i++) {
            array[i] = scanner.nextInt();
        }
        endIndex = array.length - 1;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += array[endIndex--];
            } else {
                sumLeft += array[start++];
            }
            if (start > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                }
            }
        }
        if (sumLeft == sumRight) {
            System.out.println(endIndex);
        } else if (sumLeft != sumRight) {
            System.out.println("NO");
        }
    }
}
