import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField textField;
    double num1, num2, result;
    char operator;

    CalculatorGUI() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Text field
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField, BorderLayout.NORTH);

        // Buttons panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        // Numbers
        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') {
            textField.setText(textField.getText() + cmd);
        }
        // Clear
        else if (cmd.equals("C")) {
            textField.setText("");
        }
        // Operators
        else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            num1 = Double.parseDouble(textField.getText());
            operator = cmd.charAt(0);
            textField.setText("");
        }
        // Equals
        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            textField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}