package CH05.tax;
import java.util.Scanner;

public class TaxReturnTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Income: ");
        double income = in.nextDouble();
        System.out.print("Enter status (M/S): ");
        String input = in.next();

        int status;
        if(input.equals("M"))
            status = TaxReturn.MARRIED;
        else
            status = TaxReturn.SINGLE;

        TaxReturn taxReturn = new TaxReturn(income, status);
        System.out.print("Tax is --> " + taxReturn.getTax());
    }
}
