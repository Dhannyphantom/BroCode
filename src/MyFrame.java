import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JPanel panel;
    JComboBox<String> comboBox;

    MyFrame() {

        String[] animals = {"cat", "dogs", "chicken", "rabbit"};

        comboBox = new JComboBox<>(animals);
        comboBox.addItem("goat");
        comboBox.setEditable(true);

        panel = new JPanel();
        panel.add(comboBox);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
