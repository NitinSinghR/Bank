package org.example;

import java.util.logging.*;

class Bank extends BankAcc {
    private final String name;
    private final int accNumber;
    private double balance;
    Logger l=Logger.getLogger("com.api.jar");

    public Bank(String userName, int accNumber, double balance) {
        this.name = userName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        String g="Hello  "+name+"\nYour current balance for account  "+accNumber+ "  is  "+balance;
        l.info(g);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            l.info("Insufficient Balance for withdraw!!\n");
        }
        else {
            balance -= amount;
            String f="Hello  " + name + "\nYour current balance for account  " + accNumber + "  is  " + balance;
            l.info(f);
        }
    }


    public double getBalance() {

        return balance;
    }
}

