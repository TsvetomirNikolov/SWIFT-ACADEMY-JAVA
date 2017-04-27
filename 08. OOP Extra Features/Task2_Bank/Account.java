package Task2_Bank;

public class Account {

    protected int iban = 1;
    protected String owner;
    protected double balance;
    protected double montlyInterestRate;

    public Account(String owner, double balance, double monthlyInterestRate) {
        this.iban = iban++;
        this.owner = owner;
        this.balance = balance;
        this.montlyInterestRate = monthlyInterestRate;
    }

    public Account() {
        this.iban = iban++;
    }

    public void setIban(int iban) {
        this.iban += 1;
    }

    public int getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return String.format("%08d", this.getIban());
    }
}
