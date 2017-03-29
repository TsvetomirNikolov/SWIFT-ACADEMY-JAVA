package pkg05.objects.and.classess.Task1_Methods;

import java.util.Scanner;

public class Task1a_Printing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        printNameandYears(age, name);
        System.out.println();
    }

    public static void printNameandYears(int age, String name) {
        System.out.printf("%s is %d years old", name, age);
    }
}
