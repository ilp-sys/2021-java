package CH03.car;
import CH03.car.carComponent;
import javax.swing.JFrame;

public class CarViewer{
    public static void main(String[] args){
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        carComponent component = new carComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}