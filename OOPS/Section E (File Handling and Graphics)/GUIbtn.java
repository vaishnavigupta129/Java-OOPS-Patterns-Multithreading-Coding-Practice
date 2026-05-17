import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIbtn {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Color Change");
        JButton button = new JButton("Click Me");

        // Set initial color
        button.setBackground(Color.RED);

        // Add action listener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change color on click
                button.setBackground(Color.GREEN);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}