package CH08.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private BankAccount account;

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public InvestmentFrame(){
        account = new BankAccount(INITIAL_BALANCE);

        //Use instance variables for components
        label = new JLabel("balance: ", (int) account.getBalance());

        //Use helper methods;
        createButton();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    public void createButton() {
        button = new JButton("Add Interest");
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    public void createPanel(){
        panel  = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
    }

    class AddInterestListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            double interest = account.getBalance() * INTEREST_RATE / 100;
            account.deposit(interest);
            label.setText("balance: " + account.getBalance());
        }
    }



}
