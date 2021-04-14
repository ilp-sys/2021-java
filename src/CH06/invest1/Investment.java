package CH06.invest1;

/**
 A class to monitor the growth of an investment that
 accumulate interest at a fixed annual rate
 */

public class Investment {
    private double balance;
    private double rate;
    private int years;

    /**
     Construct an Investment object from a starting balance and interest rate.
     @param aBalance the starting balance
     @param aRate the interest rate in percent
     */
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

    /**
     Keeps accumulating interest until a target balace has been reached
     @param targetBalance the desired balance
     */
    public double getBalance() { return balance; }

    /**
     Gets the number of years this investment has accumulated interest
     @return the number of years since the start of the investment
     */
    public int getYears(){ return years; }
}
