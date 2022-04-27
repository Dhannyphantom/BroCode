import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JButton button;
    JFrame frame;

    LaunchPage() {
        button = new JButton();
        button.setText("Launch New Page");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBounds(150,100, 100,60);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            new NewPage();
        }
    }
}
