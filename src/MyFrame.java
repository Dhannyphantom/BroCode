import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JPanel panel;
    JButton button;
    MyFrame() {

        ImageIcon icon1 = new ImageIcon("assets/favicon.png");
        ImageIcon icon2 = new ImageIcon("assets/x_icon.png");


        button = new JButton("Submit");
        button.addActionListener(this);


        checkBox = new JCheckBox();
        checkBox.setText("Are you a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("MV Boli", Font.BOLD, 25));
//        checkBox.setIcon(icon1);
//        checkBox.setSelectedIcon(icon2);

        panel = new JPanel();
        panel.add(checkBox);
        panel.add(button);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (checkBox.isSelected()){
                System.out.println("Yes you are a robot");
            } else {
                System.out.println("Of course you're not");
            }
        }
    }
}
