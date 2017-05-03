package pkg10.data.structuress;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < inputDigit; i++) {
            set.add(scanner.nextInt());
        }
        set.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println();
    }
}
