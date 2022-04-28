import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    ImageIcon bgImage;
    MyPanel () {
        this.setBounds(0,0,500,500);
        bgImage = new ImageIcon("assets/Pin2.jpeg");
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(bgImage.getImage(),0,0,null);

        g2d.setStroke(new BasicStroke(3));
        g2d.setPaint(Color.orange);
        g2d.drawLine(0,0,500,500);

        g2d.setPaint(Color.blue);
        g2d.drawRect(20,20,100,100);
        g2d.fillRect(100,100,100,100);

        g2d.setPaint(Color.cyan);
        g2d.drawOval(50,50,100,100);
        g2d.fillOval(150,150,100,100);

        g2d.setPaint(Color.red);
        g2d.fillArc(350,20,100,100,0,180);
        g2d.setPaint(Color.yellow);
        g2d.fillArc(350,20,100,100,180,180);

        g2d.setPaint(Color.gray);
        int[] xPoints = {350,400,450};
        int[] yPoints = {200,150,200};
        g2d.fillPolygon(xPoints,yPoints,3);

        g2d.setPaint(Color.pink);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 23));
        g2d.drawString("Dhannyphantom", 250,250);
    }
}
