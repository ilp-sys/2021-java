package CH10.measure2;

import java.awt.*;

public class RectangleMeasurer implements Measurer{

    @Override
    public double measure(Object anObject) {
        Rectangle aRectangle = (Rectangle) anObject;
        double area = aRectangle.getHeight() * aRectangle.getWidth();
        return area;
    }
}
