package Task2_Bank;

public class MortgageAccount extends Account {

    public MortgageAccount(int iban, String owner, double balance, double monthlyInterestRate) {
        super(owner, balance, monthlyInterestRate);
    }

    public void deposit(double amount) {
        if (super.balance > 0) {
            super.balance += amount;
        }
    }

    private double interest(int months, int client) {
        if (months <= 6 && client == 1) {
            super.montlyInterestRate = 0;
        } else if (months >= 0 && client == 2) {
            super.montlyInterestRate += super.balance*0.5;
        }
        return super.montlyInterestRate;
    }

    public double getBalance() {
        return balance;
    }
}
