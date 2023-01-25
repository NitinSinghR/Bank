package org.example;
import java.util.*;
import java.util.logging.Logger;


class BankAcc {
    public static void main(String[] args) {
        int amount;

        Scanner sc = new Scanner(System.in);

        logger.log("Enter the Account Holders Name:");
        String holderName = sc.next();
        logger.log("Enter the Account Holders Number:");
        int accountNumber = sc.nextInt();
        logger.log("Enter the Balance:");
        int balance = sc.nextInt();

        Boolean loop=true;

        Bank B1 = new Bank(holderName,accountNumber,balance);

        while(loop==true){

            logger.log("choose a option");
            logger.log("1.Deposit \n 2.Withdraw \n 3.Balance\n");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                {
                    logger.log("Enter the Amount:\n");
                    amount=sc.nextInt();
                    B1.deposit(amount);
                    break;
                }
                case 2:
                {
                    logger.log("Enter the Amount:\n");
                    amount=sc.nextInt();
                    B1.withdraw(amount);
                    break;
                }
                case 3 :
                {
                    logger.log(B1.getBalance());
                    break;
                }
                default:
                {
                    loop=false;
                }
            }
        }
        sc.close();
    }
}
class Bank extends BankAcc {
    private String name;
    private int accNumber;
    private double balance;

    public Bank(String userName, int accNumber, double balance) {
        this.name = userName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        logger.log("Hello  "+name+"\nYour current balance for account  "+accNumber+ "  is  "+balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            logger.log("Insufficient Balance for withdraw!!\n");
        }
        else {
            balance -= amount;
            logger.log("Hello  "+name+"\nYour current balance for account  "+accNumber+ "  is  "+balance);
        }
    }

    public double getBalance() {
        logger.log("Your balance is:");
        return balance;
    }
}

