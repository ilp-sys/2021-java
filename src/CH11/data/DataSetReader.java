package CH11.data;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSetReader {
    private double[] data;

    public double[] readFile(String fileName) throws IOException {
        File reader = new File(fileName);
        Scanner in = new Scanner(reader);

        try{
            readData(in);
            return data;
        }finally{
            in.close();
        }
    }

    public void readData(Scanner in) throws BadDataException{
        if(!in.hasNextInt())
            throw new BadDataException("Length Expected");

        int numOfValue = in.nextInt();
        data = new double[numOfValue];
        for(int i = 0; i < numOfValue; i++){
            readValue(in, i);
        }

        if(in.hasNextInt())
            throw new BadDataException("End of file Expected");
    }

    public void readValue(Scanner in, int i) throws BadDataException{
        if(!in.hasNextDouble())
            throw new BadDataException("Data Value Expected");

        data[i] = in.nextDouble();
    }
}
