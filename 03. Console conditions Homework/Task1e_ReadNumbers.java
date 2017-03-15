package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task1e_ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        This is task 1f_ReadNumbersOnNewLines
        int input = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            int secondInput = Integer.parseInt(scanner.nextLine());
            list.add(secondInput);
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}

