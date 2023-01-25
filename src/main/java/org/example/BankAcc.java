package org.example;
import java.util.*;

class BankAcc {
    public static void main(String[] args) {
        int amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account Holders Name:");
        String HolderName = sc.next();
        System.out.println("Enter the Account Holders Number:");
        int AccountNumber = sc.nextInt();
        System.out.println("Enter the Balance:");
        int balance = sc.nextInt();

        Boolean loop=true;

        Bank B1 = new Bank(HolderName,AccountNumber,balance);

        while(loop==true){

            System.out.println("choose a option");
            System.out.println("1.Deposit \n 2.Withdraw \n 3.Balance\n");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                {
                    System.out.println("Enter the Amount:\n");
                    amount=sc.nextInt();
                    B1.deposit(amount);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the Amount:\n");
                    amount=sc.nextInt();
                    B1.withdraw(amount);
                    break;
                }
                case 3 :
                {
                    System.out.println(B1.getBalance());
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
    private String Name;
    private int accNumber;
    private double balance;

    public Bank(String UserName, int AccNumber, double Balance) {
        this.Name = UserName;
        this.accNumber = AccNumber;
        this.balance = Balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Hello  "+Name+"\nYour current balance for account  "+accNumber+ "  is  "+balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance for withdraw!!\n");
        }
        else {
            balance -= amount;
            System.out.println("Hello  "+Name+"\nYour current balance for account  "+accNumber+ "  is  "+balance);
        }
    }

    public double getBalance() {
        System.out.println("Your balance is:");
        return balance;
    }
}

