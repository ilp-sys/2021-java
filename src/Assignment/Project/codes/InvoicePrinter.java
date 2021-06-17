package Assignment.Project.codes;

import java.io.IOException;
import java.util.Scanner;

public class InvoicePrinter {
    /*
    public static void main(String args[]){
        Address samsAddress = new Address("Sam&apos;s Small Appliances", "100 Main Street", "Anytown", "CA", "98765");

        Invoice samsInvoice = new Invoice(samsAddress);
        samsInvoice.add(new Product("Toaster", 29.95), 3);
        samsInvoice.add(new Product("Hair dryer", 24.95), 1);
        samsInvoice.add(new Product("Car vacuum", 19.95), 2);

        System.out.println(samsInvoice.format());
    }
    */

    public static void main(String args[]) throws IOException {
        int customerNum = 0; //which customer
        int productNum = 0;

        Scanner in = new Scanner(System.in);
        FileHelper fileHelper = new FileHelper();

        System.out.print("Please type customer number: ");
        customerNum = in.nextInt();

        //set customer address information via a class in filehelper
        Invoice newInvoice = fileHelper.setAddress(customerNum);

        System.out.print("How many products: ");
        productNum = in.nextInt();
        fileHelper.addProduct(newInvoice, productNum);

        //print invoice in a file
        fileHelper.printInvoice(newInvoice);
        System.out.println("please find invoice at: invoice.txt");
    }
}
