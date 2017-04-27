package Task2_Bank;

import java.io.BufferedReader;
import java.util.Scanner;

public class Task2_Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
            String[] arrayInput = line.split(" ");
            String owner = arrayInput[0];
            int index = 1;
            double balance = 0.0;
            double monthly = 0.0;
            Account acc = null;
            switch (arrayInput[0].toUpperCase()) {
                case "OPEN":
                    balance = Double.parseDouble(arrayInput[3]);
                    monthly = Double.parseDouble(arrayInput[4]);
                    acc = new Account(owner, monthly, balance);
                    System.out.println(acc.toString());
                    break;
                case "PUT":

                    break;
                case "GET":
                    break;
                case "INFO":
                    break;
            }
        }
    }
}
