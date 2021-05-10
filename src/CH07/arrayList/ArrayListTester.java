package CH07.arrayList;

import java.util.ArrayList;

public class ArrayListTester {
    public static void main(String[] args){
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount(1001, 20000));
        accounts.add(new BankAccount(1015, 10000));
        accounts.add(new BankAccount(1729, 15000));
        accounts.add(new BankAccount(1008, 50000));
        accounts.remove(0);

        System.out.println("Size: " + accounts.size());
        System.out.println("Expected: 3");
        BankAccount first = accounts.get(0);
        System.out.println("First account number: " + first.getAccountNumber());
        System.out.println("Expected: 1008");
        BankAccount last = accounts.get(accounts.size() - 1);
        System.out.println("Last account number: " + last.getAccountNumber());
        System.out.println("Expected: 1729");

        BankAccount withDrawAccount = accounts.get(2);
        BankAccount destinationAccount = accounts.get(1);

        withDrawAccount.transferFunds(destinationAccount, 5000);
        System.out.println("Balance of " + destinationAccount.getAccountNumber() +
                ": " + destinationAccount.getBalance());
        System.out.println("Expected 15000");
    }
}
