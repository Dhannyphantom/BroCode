import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel;
    MyFrame() {

        dragPanel = new DragPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(dragPanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
