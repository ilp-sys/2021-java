package CH08.accounts;

public class AccountTester {
    public static void main(String[] args){
        SavingAccounts momsSavings = new SavingAccounts(0.5);
        CheckingAccount harryschecking = new CheckingAccount(100);

        momsSavings.deposit(10000);
        momsSavings.transfer(2000, harryschecking);

        harryschecking.withdraw(1500);
        harryschecking.withdraw(80);

        momsSavings.transfer(1000, harryschecking);
        harryschecking.withdraw(400);

        harryschecking.deductFees();
        momsSavings.addInterst();

        System.out.println("Mom's saving balance: " + momsSavings.getBalance());
        System.out.println("Expected: 7035");
        System.out.println("Harry's saving balance: " + harryschecking.getBalance());
        System.out.println("Expected: 1116");
    }
}
