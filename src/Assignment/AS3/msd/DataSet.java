package Assignment.AS3.msd;
import static java.lang.Math.sqrt;

public class DataSet {
    private double value;
    private double sum, count, average, sd;
    private double powsum;

    public DataSet(){
        sum = 0;
        count = 0;
        powsum = 0;
    }

    public void add(double value){
        sum += value;
        count++;
    }

    public double getCount(){
        return count;
    }

    public double getAverage() {
        if (count == 0) return 0;
        average = sum / count;
        return average;
    }

    public void countStandardDeviation(double value){
        powsum += value * value;
    }

    public double getStandardDeviation(){
        if(count == 0 || count == 1) sd = 0;
        sd = sqrt((powsum - sum*sum/(count))/(count - 1));
        return sd;
    }
}
