package Assignment.AS4.bank;

import java.util.Scanner;
import static java.lang.System.exit;

public class BankTester {

    public static void printMenu(){
        System.out.println("***************************");
        System.out.println("*                         *");
        System.out.println("* N-New account           *");
        System.out.println("* D-Deposit               *");
        System.out.println("* W-withdrawal            *");
        System.out.println("* I-Inquiry               *");
        System.out.println("* T-Transfer              *");
        System.out.println("* C-Count of all Accounts *");
        System.out.println("* M-Maximum Account       *");
        System.out.println("* S-Sum total of Accounts *");
        System.out.println("* Q-Quit                  *");
        System.out.println("*                         *");
        System.out.println("***************************");
    }

    public static void main(String[] args){
        Bank firstBankOfJava = new Bank();
        Scanner in = new Scanner(System.in);
        String ch;

        while(true){
            printMenu();
            ch = in.nextLine();
            switch(ch){
                case "N": firstBankOfJava.addAccount(); break;
                case "D": firstBankOfJava.depositAccount(); break;
                case "W": firstBankOfJava.withdrawal(); break;
                case "I": firstBankOfJava.inquiry(); break;
                case "T": firstBankOfJava.bankTransfer(); break;
                case "C": System.out.println(firstBankOfJava.getTotalAccountNumber() + 1000); break;
                case "M": firstBankOfJava.maximumAccount(); break;
                case "S": firstBankOfJava.sumTotalOfAccounts(); break;
                case "Q": exit(0);
                default: break;
            }
        }

    }
}
