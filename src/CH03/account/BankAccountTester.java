package CH03.account;
import CH03.account.BankAccount;

/**
    A class to test the BankAccount class.
 */

public class BankAccountTester{
    /**
        Tests the methods of the BankAccount class.
     @param args not used
     */
    public static void main(String[] args){
        BankAccount harrysChecking = new BankAccount();
        BankAccount momsSaving = new BankAccount(2500);

        harrysChecking.deposit(2000);
        harrysChecking.withdraw(500);

        System.out.println("Harry's checking Balance is " + harrysChecking.getBalance());
        System.out.println("Expected of Harry's checking Balance is 1500");

        System.out.println("Mom's Saving Balance is " + momsSaving.getBalance());
        System.out.println("Expected of Mom's Saving Balance is 2500");
    }
}