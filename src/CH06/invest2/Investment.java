package CH06.invest2;

/**
 A class to monitor the growth of an investment that
 accumulate interest at a fixed annual rate
 */

public class Investment {
    private double balance;
    private double rate;
    private int years;

    public Investment(double aBalance, double aRate){
        balance = aBalance;
        rate = aRate;
        years = 0;
    }

    public void waitForYears(double targetBalance){
        while(balance < targetBalance){
            years++;
            double interest = balance * rate/100;
            balance += interest;
        }
    }

    public void waitYears(int numOfYears){
        for(int i = 0; i < numOfYears; i++){
            double interest = balance * rate/100;
            balance += interest;
        }
        years = numOfYears;
    }

    public double getBalance() { return balance; }
    public int getYears(){ return years; }
}
