package SignUpFormDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Signup Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        // Create panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 25);
        panel.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 25);
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 25);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 100, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 150, 200, 25);
        panel.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 200, 150, 25);
        panel.add(confirmPasswordLabel);

        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(200, 200, 150, 25);
        panel.add(confirmPasswordField);

        // Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 300, 100, 30);
        panel.add(submitButton);

        // Message Label
        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(50, 350, 300, 25);
        messageLabel.setForeground(Color.RED);
        panel.add(messageLabel);

        // Add action listener for button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    messageLabel.setText("All fields are required.");
                } else if (!password.equals(confirmPassword)) {
                    messageLabel.setText("Passwords do not match.");
                } else {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Signup Successful!");
                }
            }
        });

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
