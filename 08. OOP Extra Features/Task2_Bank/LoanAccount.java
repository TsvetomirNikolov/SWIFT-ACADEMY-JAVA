package Task2_Bank;

public class LoanAccount extends Account {

    public LoanAccount(int iban, String owner, double balance, double monthlyInterestRate) {
        super( owner, balance, monthlyInterestRate);
    }

    private void deposit(double amount) {
        if (super.balance > 0) {
            super.balance += amount;
        }
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
