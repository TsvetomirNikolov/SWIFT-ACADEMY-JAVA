package pkg06.oop.principles.and.debbugind.Task3_BankManagement;

import pkg06.oop.principles.and.debbugind.Task2_CredentialsManager.Credentials;

public class Account {

    private String _name;
    private String _govId;
    private double _balance;
    private Credentials _credentials;

    public Account(String username, String password, String name, String govId) {
        this._name = name;
        this._govId = govId;
        this._credentials = new Credentials(username, password);
    }

    void deposit(double amount) {
        if (amount > 0) {
            _balance += amount;
        }
    }

    void withdraw(double amount) {
        if (_balance - amount > 0) {
            _balance -= amount;
        }
    }

    public boolean hasAccess(String password) {
        return _credentials.matchPassword(password);
    }

    String getName() {
        return _name;
    }

    String getGovId() {
        return _govId;
    }

    String getUsername() {
        return _credentials.getUsername();
    }

    double getBalance() {

        return _balance;
    }
}
