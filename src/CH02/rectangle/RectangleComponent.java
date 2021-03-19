package CH02.rectangle;

import java.awt.*;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);

        box.translate(15, 25);

        g2.draw(box);
    }
}