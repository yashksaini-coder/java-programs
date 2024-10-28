import java.awt.*;
import java.awt.event.*;

public class SQLogin {
    public static void main(String[] args) {
        Frame frame = new Frame("Student Login");
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.setSize(400, 200); // Increased window size
        frame.setLocationRelativeTo(null); // Center the frame

        Label nameLabel = new Label("Student Name:");
        TextField nameField = new TextField(20);
        Label passwordLabel = new Label("Password:");
        TextField passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        Button loginButton = new Button("Login");
        Label resultLabel = new Label();

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resultLabel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String studentName = nameField.getText();
                String password = passwordField.getText();
                if (studentName != null && !studentName.isEmpty() && password != null && !password.isEmpty()) {
                    resultLabel.setText("Login successful");
                    Dialog successDialog = new Dialog(frame, "Login Status", true);
                    successDialog.setLayout(new FlowLayout());
                    Label successLabel = new Label("Welcome, " + studentName + "!");
                    successDialog.add(successLabel);
                    Button okButton = new Button("OK");
                    okButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            successDialog.setVisible(false);
                        }
                    });
                    successDialog.add(okButton);
                    successDialog.setSize(200, 100);
                    successDialog.setLocationRelativeTo(frame); // Center the dialog
                    successDialog.setVisible(true);
                } else {
                    resultLabel.setText("Login failed");
                }
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
