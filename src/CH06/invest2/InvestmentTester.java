package CH06.invest2;

/**
 This program computes how long it takes for an investment to double
 */
public class InvestmentTester {
    public static void main(String[] args){
        final double INIT_BALANCE = 10000;
        final double RATE = 5;
        final double YEARS = 20;

        Investment investment = new Investment(INIT_BALANCE, RATE);
        investment.waitYears(20);
        System.out.println("The balance after " + YEARS + " is " + investment.getBalance());
    }
}
