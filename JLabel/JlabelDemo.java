import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
public class  JlabelDemo {
    public JlabelDemo() {
        JFrame frame = new JFrame("JLabel Demo"); // create a frame with a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        frame.setLocationByPlatform(false); // set the location of the frame to the center of the screen
        frame.setSize(400, 400); // set the size of the frame
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello, World!"); // create a label with text
        frame.add(label); // add the label to the frame





        frame.setVisible(true); // make the frame visible
    }
    public static void main(String[] args) {
        new JlabelDemo();
    }
}
