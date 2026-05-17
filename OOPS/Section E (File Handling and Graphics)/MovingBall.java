import javax.swing.*;
import java.awt.*;

public class MovingBall extends JPanel {

    int x = 0; // ball position

    public MovingBall() {
        // Timer for animation (moves every 10 ms)
        Timer timer = new Timer(10, e -> {
            x += 2; // move ball

            if (x > getWidth()) {
                x = 0; // reset position
            }

            repaint(); // redraw
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillOval(x, 100, 50, 50); // draw ball
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Moving Ball Animation");
        MovingBall panel = new MovingBall();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}