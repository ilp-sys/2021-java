package CH11.data;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataAnalyzer {
    public static void main(String[] args){
        JFileChooser chooser = new JFileChooser();
        String filename = "";
        Scanner in = new Scanner(System.in);
        DataSetReader reader = new DataSetReader();

        boolean done = false;
        while(!done){
            try {
                chooser.setDialogTitle("Please input file name: ");
                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = chooser.getSelectedFile();
                    filename = selectedFile.getAbsolutePath();
                }
                double[] data = reader.readFile(filename);
                double sum = 0;
                for (double d : data) {
                    sum += d;
                }
                System.out.println("The sum is " + sum);
                done = true;
            }
            catch(FileNotFoundException exception){
                System.out.println("File not found.");
            }
            catch(BadDataException exception){
                System.out.println("Bad Data: " + exception.getMessage());
            }
            catch(IOException exception){
                exception.printStackTrace();
            }
        }
    }
}
