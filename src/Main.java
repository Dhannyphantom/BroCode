import javax.swing.*;

public class Main  {
    public static void main(String[] args)  {
        ImageIcon icon = new ImageIcon("assets/favicon.png");
            JOptionPane.showMessageDialog(
                    null,
                    "Your computer has a virus!",
                    "Exit application",
                    JOptionPane.WARNING_MESSAGE);
            JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to delete fiile",
                    "Delete File",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    icon
            );

            String[] values = {"2","3","5"};

            JOptionPane.showInputDialog(
                    null,
                    "How old are you",
                    "User age",
                    JOptionPane.INFORMATION_MESSAGE,icon,values,values[0]);

    }

}
