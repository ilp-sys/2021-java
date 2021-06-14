package Assignment.AS4.bank;
import java.util.Scanner;

/**
 A Bank account has a balance that an be changed by
 deposits and withdrawals 101692Java
 */

public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(double initialBalance){
        balance = initialBalance;
        accountNumber = 1000 + Bank.getTotalAccountNumber();
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void deposit(){
        System.out.println("amount? ");
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        balance += amount;
    }

    public void withdraw(){
        System.out.println("amount? ");
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public void transfer(BankAccount destination, double amount){
        destination.balance += amount;
        this.balance -= amount;
    }
}
