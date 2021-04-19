package Assignment.AS3.msd;
import java.util.Scanner;

public class DataSetTester {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();

        boolean done = false;
        while(!done) {
            System.out.print("Enter value, Q to quit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) done = true;
            else {
                double value = Double.parseDouble(input);
                data.add(value);
                data.countStandardDeviation(value);
            }
        }
        System.out.println("Count of the values: " + data.getCount());
        System.out.println("Average: " + data.getAverage());
        System.out.println("Standard deviation: " + data.getStandardDeviation());
    }
}
