package CH06.dataset;

/**
 Computes information about a set of data values.
 */

public class DataSet {
    private double sum;
    private double maximum;
    private int count;

    public DataSet(){
        sum = 0;
        count = 0;
        maximum = 0;
    }

    public void add(double x){
        sum += x;
        if(count == 0 || maximum < x) maximum = x;
        count ++;
    }

    public double getMaximum(){
        return maximum;
    }

    public double getAverage(){
        if(count == 0) return 0;
        else return sum/count;
    }
}
