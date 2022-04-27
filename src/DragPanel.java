import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("assets/favicon.png");
    Point imageCorner;
    Point prevPt;

    DragPanel () {
        final int WIDTH = image.getIconWidth();
        final int HEIGHT = image.getIconHeight();

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent (Graphics g) {
       super.paintComponent(g);
       image.paintIcon(this,g,(int)imageCorner.getX(), (int)imageCorner.getX());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed (MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged (MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY())
            );
            repaint();
        }
    }
}
