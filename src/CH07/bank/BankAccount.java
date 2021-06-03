package CH07.bank;

/**
 A Bank account has a balance that an be changed by
 deposits and withdrawals 101692Java
 */

public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(){ balance = 0; } //constructor1
    public BankAccount(double initialBalance){ balance = initialBalance; } //constructor2
    public BankAccount(int anAccountNumber, double initialBalance){
        balance = initialBalance;
        accountNumber = anAccountNumber;
    }

    public void deposit(double amount){ balance += amount; }

    public void monthlyFee(){
        this.withdraw(10);
    }

    /**
        withdraws money from the bank account
        @param amount the amount to withdraw
     */

    public void withdraw(double amount){ balance -= amount; }

    /**
        Gets the current balance of the bank account.
        @return the current balance
    */

    public double getBalance(){
        return balance;
    }

    public boolean isOverDrawn(){ return balance < 0; }

    public void transferFunds(BankAccount destination, double amount)
    {
        destination.balance  = destination.balance + amount;
        this.balance = this.balance - amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
