import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Piano_Screen extends JFrame{
    public Piano_Screen() {
        setTitle("Piano Screen!");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(1,7,10,10));
        JPanel p3 = new JPanel();

        Border border = new LineBorder(Color.BLACK, 1);

        ImageIcon playBttn = new ImageIcon("playbutton.png");
        Image image = playBttn.getImage(); // transform it
        Image newimg = image.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        playBttn = new ImageIcon(newimg);

        JButton play = new JButton(playBttn);
        play.setPreferredSize(new Dimension(100, 100));
        play.setBackground(Color.YELLOW);
        p3.add(play);

        p2.setBorder(border);
        p1.setBorder(border);

        JButton c = new JButton("C");
        c.setBackground(Color.PINK);
        c.setFont(new Font("Arial", Font.BOLD, 30));
        c.setPreferredSize(new Dimension(40, 100));
        p2.add(c);
        JButton d = new JButton("D");
        d.setPreferredSize(new Dimension(40, 60));
        d.setFont(new Font("Arial", Font.BOLD, 30));
        d.setBackground(Color.PINK);
        p2.add(d);
        JButton e = new JButton("E");
        e.setPreferredSize(new Dimension(40, 60));
        e.setFont(new Font("Arial", Font.BOLD, 30));
        e.setBackground(Color.PINK);
        p2.add(e);
        JButton f = new JButton("F");
        f.setPreferredSize(new Dimension(40, 60));
        f.setFont(new Font("Arial", Font.BOLD, 30));
        f.setBackground(Color.PINK);
        p2.add(f);
        JButton g = new JButton("G");
        g.setPreferredSize(new Dimension(40, 60));
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setBackground(Color.PINK);
        p2.add(g);
        JButton a = new JButton("A");
        a.setPreferredSize(new Dimension(40, 60));
        a.setFont(new Font("Arial", Font.BOLD, 30));
        a.setBackground(Color.PINK);
        p2.add(a);
        JButton b = new JButton("B");
        b.setPreferredSize(new Dimension(40, 60));
        b.setFont(new Font("Arial", Font.BOLD, 30));
        b.setBackground(Color.PINK);
        p2.add(b);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        add(p3, BorderLayout.EAST);
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
