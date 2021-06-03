package CH07.bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;
    public Bank(){
        accounts = new ArrayList<BankAccount>();
    }

    public void addAccounts(BankAccount a){
        accounts.add(a);
    }

    public double getTotalBalance(){
        double total = 0;
        for(BankAccount a: accounts)
            total += a.getBalance();
        return total;
    }

    public int countBalanceAtLeast(double treshold) {
        int count = 0;
        for (BankAccount a : accounts) {
            if (a.getBalance() >= treshold) count++;
        }
        return 0;
    }

    public BankAccount search(int accountNumber){
        for(BankAccount a: accounts){
            if(a.getAccountNumber() == accountNumber) return a;
        }
        return null;
    }

    public BankAccount getMax(){
        if(accounts.size() == 0) return null;
        BankAccount largestBankAccount = accounts.get(0);

        for(int i = 1; i < accounts.size(); i++){
            BankAccount a = accounts.get(i);
            if(a.getBalance() > largestBankAccount.getBalance())
                largestBankAccount = a;
        }

        return largestBankAccount;
    }

}
