package CH08.accounts;

public class SavingAccounts extends BankAccount{
    private double interestRate;

    public SavingAccounts(double rate){
        interestRate = rate;
    }

    public void addInterst(){
        double interest = getBalance() * interestRate/100;
        deposit(interest);
    }

    public String toString(){
        return "BankAccount Balance [" + this.getBalance() + "]";
    }
}
