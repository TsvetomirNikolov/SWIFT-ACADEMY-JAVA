package Task2_Bank;

public class DepositAccount extends Account {

    public DepositAccount(int iban, String owner, double balance, double monthlyInterestRate) {
        super(owner, balance, monthlyInterestRate);
    }

    public void deposit(double amount) {
        super.balance += amount;
    }

    public void withdraw(double amount) {
        super.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    
}
