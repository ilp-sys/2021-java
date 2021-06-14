package Assignment.AS4.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> accounts;
    private static int totalAccountNumber = 0;

    public Bank(){
        accounts = new ArrayList<BankAccount>();
    }

    public static int getTotalAccountNumber(){
        return totalAccountNumber++;
    }

    public void addAccount(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input initial balance: ");
        double initialBalance = in.nextDouble();
        BankAccount a = new BankAccount(initialBalance);
        accounts.add(a);
    }

    public void depositAccount(){
        System.out.println("account number? ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BankAccount acc = search(num);
        acc.deposit();
    }

    public void withdrawal(){
        System.out.println("account number? ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BankAccount acc = search(num);
        acc.withdraw();
    }

    public BankAccount search(int accountNumber){
        for(BankAccount a: accounts){
            if(a.getAccountNumber() == accountNumber) return a;
        }
        return null;
    }

    public void inquiry(){
        System.out.println("account number? ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BankAccount acc = search(num);
        double balance = acc.getBalance();
        System.out.println("Current balance: " + balance);
    }

    public void bankTransfer(){
        System.out.println("1st and 2nd account number? ");
        Scanner in = new Scanner(System.in);
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        System.out.println("transfer amount? ");
        double amount = in.nextDouble();
        BankAccount destination = search(secondNum);
        BankAccount first = search(firstNum);
        first.transfer(destination, amount);
    }

    public void maximumAccount(){
        double maxAccBalance = 0;
        int maxAccNum = 0;
        for(BankAccount a: accounts){
            if(a.getBalance() > maxAccBalance){ maxAccBalance = a.getBalance(); maxAccNum = a.getAccountNumber();}
        }
        System.out.println("max Account Number: " + maxAccNum + "Balance: " + maxAccBalance);
    }

    public void sumTotalOfAccounts(){
        double sum = 0;
        for(BankAccount a: accounts){
            sum += a.getBalance();
        }
        System.out.println("Sum of total balance " + sum);
    }
}
