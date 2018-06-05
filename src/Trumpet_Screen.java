import javax.swing.*;
import java.awt.*;

public class Trumpet_Screen extends JFrame{
    public Trumpet_Screen() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(1,7,10,10));
    }

    public static void main(String[] args) {
        Trumpet_Screen frame = new Trumpet_Screen();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        frame.setSize(xSize,ySize);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
