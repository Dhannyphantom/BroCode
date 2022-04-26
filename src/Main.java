import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)  {
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.orange);
        panel1.setPreferredSize(new Dimension(100,100));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel2.setPreferredSize(new Dimension(100,100));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.red);
        panel3.setPreferredSize(new Dimension(100,100));

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.magenta);
        panel4.setPreferredSize(new Dimension(100,100));

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.cyan);
        panel5.setPreferredSize(new Dimension(100,100));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10,10));
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

    }
}
