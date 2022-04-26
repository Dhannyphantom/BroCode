import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {

        label = new JLabel();
        label.setBounds(150,150,100,100);


        button = new JButton();
        button.setText("Click");
        button.setBackground(Color.lightGray);
        button.addActionListener(this);
        button.setBounds(100,100,100,45);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createBevelBorder(2));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(button);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("CLicked");
            label.setText("clicked");
            if (label.isVisible()) {
                label.setVisible(false);
            } else {
                label.setVisible(true);
            }
        }
    }
}
