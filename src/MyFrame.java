import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame extends JFrame implements ChangeListener {
    JPanel panel;
    JSlider slider;
    JLabel label;
    MyFrame() {

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setBounds(200,0,60,300);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        slider.setOrientation(JSlider.VERTICAL);
        slider.setMajorTickSpacing(25);

        label = new JLabel();
        label.setText("C "+slider.getValue());
        label.setBounds(220,330,100,100);

        panel = new JPanel();
        panel.add(slider);
        panel.add(label);
        panel.setLayout(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            label.setText("C "+slider.getValue());
        }

    }
}
