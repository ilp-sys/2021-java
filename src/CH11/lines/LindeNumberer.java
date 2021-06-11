package CH11.lines;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LindeNumberer {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input file: ");
        String inFileName = scanner.next();
        System.out.println("Output file: ");
        String outFileName = scanner.next();

        File inputFile = new File(inFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outFileName);

        int lineNumber = 1;

        while(in.hasNext()){
            String line = in.nextLine();
            out.println("/*" + lineNumber + "*/ " + line);
            lineNumber++;
        }

        in.close();
        out.close();
    }
}
