import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CounterDemo {
    public CounterDemo() {
        JFrame frame = new JFrame("Counter GUI"); // create a frame with a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        frame.setLocationRelativeTo(null);// set the frame to the center of the screen
        frame.setSize(400, 400); // set the size of the frame
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Count ");
        frame.add(label);

        JTextField textField = new JTextField("0",10);
        frame.add(textField);

        JButton up_button = new JButton("Up");
        frame.add(up_button);

        JButton down_button = new JButton("Down");
        frame.add(down_button);

        JButton reset_button = new JButton("Reset");
        frame.add(reset_button);

        up_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(textField.getText());
                number++;
                textField.setText(String.valueOf(number));
            }
        });

        down_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(textField.getText());
                number--;
                textField.setText(String.valueOf(number));
            }
        });

        reset_button.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                textField.setText("0");
            }
        });



        frame.setVisible(true); // make the frame visible
    }
    public static void main(String[] args) {
        new CounterDemo();
    }   
}
