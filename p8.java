import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p8 extends JFrame {
private JTextField nameField, emailField;
private JPasswordField passwordField, confirmPasswordField;
private JButton signupButton, clearButton, closeButton;

public p8() {
setTitle("Signup Form");
setSize(600, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);

JPanel panel = new JPanel();
panel.setLayout(new GridBagLayout());
panel.setBackground(Color.WHITE);
GridBagConstraints constraints = new GridBagConstraints();
constraints.fill = GridBagConstraints.HORIZONTAL;
constraints.insets = new Insets(10, 10, 10, 10);
JLabel nameLabel = new JLabel("Name:");
nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
constraints.gridx = 0;
constraints.gridy = 0;
panel.add(nameLabel, constraints);
nameField = new JTextField();
constraints.gridx = 1;
constraints.gridy = 0;
constraints.weightx = 1.0;
panel.add(nameField, constraints);

JLabel emailLabel = new JLabel("Email:");
emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
constraints.gridx = 0;
constraints.gridy = 1;
panel.add(emailLabel, constraints);
emailField = new JTextField();
constraints.gridx = 1;
constraints.gridy = 1;
panel.add(emailField, constraints);

JLabel passwordLabel = new JLabel("Password:");
passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
constraints.gridx = 0;
constraints.gridy = 2;

panel.add(passwordLabel, constraints);

passwordField = new JPasswordField();
constraints.gridx = 1;
constraints.gridy = 2;
panel.add(passwordField, constraints);

JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
constraints.gridx = 0;
constraints.gridy = 3;
panel.add(confirmPasswordLabel, constraints);

confirmPasswordField = new JPasswordField();
constraints.gridx = 1;
constraints.gridy = 3;
panel.add(confirmPasswordField, constraints);

signupButton = new JButton("Sign Up");
constraints.gridx = 0;
constraints.gridy = 4;
constraints.gridwidth = 2;
panel.add(signupButton, constraints);
signupButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
String name = nameField.getText();
String email = emailField.getText();
String password = new String(passwordField.getPassword());
String confirmPassword = new String(confirmPasswordField.getPassword());

if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
JOptionPane.showMessageDialog(p8.this, "Please fill in all fields.");
} else if (!password.equals(confirmPassword)) {
JOptionPane.showMessageDialog(p8.this, "Passwords do not match.");
} else {
JOptionPane.showMessageDialog(p8.this, "Signup successful!");
}
}
});

clearButton = new JButton("Clear");
constraints.gridx = 0;
constraints.gridy = 5;
constraints.gridwidth = 1;
panel.add(clearButton, constraints);
clearButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
nameField.setText("");
emailField.setText("");
passwordField.setText("");
confirmPasswordField.setText("");
}
});
closeButton = new JButton("Close");
constraints.gridx = 1;
constraints.gridy = 5;
panel.add(closeButton, constraints);

closeButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
dispose();
}
});

add(panel);
setVisible(true);
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new p8();
}
});	
}
}
 
