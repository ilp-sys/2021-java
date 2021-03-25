package CH03.car;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
    This Component draw two car shapes
 */

public class carComponent extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Car car1 = new Car(0,0);
        int x = getWidth() - 60;
        int y = getHeight() - 30;

        Car car2 = new Car(x, y);
        x = getWidth() - 100;
        y = getHeight() - 80;

        Car car3 = new Car(x, y);

        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2);
    }
}