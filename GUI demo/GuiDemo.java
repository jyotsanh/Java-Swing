import javax.swing.JFrame;

public class GuiDemo {
    public GuiDemo() {
        JFrame frame = new JFrame("Window"); // create a frame with a title




        frame.setSize(500, 500); // set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        frame.setLocationRelativeTo(null);// set the frame to the center of the screen
        frame.setVisible(true); // make the frame visible

    }
    public static void main(String[] args) {
        new GuiDemo();
    }
}