import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p9 {

private JFrame frame;
private JTextField textField;
private String operator = "";
private double num1 = 0;
private boolean isOperatorClicked = false;
public p9() {
frame = new JFrame("Simple Calculator");
frame.setSize(300, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new BorderLayout());
textField = new JTextField();
textField.setFont(new Font("Arial", Font.PLAIN, 24));
textField.setHorizontalAlignment(JTextField.RIGHT);
frame.add(textField, BorderLayout.NORTH);
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(4, 4, 10, 10));
String[] buttons = {
"7", "8", "9", "/",
"4", "5", "6", "*",
"1", "2", "3", "-",
"C", "0", "=", "+"
};
for (String text : buttons) {
JButton button = new JButton(text);
button.setFont(new Font("Arial", Font.PLAIN, 18));
button.addActionListener(new ButtonClickListener());
panel.add(button);
}
frame.add(panel, BorderLayout.CENTER);
frame.setVisible(true);
}

private class ButtonClickListener implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
JButton source = (JButton) e.getSource();
String buttonText = source.getText();
if (buttonText.matches("[0-9]")) {
if (isOperatorClicked) {
textField.setText("");
isOperatorClicked = false;
}
textField.setText(textField.getText() + buttonText);
} else if (buttonText.equals("C")) {
textField.setText("");
num1 = 0;
operator = "";
} else if (buttonText.equals("=")) {
double num2 = Double.parseDouble(textField.getText());
switch (operator) {
case "+":
textField.setText(String.valueOf(num1 + num2));
break;
case "-":
textField.setText(String.valueOf(num1 - num2));
break;
case "*":
textField.setText(String.valueOf(num1 * num2));
break;
case "/":
textField.setText(String.valueOf(num1 / num2));
break;
}
num1 = 0;
operator = "";
isOperatorClicked = false;
} else {
if (!operator.isEmpty()) {
return;
}
operator = buttonText;
num1 = Double.parseDouble(textField.getText());
isOperatorClicked = true;
}
}
}

public static void main(String[] args) {
SwingUtilities.invokeLater(p9::new);
}
}
 
