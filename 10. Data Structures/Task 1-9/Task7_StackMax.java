package pkg10.data.structuress;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task7_StackMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Deque<Integer> stack = new ArrayDeque<>();
        while (!input.equalsIgnoreCase("END")) {
            input = scanner.nextLine();
            String[] inputToArray = input.split(" ");
            switch (inputToArray[0]) {
                case "PUSH":
                    stack.push(Integer.parseInt(inputToArray[1]));
                    break;
                case "POP":
                    System.out.println(stack.pop());
                    break;
                case "MAX":
                    getMaxElement(stack);
                    break;
            }
        }
        stack.forEach(integer -> System.out.print(integer + " "));
    }

    private static void getMaxElement(Deque<Integer> stack) {
        int maxDigit = 0;
        for (Integer digit : stack) {
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
        System.out.println(maxDigit);
    }
}
