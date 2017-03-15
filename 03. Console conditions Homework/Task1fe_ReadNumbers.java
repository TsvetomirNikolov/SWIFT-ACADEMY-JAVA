package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task1fe_ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        This is task 1e_ReadNumbers
        int input = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input ; i++) {
            int inputs = scanner.nextInt();
            list.add(inputs);
        }
        for (Integer counter : list) {
            System.out.println(counter);
        }
    }
}

