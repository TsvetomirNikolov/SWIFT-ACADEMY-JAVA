package pkg10.data.structuress;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (int i = 0; i < firstNumber; i++) {
            firstSet.add(scanner.nextInt());
        }
        for (int i = 0; i < secondNumber; i++) {
            secondSet.add(scanner.nextInt());
        }
        Set<Integer> commonSet = new HashSet<>(firstSet);
        commonSet.retainAll(secondSet);
        if (commonSet.isEmpty()) {
            System.out.println("NO");
        } else {
            commonSet.stream().forEach((i) -> {
                System.out.print(i + " ");
            });
            System.out.println();
        }
    }
}
