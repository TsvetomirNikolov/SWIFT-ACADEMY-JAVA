package Task2_Bank.Customer;

import Task2_Bank.Account;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private ArrayList<Account> _account;

    public Customer(String name) {
        this._name = name;
    }

    public void addAccount(Account acc) {
        _account.add(acc);
    }

    public ArrayList<Account> getAccount() {
        return _account;
    }

    public String getName() {
        return _name;
    }
}
