package CH11.chooser;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileChooser {
    public static void main(String[] args) throws FileNotFoundException{
        JFileChooser chooser = new JFileChooser();
        String inputFileName = "", outputFileName = "";

        chooser.setDialogTitle("Input File");
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            inputFileName = selectedFile.getAbsolutePath();
            System.out.println(inputFileName);
        }

        chooser.setDialogTitle("Out File");
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            outputFileName = selectedFile.getAbsolutePath();
            System.out.println(outputFileName);
        }

        FileReader reader = new FileReader(inputFileName);
        Scanner in  = new Scanner(reader);
        PrintWriter out = new PrintWriter(outputFileName);

        //line numbering
        //int lineNumber = 1;

        //while(in.hasNext()){
        //    String line = in.nextLine();
        //    out.println("/*" + lineNumber + "*/ " + line);
        //    lineNumber++;
        //}


        //word count
        int wordCount = 1;
        while(in.hasNext()){
            String word = in.next();
            out.println("/*" + wordCount + "*/ " + word);
            wordCount++;
        }

        out.close();
    }
}
