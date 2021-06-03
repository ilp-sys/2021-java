package CH07.bank;

public class BankTester {
    public static void main(String[] args){
        Bank firstBankOfJava = new Bank();
        firstBankOfJava.addAccounts(new BankAccount(1001, 20000));
        firstBankOfJava.addAccounts(new BankAccount(1015, 10000));
        firstBankOfJava.addAccounts(new BankAccount(1729, 15000));

        double threshold = 15000;
        int count = firstBankOfJava.countBalanceAtLeast(threshold);
        System.out.println("Count: " + count);
        System.out.println("Expected: 2");

        int accountNumber = 1015;
        BankAccount account  = firstBankOfJava.search(accountNumber);

        if(account == null)
            System.out.println("Not Found");
        else
            System.out.println("Found");

        System.out.println("Expected: Found");

        BankAccount maxBalanceAccount = firstBankOfJava.getMax();
        System.out.println("Account with Max Bal: " + maxBalanceAccount.getAccountNumber());
        System.out.println("Expected: 1001");
    }
}
