import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame() {
        panel = new MyPanel();
        this.setTitle("GRAPHICS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(panel);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
        
    }
}
