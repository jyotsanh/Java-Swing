import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger {

    public ColorChanger() {
        // Create the frame
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400);

        // Create a panel to change its background color
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        frame.add(panel);

        // Create buttons
        JButton redButton = new JButton("RED");
        JButton blueButton = new JButton("BLUE");
        JButton greenButton = new JButton("GREEN");
        JButton closeButton = new JButton("CLOSE");

        // Create a button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(closeButton);
        frame.add(buttonPanel);

        // Add action listeners for buttons
        redButton.addActionListener(e -> panel.setBackground(Color.RED));
        blueButton.addActionListener(e -> panel.setBackground(Color.BLUE));
        greenButton.addActionListener(e -> panel.setBackground(Color.GREEN));
        closeButton.addActionListener(e -> System.exit(0));

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread (EDT)
        new ColorChanger();
    }
}
