package Assignment.AS2.star;

import Assignment.AS1.HumanFaceComponent;
import Assignment.AS2.star.Star;
import javax.swing.JFrame;

public class StarViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("Three Stars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StarComponent component = new StarComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
