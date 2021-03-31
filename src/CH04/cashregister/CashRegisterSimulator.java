package CH04.cashregister;

import java.util.Scanner;

public class CashRegisterSimulator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CashRegister register = new CashRegister();

        System.out.println("Enter Price");
        double price = in.nextDouble();
        register.recordPurchase(price);

        System.out.println("Enter dollars: ");
        int dollars = in.nextInt();
    }
}
