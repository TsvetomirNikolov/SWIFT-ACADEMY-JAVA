package pkg04.arrays.and.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task3g_LargestSumSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());
        int[] array = new int[digit];
        for (int i = 0; i < digit; i++) {
            array[i] = scanner.nextInt();
        }
        int[] maxSubArray = maxSumInSubArray(array);
        for (int maxElement : maxSubArray) {
            System.out.print(maxElement + " ");
        }
        System.out.println();
    }
//       We use Kadane's algorithm to find maximum subarray 

    public static int[] maxSumInSubArray(int array[]) {
        int maxSoFar = array[0];
        int maxEndingHere = array[0];
        int startIndex = 0;
        int endIndex = 0;
        int j = 1;
        for (; j < array.length; j++) {
            int val = array[j];
            if (val >= val + maxEndingHere) {
                maxEndingHere = val;
                startIndex = j;
            } else {
                maxEndingHere += val;
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                endIndex = j;
            }
        }
        return Arrays.copyOfRange(array, startIndex, endIndex + 1);// Make copyofRange to copy new max subsequence array
    }
}
