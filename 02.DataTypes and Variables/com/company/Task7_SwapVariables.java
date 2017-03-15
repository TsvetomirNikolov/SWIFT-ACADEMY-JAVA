package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;


public class Task7_SwapVariables {

    public static void main(String[] args) {
//        First decision
        Scanner scanner = new Scanner(System.in);
        short firstDigit = scanner.nextShort();
        short secondDigit = scanner.nextShort();
        short temporary = firstDigit;
        firstDigit=secondDigit;
        secondDigit=temporary;
        System.out.printf("%d %d",firstDigit,secondDigit);
//        Second decision - bitwise operation
        int firstDigits = scanner.nextInt();
        int secondDigits = scanner.nextInt();
        firstDigits = firstDigits ^ secondDigits ^ (secondDigits = firstDigits);
        System.out.printf("%d %d",firstDigits,secondDigits);
//        Third decision - linear abstract structure Stack
        int first = scanner.nextInt();
        int second = scanner.nextInt();
//         We done stack and push the values in it.
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(first);
        stack.push(second);
//         Do while cycle to empty the stack. Last value come out first.
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

