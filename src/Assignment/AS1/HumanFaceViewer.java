package Assignment.AS1;

import Assignment.AS1.HumanFaceComponent;

import javax.swing.JFrame;

public class HumanFaceViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(150,250);
        frame.setTitle("An Human Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HumanFaceComponent component = new HumanFaceComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}