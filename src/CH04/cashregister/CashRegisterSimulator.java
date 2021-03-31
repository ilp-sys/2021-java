package CH04.cashregister;

import javax.swing.*;
import java.util.Scanner;

public class CashRegisterSimulator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CashRegister register = new CashRegister();

        //System.out.println("Enter Price");
        String input = JOptionPane.showInputDialog("Enter Price: ");
        double price = Double.parseDouble(input); //in.nextDouble();
        register.recordPurchase(price);

        //System.out.println("Enter dollars: ");
        input = JOptionPane.showInputDialog("Enter Dollars: ");
        int dollars = Integer.parseInt(input); //in.nextInt();

        input = JOptionPane.showInputDialog("Enter quarters: ");
        int quarters = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter dimes: ");
        int dimes = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter nickels: ");
        int nickels = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter pennies: ");
        int pennies = Integer.parseInt(input);
        register.receivePayment(dollars, quarters, dimes, nickels, pennies);

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Your change: " + register.giveChange());
        System.exit(0);
    }
}
