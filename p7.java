import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p7 extends JFrame {

private JTextField num1Field, num2Field, resultField;
private JButton addButton, subButton, mulButton, divButton;

public p7() {
setTitle("Arithmetic Calculator");
setSize(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);

JPanel panel = new JPanel();
panel.setLayout(new GridLayout(5, 2, 5, 5));
panel.add(new JLabel("Number 1:"));
num1Field = new JTextField();
panel.add(num1Field);
panel.add(new JLabel("Number 2:"));
num2Field = new JTextField();
panel.add(num2Field);
panel.add(new JLabel("Result:"));
resultField = new JTextField();
resultField.setEditable(false);
panel.add(resultField);
addButton = new JButton("Addition");
subButton = new JButton("Subtraction");
mulButton = new JButton("Multiplication");
divButton = new JButton("Division");
panel.add(addButton);
panel.add(subButton);
panel.add(mulButton);
panel.add(divButton);
// Adding action listeners to the buttons
addButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
calculate('+');
}
});
subButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
calculate('-');
}
});
mulButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
calculate('*');
}
});
divButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
calculate('/');
}
});
add(panel);
setVisible(true);
}
private void calculate(char operator) {
try {
double num1 = Double.parseDouble(num1Field.getText());
double num2 = Double.parseDouble(num2Field.getText());
double result = 0;
switch (operator) {
case '+':
result = num1 + num2;
break;
case '-':
result = num1 - num2;
break;
case '*':
result = num1 * num2;
break;
case '/':
if (num2 != 0) {
result = num1 / num2;
} else {
JOptionPane.showMessageDialog(this, "Cannot divide by zero");
return;
}
break;
}
resultField.setText(String.valueOf(result));
} catch (NumberFormatException e) {
JOptionPane.showMessageDialog(this, "Please enter valid numbers");
}
}

public static void main(String[] args) {
new p7();
}
}
 
