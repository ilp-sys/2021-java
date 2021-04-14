package CH06.dataset;
import java.util.Scanner;

public class DataTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DataSet dataSet = new DataSet();

        boolean done = false;
        while(!done){
            System.out.print("Enter Value, Q to quit: ");
            String input = in.next();
            if(input.equalsIgnoreCase("Q"))
                done = true;
            else{
                double x = Double.parseDouble(input);
                dataSet.add(x);
            }
        }
        System.out.println("Average = " + dataSet.getAverage());
        System.out.println("Maximum = " + dataSet.getMaximum());
    }
}
