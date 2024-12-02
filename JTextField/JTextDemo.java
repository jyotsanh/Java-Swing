
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;


public class JTextDemo {
    public JTextDemo() {
        JFrame frame = new JFrame("JTextField Demo"); // create a frame with a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        
        frame.setSize(400, 400); // set the size of the frame
        frame.setLayout(new FlowLayout());
        
        JTextField textField = new JTextField("Enter text here"); // create a text field with text
        frame.add(textField); // add the text field to the frame
        frame.setLocationRelativeTo(null);// set the frame to the center of the screen
        frame.setVisible(true); // make the frame visible
    }
    public static void main(String[] args) {
        new JTextDemo();
    }
}
