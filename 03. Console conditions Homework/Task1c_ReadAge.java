package com.company;


import java.util.Scanner;

public class Task1c_ReadAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearsOfHuman = Integer.parseInt(scanner.nextLine());
        if (yearsOfHuman >= 18) {
            System.out.println("YES");
        }
        else if (yearsOfHuman<18 && yearsOfHuman > 0) {
            System.out.println("NO");
        }
        else if (yearsOfHuman <= 0) {
            System.out.println("ERROR");
        }
    }
}

