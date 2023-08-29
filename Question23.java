package com.cozentus.JavaTask;

class BankkAccount {
    private String accountNumber;
    private double balance;

    public BankkAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankkAccount {
    private static final double MIN_BALANCE = 100.0;

    public SavingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw below minimum balance.");
        }
    }
}

public class Question23 {
    public static void main(String[] args) {
        BankkAccount account = new SavingAccount("1234567890", 500.0);
        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(300.0); 
        System.out.println("Account Balance: " + account.getBalance());
    }
}

