package Task2_Bank;

import Task2_Bank.Customer.Customer;

public class LoanAccount extends Account {

    public LoanAccount(int iban,  double balance, double monthlyInterestRate, Customer owners) {
        super(iban, balance, monthlyInterestRate,owners);
    }

    private double interest(int months, int client) {
        if (months <= 3 && client == 1) {
            super.montlyInterestRate = 0;
        } else if (months <= 2 && client == 2) {
            super.montlyInterestRate = 0;
        }
        return super.montlyInterestRate;
    }

    private double getBalance() {
        return balance;
    }

}
