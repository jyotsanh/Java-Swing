import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Counter_Demo {
    public Counter_Demo() {
        JFrame frame = new JFrame("Counter GUI"); // create a frame with a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        frame.setLocationRelativeTo(null);// set the frame to the center of the screen
        frame.setSize(400, 400); // set the size of the frame
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter an integer");
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("Count Down !");
        frame.add(button);

        frame.setVisible(true); // make the frame visible
    }
    public static void main(String[] args) {
        new Counter_Demo();
    }   
}
