import javax.swing.*;
import java.awt.*;

public class DifferentFonts extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Font 1
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("This is Serif Font", 50, 50);

        // Font 2
        g.setFont(new Font("SansSerif", Font.BOLD, 22));
        g.drawString("This is SansSerif Bold", 50, 100);

        // Font 3
        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("This is Monospaced Italic", 50, 150);

        // Font 4
        g.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 26));
        g.drawString("Bold + Italic Dialog Font", 50, 200);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Different Fonts Example");
        DifferentFonts panel = new DifferentFonts();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}