package Task2_Bank;

import Task2_Bank.Customer.Customer;
import java.io.BufferedReader;
import static java.lang.Compiler.command;
import java.util.Scanner;

public class Task2_Bank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
            String[] arrayInput = line.split(" ");
            Customer customer = new Customer(arrayInput[1]);
            int index = 1;
            double balance = 0.0;
            double monthly = 0.0;
            Account acc = null;
            switch (arrayInput[0].toUpperCase()) {
                case "OPEN":
                    acc = new Account(index, balance, monthly, customer);
                    System.out.printf("%08d\n", acc.getIban());
                    break;
                case "PUT":
                    bank.depositAnAmount(arrayInput[1], Double.parseDouble(arrayInput[2]));
                    break;
                case "GET":
                    bank.withdrawAmount(arrayInput[1], Double.parseDouble(arrayInput[2]));
                    break;
                case "INFO":
                    System.out.println(bank.montlyInterestRate(customer, Integer.parseInt(arrayInput[2])));
                    break;
            }
        }
    }
}
