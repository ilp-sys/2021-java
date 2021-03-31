package Assignment.AS2.star;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 A star shape that can be positioned anywhere on the screen
 */

public class Star {
    private int x = 0;
    private int y = 0;

    //constructor
    public Star(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){
        Line2D.Double p_line = new Line2D.Double(x-25, y,y+25 ,y);
        g2.draw(p_line);

        Line2D.Double v_line = new Line2D.Double(x,y-25,x,y+25);
        g2.draw(v_line);

        Line2D.Double ltop_to_rbottom = new Line2D.Double(x-25,y-25,x+25,y+25);
        g2.draw(ltop_to_rbottom);

        Line2D.Double lbottom_to_rtop = new Line2D.Double(x-25,y+25,x+25,y-25);
        g2.draw(lbottom_to_rtop);
    }
}
