package pkg06.oop.principles.and.debbugind.Task1_CalculatorClient;

import java.util.Scanner;

public class Task1_CalculatorClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String operation = scanner.nextLine();
            String[] array = operation.split(" ");
            if (operation.equals("END")) {
                break;
            }
            double a = Double.parseDouble(array[1]);
            double b = Double.parseDouble(array[2]);
            String result = array[0];
            Calculator calculator = new Calculator(a, b, result);
            System.out.println(calculator.operationsWithDigits(a, b));
        }
    }
}
