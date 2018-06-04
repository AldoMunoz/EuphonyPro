import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Piano_Screen extends JFrame{
    public Piano_Screen() {
        setTitle("Piano Screen!");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(1,7,10,10));

        Border border = new LineBorder(Color.BLACK, 1);

        p2.setBorder(border);
        p1.setBorder(border);

        JButton c = new JButton("C");
        p2.add(c);
        JButton d = new JButton("D");
        p2.add(d);
        JButton e = new JButton("E");
        p2.add(e);
        JButton f = new JButton("F");
        p2.add(f);
        JButton g = new JButton("G");
        p2.add(g);
        JButton a = new JButton("A");
        p2.add(a);
        JButton b = new JButton("B");
        p2.add(b);



        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        Piano_Screen frame = new Piano_Screen();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        frame.setSize(xSize,ySize);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
