import java.awt.*;
import java.awt.event.*;

public class BarChartAWT extends Frame {

    int[] values = {100, 150, 200, 120, 180};
    String[] labels = {"A", "B", "C", "D", "E"};

    public BarChartAWT() {
        setTitle("Bar Chart Example");
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {

        int x = 50; // starting x position

        for (int i = 0; i < values.length; i++) {

            // Draw bar
            g.setColor(Color.BLUE);
            g.fillRect(x, 300 - values[i], 40, values[i]);

            // Draw label
            g.setColor(Color.BLACK);
            g.drawString(labels[i], x + 10, 320);

            // Draw value
            g.drawString(String.valueOf(values[i]), x + 5, 300 - values[i] - 5);

            x += 70; // space between bars
        }
    }

    public static void main(String[] args) {
        new BarChartAWT();
    }
}