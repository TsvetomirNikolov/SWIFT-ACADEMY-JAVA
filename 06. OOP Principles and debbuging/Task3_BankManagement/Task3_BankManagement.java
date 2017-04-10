package pkg06.oop.principles.and.debbugind.Task3_BankManagement;

import java.util.Scanner;

public class Task3_BankManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        while (true) {
            String input = scanner.nextLine();
            String[] inputSplit = input.split(" ");
            if (input.equals("END")) {
                break;
            }
            bankOperations(bank, inputSplit);
        }
        System.out.println(bank.toString());
    }

    private static void bankOperations(Bank bank, String[] inputSplit) {
        switch (inputSplit[0]) {
            case "OPEN":
                bank.openAccount(inputSplit[1], inputSplit[2], inputSplit[3], inputSplit[4]);
                return;
            case "CLOSE":
                bank.closeAccount(inputSplit[1], inputSplit[2]);
                return;
            case "DEPOSIT":
                bank.deposit(inputSplit[1], Double.parseDouble(inputSplit[2]));
                return;
            case "WITHDRAW":
                bank.withdraw(inputSplit[1], inputSplit[2], Double.parseDouble(inputSplit[3]));
                return;
            case "TRANSFER":
                bank.transfer(inputSplit[1], inputSplit[2], Double.parseDouble(inputSplit[3]), inputSplit[4]);
        }
    }
}
