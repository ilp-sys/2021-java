package Assignment.Project.codes;

import java.io.*;
import java.util.Scanner;

public class FileHelper {
    public Invoice setAddress(int customerNum) throws FileNotFoundException {
        String name = "", street = "", city = "", state = "", zip = "";
        File input = new File("/Users/z2ouu/IdeaProjects/5645380Java/src/Assignment/Project/files/customer_address.txt");
        Scanner in = new Scanner(input);

        if(customerNum != 1){
            for(int i = 0; i < customerNum -1; i++) in.nextLine();
        }

        in.next();

        name = in.next();
        name = name.replace(":", "");

        street = in.next();
        street += " ";
        street += in.next();
        street += " ";
        street += in.next();
        street = street.replace(":", "");

        city = in.next();
        city = city.replace(":", "");

        state = in.next();
        state = state.replace(":", "");

        zip = in.next();
        zip = zip.replace(":", "");

        Address newAddress = new Address(name, street, city, state, zip);

        Invoice newInvoice = new Invoice(newAddress);
        return newInvoice;
    }

    public void addProduct(Invoice customerInvoice, int productNum) throws FileNotFoundException {
        File input = new File("/Users/z2ouu/IdeaProjects/5645380Java/src/Assignment/Project/files/product_list.txt");
        Scanner file = new Scanner(input);
        Scanner in = new Scanner(System.in);
        Invoice newInvoice = customerInvoice;
        String c;

        System.out.print("Press\t");
        while(file.hasNext()){
            System.out.println(file.nextLine());
            System.out.print("\t\t");
        }
        System.out.println();

        file = new Scanner(input);

        for(int i = 1; i <= productNum; i++){
            System.out.print("Type Product " + i + ": ");
            c = in.next();
            String name;
            Double price;

            while(true){
                String tmp = file.next();
                tmp = tmp.replace(":", "");
                tmp = tmp.trim();
                if(c.equals(tmp)) break;
                file.nextLine();
            }

            name = file.next();
            name = name.replace(":", "");

            String priceStr = file.next();
            priceStr.replace(":", "");
            price = Double.parseDouble(priceStr);

            System.out.print("Type Quantity: ");
            int quantity = in.nextInt();

            newInvoice.add(new Product(name, price), quantity);
        }
    }

    public void printInvoice(Invoice customerInvoice) throws IOException {
        Invoice newInvoice = customerInvoice;
        PrintWriter out = new PrintWriter("/Users/z2ouu/IdeaProjects/5645380Java/src/Assignment/Project/files/invoice.txt");
        out.println(newInvoice.format());
        out.close();
    }
}
