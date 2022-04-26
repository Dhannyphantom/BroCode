import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args)  {

        Border border = BorderFactory.createLineBorder(Color.green, 3, true);

        JLabel label = new JLabel("Danny is the GOAT");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        ImageIcon icon = new ImageIcon("favicon.png");

        JFrame frame = new JFrame();
        frame.setSize(800,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Danny App");
        frame.setIconImage(icon.getImage());
        frame.setMinimumSize(new Dimension(750,500));
        frame.add(label);
        frame.setVisible(true);
    }
}
