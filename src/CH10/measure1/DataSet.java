package CH10.measure1;

/**
 Computes information about a set of data values.
 */

public class DataSet {
    private double sum;
    Measurable maximum;
    private int count;

    public DataSet(){
        sum = 0;
        count = 0;
        maximum = null;
    }

    public void add(Measurable x){
        sum += x.getMeasure();
        if(count == 0 || maximum.getMeasure() < x.getMeasure()) maximum = x;
        count ++;
    }

    public Measurable getMaximum(){
        return maximum;
    }

    public double getAverage(){
        if(count == 0) return 0;
        else return sum/count;
    }
}
