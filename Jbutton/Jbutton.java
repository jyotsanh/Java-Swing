import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Jbutton {
    public Jbutton() {
        JFrame frame = new JFrame("Jbutton"); // create a frame with a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        frame.setLocationByPlatform(false); // set the location of the frame to the center of the screen
        frame.setSize(400, 400); // set the size of the frame
        frame.setLayout(new FlowLayout());
        
        JButton button = new JButton("Click me!"); // create a button with text
        frame.add(button); // add the button to the frame

        frame.setVisible(true); // make the frame visible
    }
    public static void main(String[] args) {
        new Jbutton();
    }
}


// why the frame is not in center???
