package CH06.invest1;
/**
 This program computes how long it takes for an investment to double
 */
public class InvestmentTester {
    public static void main(String[] args){
        final double INIT_BALANCE = 10000;
        final double RATE = 5;

        double targetBalance = 2 * INIT_BALANCE;

        Investment investment = new Investment(INIT_BALANCE, RATE);
        investment.waitForYears(targetBalance);
        System.out.println("The investment doubled after " + investment.getYears() + " years");
    }
}
