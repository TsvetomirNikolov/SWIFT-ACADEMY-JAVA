package Task2_Bank;

import Task2_Bank.Customer.Customer;

public class MortgageAccount extends Account {

    public MortgageAccount(int iban,  double balance, double monthlyInterestRate, Customer owners) {
        super(iban, balance, monthlyInterestRate, owners);
    }

    private double interest(int months, int client) {
        if (months <= 6 && client == 1) {
            super.montlyInterestRate = 0;
        } else if (months >= 0 && client == 2) {
            super.montlyInterestRate += super.balance * 0.5;
        }
        return super.montlyInterestRate;
    }

    public double getBalance() {
        return balance;
    }
}
