package Assignment.AS2.star;

import Assignment.AS2.star.*;

import javax.swing.*;
import java.awt.*;

/**
 This Component draws three star shapes
 */

public class StarComponent extends JComponent{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Star star1 = new Star(100, 100);
        Star star2 = new Star(250, 250);
        Star star3 = new Star(400, 400);

        star1.draw(g2);
        star2.draw(g2);
        star3.draw(g2);
    }
}



