package CH04.cashregister;

public class CashRegisterTester{
    public static void main(String[] args){
        CashRegister register = new CashRegister();
        register.recordPurchase(0.75);
        register.recordPurchase(1.5);
        register.receivePayment(2,0,5,0,0);
        System.out.println("Change: " + register.giveChange());
        System.out.println("Expected: 0.25");

        register.recordPurchase(2.25);
        register.recordPurchase(19.25);
        register.receivePayment(23, 2, 0,0,0);
        System.out.println("Change: " + register.giveChange());
        System.out.println("Expected: 2.0");

        System.out.println("Value of Quater is " + CashRegister.QUARTER_VALUE);
    }
}