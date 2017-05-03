package Task2_Bank;

import Task2_Bank.Customer.Customer;

public class DepositAccount extends Account {

    public DepositAccount(int iban,  double balance, double monthlyInterestRate, Customer owners) {
        super(iban, balance, monthlyInterestRate, owners);
    }
}
