import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyFrame extends JFrame implements ChangeListener {
    JPanel panel;
    JProgressBar progressBar;
    JLabel label;
    MyFrame() throws InterruptedException {

        progressBar = new JProgressBar();
        progressBar.setPreferredSize(new Dimension(500,60));
        progressBar.setMinimum(0);
        progressBar.setValue(500);
        progressBar.setMaximum(500);
        progressBar.addChangeListener(this);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(Color.orange);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Consolas", Font.BOLD, 30));


        label = new JLabel();

        panel = new JPanel();
        panel.add(progressBar);
        panel.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.setVisible(true);

        int i = 500;
        while (progressBar.getValue() > 0) {
            progressBar.setValue(i);
            progressBar.setString(i+"/500");
            Thread.sleep(40);
            i-= 1;
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
