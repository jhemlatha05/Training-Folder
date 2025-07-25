package practice_day2tasks;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Final Balance: ₹" + acc.getBalance());
    }
}


