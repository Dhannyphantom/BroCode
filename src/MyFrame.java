import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JPanel panel;
    JRadioButton radio;
    JRadioButton radio1;
    JRadioButton radio2;
    ButtonGroup buttonGroup;
    MyFrame() {

        radio = new JRadioButton("male");
        radio1 = new JRadioButton("female");
        radio2 = new JRadioButton("other");

        radio.addActionListener(this);
        radio1.addActionListener(this);
        radio2.addActionListener(this);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radio);
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        panel = new JPanel();
        panel.add(radio);
        panel.add(radio1);
        panel.add(radio2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == radio) {
            System.out.println("You're a guy");
        } else if (e.getSource() == radio1) {
            System.out.println("You're a lady");
        } else if (e.getSource() == radio2) {
            System.out.println("You're something else");
        }

    }
}
