import java.awt.*;
import javax.swing.*;

public class Lineawt extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a line from (50, 50) to (200, 200)
        g.drawLine(50, 50, 200, 200);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Draw Line Example");
        Lineawt panel = new Lineawt();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}