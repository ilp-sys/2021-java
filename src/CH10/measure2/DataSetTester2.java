package CH10.measure2;

import java.awt.*;

public class DataSetTester2 {
    public static void main(String[] args) {
        Measurer m = new RectangleMeasurer();
        DataSet data = new DataSet(m);

        data.add(new Rectangle(5, 10, 20 ,30));
        data.add(new Rectangle(10, 20, 30 ,40));
        data.add(new Rectangle(20, 30, 5 ,15));

        System.out.println("Average Area: " + data.getAverage());
        System.out.println("Expected: 625");

        Rectangle max  = (Rectangle) data.getMaximum();
        System.out.println("Maximum Area rectangle: " + max);
        System.out.println("Expected: java.awt.Rectangle[x=10, y=20, width=30, height=40]");
    }
}
