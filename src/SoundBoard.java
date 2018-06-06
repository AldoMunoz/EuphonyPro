import javax.swing.*;
import java.awt.*;

public class SoundBoard extends JFrame{
    public SoundBoard(){
        JPanel Board = new JPanel();
        setLayout(new GridLayout(10, 10));


    }
    public static void main(String[] args) {
        SoundBoard frame = new SoundBoard();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        frame.setSize(xSize,ySize);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

