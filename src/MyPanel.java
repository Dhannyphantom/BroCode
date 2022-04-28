import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    Image image;
    Timer timer;
    final int PANEL_SIZE = 500;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y= 0;

    MyPanel () {
        this.setPreferredSize(new Dimension(PANEL_SIZE,PANEL_SIZE));
        this.setBackground(Color.black);

        image = new ImageIcon("assets/favicon.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(image,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x > PANEL_SIZE - image.getWidth(null) || x < 0) {
            xVelocity *= -1;
        }
        x += xVelocity;

        if (y > PANEL_SIZE - image.getHeight(null) || y < 0) {
            yVelocity *= -1;
        }
        y += yVelocity;

        repaint();
    }
}