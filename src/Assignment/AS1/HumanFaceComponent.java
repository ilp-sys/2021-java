package Assignment.AS1;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import javax.swing.JComponent;

//A component that draws an alien face

public class HumanFaceComponent extends JComponent{
    public void paintComponent(Graphics g){
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //Draw the head
        Ellipse2D.Double head = new Ellipse2D.Double(5,10,100,150);
        g2.draw(head);

        //Draw the eyelash
        Arc2D.Double eyelash1 = new Arc2D.Double(25, 60, 20, 10, 45, 100, Arc2D.OPEN);
        g2.draw(eyelash1);
        Arc2D.Double eyelash2 = new Arc2D.Double(68, 60, 20, 10, 45, 100, Arc2D.OPEN);
        g2.draw(eyelash2);

        //Draw the eyes
        g2.setColor(Color.BLACK);
        Ellipse2D.Double eye1 = new Ellipse2D.Double(25,70,20,15);
        g2.fill(eye1);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(68,70,20,15);
        g2.fill(eye2);

        //Draw the nose
        Line2D.Double nose = new Line2D.Double(55,90,55,120);
        g2.setColor(Color.RED);
        g2.draw(nose);

        //Draw the mouth
        Line2D.Double mouth = new Line2D.Double(40,130,70,130);
        g2.setColor(Color.RED);
        g2.draw(mouth);

        //Draw the greeting
        g2.setColor(Color.BLUE);
        g2.drawString("Hello, Human!",5,175);
    }
}
