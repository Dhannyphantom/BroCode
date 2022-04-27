import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements KeyListener, MouseListener {
    JPanel panel;
    MyFrame() {

        panel = new JPanel();
        panel.setBackground(Color.orange);
        panel.setBounds(0,0,100,100);
        panel.addMouseListener(this);
        panel.setOpaque(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(panel);
        this.addKeyListener(this);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' -> panel.setLocation(panel.getX(), panel.getY() - 10);
            case 'a' -> panel.setLocation(panel.getX() - 10, panel.getY());
            case 'd' -> panel.setLocation(panel.getX() + 10, panel.getY());
            case 's' -> panel.setLocation(panel.getX(), panel.getY() + 10);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panel.setBackground(Color.gray);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        panel.setBackground(Color.magenta);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        panel.setBackground(Color.cyan);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        panel.setBackground(Color.pink);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        panel.setBackground(Color.orange);

    }
}
