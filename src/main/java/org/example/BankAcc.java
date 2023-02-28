package org.example;

import java.util.*;
import java.util.logging.*;

class BankAcc {
    public static void main(String[] args) {
        int amount;
        String holderName = null;
        int accountNumber = 0;
        int balance = 0;

        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);

        try{
        l.info("Enter the Account Holders Name:");
        holderName = sc.next();
        l.info("Enter the Account Holders Number:");
        accountNumber = sc.nextInt();
        l.info("Enter the Balance:");
        balance = sc.nextInt();
        }catch(InputMismatchException e){
            l.log(Level.INFO,()->" "+e);
        }
        Bank b1 = new Bank(holderName, accountNumber, balance);

        while(true){
            l.info("choose a option");
            l.info("1.Deposit \n 2.Withdraw \n 3.Balance\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    l.info("Enter the Amount:\n");
                    amount = sc.nextInt();
                    b1.deposit(amount);
                }
                case 2 -> {
                    l.info("Enter the Amount:\n");
                    amount = sc.nextInt();
                    b1.withdraw(amount);
                }
                case 3 -> {
                    String e = String.valueOf(b1.getBalance());
                    l.info(e);
                }
                default -> {
                    l.info("Input error!!");
                    sc.close();
                    System.exit(0);
                }
            }
        }
    }
}
