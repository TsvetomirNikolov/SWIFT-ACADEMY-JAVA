package Task2_Bank;

import Task2_Bank.Customer.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer openCustomer(String customerTypeCode, String name) {
        Customer customer = null;
        if (customerTypeCode.equals("1")) {
            customer = new IndividualCustomer(name);
        } else {
            customer = new CompanyCustomer(name);
        }
        customers.add(customer);
        return customer;
    }

    public Account openAccount(String typeOfAccount, double balance, double interestRate, Customer owner) {
        Account account = null;
        if (typeOfAccount.equals("1")) {
            account = new DepositAccount(4, balance, interestRate, owner);
        } else if (typeOfAccount.equals("2")) {
            account = new LoanAccount(4, balance, interestRate, owner);
        } else if (typeOfAccount.equals("3")) {
            account = new MortgageAccount(4, balance, interestRate, owner);
        }
        accounts.add(account);
        owner.addAccount(account);
        return account;
    }

    public void depositAnAmount(String input, double amount) {
        Customer owner = getCustomersName(input);
        if (owner != null) {
            owner.getAccount().get(0);
            return;
        }
        Account acc = getAccountByIBAN(input);
        if (acc != null) {
            acc.getIban();
            return;
        }
        throw new NoSuchElementException("Bank has no client/account " + input);
    }

    public void withdrawAmount(String input, double amount) {
        Customer owner = getCustomersName(input);
        if (owner != null) {
            owner.getAccount().get(0);
            return;
        }
        Account account = getAccountByIBAN(input);
        if (account != null) {
            account.getIban();
            return;
        }
        throw new NoSuchElementException("Bank has no client/account " + input);
    }

    public double montlyInterestRate(Customer owner, int monthNumber) {
        if (owner instanceof IndividualCustomer) {
            return montlyInterestRate(owner, monthNumber);
        } else {
            return montlyInterestRate(owner, monthNumber);
        }
    }

    private Customer getCustomersName(String name) {
        for (Customer cs : customers) {
            if (cs.getName().equals(name)) {
                return cs;
            }
        }
        return null;
    }

    private Account getAccountByIBAN(String input) {
        for (Account acc : accounts) {
            if (acc.getIban() == 1) {
                return acc;
            }
        }
        return null;
    }
}
