package pkg05.objects.and.classess.Task1_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Task1c_IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int[] arr1 = {6, 34, 78, 123, 432, 900, 343, 2, 235};
        Arrays.sort(arr1);
        System.out.println(findBinarySearch(arr1, key));
    }

    public static int findBinarySearch(int[] inputArr, int key) {
        Arrays.sort(inputArr);
        int start = 0;
        int end = inputArr.length - 1;
//        We can do it with Arrays.stream(inputArr).anyMatch(i -> i == key) way.
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
