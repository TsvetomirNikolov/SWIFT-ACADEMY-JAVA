package Task2_Bank;

import Task2_Bank.Customer.*;

public class Account {

    protected int iban = 1;
    protected double balance;
    protected double montlyInterestRate;
    protected Customer owners;

    public Account(int iban, double balance, double monthlyInterestRate, Customer owners) {
        this.iban = iban++;
        this.balance = balance;
        this.montlyInterestRate = monthlyInterestRate;
        this.owners = owners;
    }

    public Account() {
        this.iban = iban;
    }

    public void montlyInterestRate(double count) {

    }

    public double calculateInterestAmount(Customer owner, Account account, int monthNumber) {
        if (owner instanceof IndividualCustomer) {
            return calculateInterestAmount((IndividualCustomer) owner, owner.getAccount().get(0), monthNumber);
        } else {
            return calculateInterestAmount((CompanyCustomer) owner, owner.getAccount().get(0), monthNumber);
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void setIban(int iban) {
        this.iban = iban++;
    }

    public int getIban() {
        return iban;
    }

    public Customer getOwners() {
        return owners;
    }
}
