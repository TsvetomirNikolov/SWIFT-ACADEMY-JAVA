package pkg06.oop.principles.and.debbugind.Task3_BankManagement;

public class Bank {

    private Account[] _account = new Account[5];
    private int _counter = 0;

    public void openAccount(String name, String govId, String username, String password) {
        if (_account.length == _counter) {
            System.out.println("OPEN fail");
            return;
        }
        Account temporary = new Account(name, govId, username, password);
        if (temporary != null) {
            _counter++;
            System.out.println("OPEN success");
            return;
        }
    }

    public void closeAccount(String username, String password) {
        for (int i = 0; i < _account.length; i++) {
            if (_account[i] != null && username.equals(_account[i].getUsername())) {
                if (_account[i].hasAccess(password)) {
                    _account[i] = null;
                    _counter--;
                    System.out.println("CLOSE success");
                    return;
                }
            }
        }
        System.out.println("CLOSE fail");
    }

    public void deposit(String username, double amount) {
        Account account = account(username);
        if (account != null) {
            double balanceBefore = account.getBalance();
            account.deposit(amount);
            if (balanceBefore < account.getBalance()) {
                System.out.println("DEPOSIT success");
                return;
            }
        }
        System.out.println("DEPOSIT fail");
    }

    public void withdraw(String username, String password, double amount) {
        Account account = account(username);
        if (account != null && account.hasAccess(password)) {
            double balanceBefore = account.getBalance();
            account.withdraw(amount);
            if (balanceBefore > account.getBalance()) {
                System.out.println("WITHDRAW success");
                return;
            }
        }
        System.out.println("WITHDRAW fail");
    }

    public void transfer(String username, String password, double amount, String recipient) {
        Account accountSend = account(username);
        Account accountReceive = account(recipient);
        if (accountSend != null && accountReceive != null && accountSend.hasAccess(password)) {
            double balanceBefore = accountSend.getBalance();
            accountSend.withdraw(amount);
            if (accountSend.getBalance() < balanceBefore) {
                accountReceive.deposit(amount);
                System.out.println("TRANSFER success");
                return;
            }
        }
        System.out.println("TRANSFER fail");
    }

    public double getAssets() {
        double result = 0.0;
        for (Account account : _account) {
            result += account.getBalance();
        }
        return result;
    }

    private Account account(String username) {
        for (int i = 0; i < _account.length; i++) {
            if (_account[i] != null && username.equals(_account[i].getUsername())) {
                return _account[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String finalResult = getAssets() + "\n";
        for (Account account : _account) {
            finalResult += account.getName() + ", " + account.getGovId() + ", " + account.getBalance();
        }
        return finalResult;
    }
}
