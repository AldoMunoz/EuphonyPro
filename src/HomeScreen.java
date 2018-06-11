import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ppop
public class HomeScreen extends JFrame {
    Color orangeRed = new Color(255,69,0);

    public HomeScreen(){
        int w = getWidth();
        Border padding = BorderFactory.createEmptyBorder(40, 10, 10, 10);
        Border padding2 = BorderFactory.createEmptyBorder(8, 10, 10, 10);
        Border border = new LineBorder(Color.WHITE,1);

        JPanel homeScreen = new JPanel();
        homeScreen.setBackground(Color.WHITE);
        homeScreen.setPreferredSize(new Dimension(w,200));
        homeScreen.setBorder(padding);
        JPanel greetingLabel = new JPanel();
        greetingLabel.setBackground(orangeRed);
        greetingLabel.setBorder(padding2);
        JPanel buttons = new JPanel();
        buttons.setBackground(Color.WHITE);
        buttons.setPreferredSize(new Dimension(w, 675));
        ImageIcon trumpetPicture = new ImageIcon("CompSciTrumpet.jpg");
        Image image = trumpetPicture.getImage();
        Image newimg = image.getScaledInstance(550, 550,  java.awt.Image.SCALE_SMOOTH);
        trumpetPicture = new ImageIcon(newimg);
        ImageIcon pianoPicture = new ImageIcon("CompSciPiano.jpg");
        Image image1 = pianoPicture.getImage();
        Image newimg1 = image1.getScaledInstance(550, 550,  java.awt.Image.SCALE_SMOOTH);
        pianoPicture = new ImageIcon(newimg1);
        ImageIcon boardPicture = new ImageIcon("CompSciSoundboard.jpg");
        Image image2 = boardPicture.getImage();
        Image newimg2 = image2.getScaledInstance(550, 550,  java.awt.Image.SCALE_SMOOTH);
        boardPicture = new ImageIcon(newimg2);

        JLabel welcomeBanner = new JLabel("Welcome to Euphony", JLabel.CENTER);
        welcomeBanner.setFont(new Font("Impact", Font.BOLD, 85));
        JLabel chooseInstrument = new JLabel("Click On An Instrument", JLabel.CENTER);
        chooseInstrument.setFont(new Font("Impact", Font.BOLD, 100));
        chooseInstrument.setForeground(Color.WHITE);

        JButton piano = new JButton("Piano", pianoPicture);
        piano.setBorder(border);
        piano.setVerticalTextPosition(SwingConstants.TOP);
        piano.setHorizontalTextPosition(SwingConstants.CENTER);
        piano.setBackground(Color.WHITE);
        piano.setFont(new Font("Impact", Font.PLAIN, 50));
        piano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Piano_Screen frame = new Piano_Screen();
                Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = ((int) tk.getScreenSize().getWidth());
                int ySize = ((int) tk.getScreenSize().getHeight());
                frame.setSize(xSize,ySize);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"Welcome to the Instument Screen!\nAt the bottom you'll find your keys, on the " +
                        "left the play and pause button, and your player in the middle.", "Instrument Screen!",3);
            }
        });

        JButton trumpet = new JButton("Trumpet", trumpetPicture);
        trumpet.setBackground(Color.WHITE);
        trumpet.setBorder(border);
        trumpet.setVerticalTextPosition(SwingConstants.TOP);
        trumpet.setHorizontalTextPosition(SwingConstants.CENTER);
        trumpet.setFont(new Font("Impact", Font.PLAIN, 50));
        trumpet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Trumpet_Screen frame = new Trumpet_Screen();
                Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = ((int) tk.getScreenSize().getWidth());
                int ySize = ((int) tk.getScreenSize().getHeight());
                frame.setSize(xSize,ySize);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"Welcome to the Trumpet Screen!\nAt the " +
                        "bottom you'll find your keys, on the left the play, pause, cancel, and home button, and your player in the middle."
                        , "Trumpet Screen!",3);
            }
        });

        JButton board = new JButton("Sound Board", boardPicture);
        board.setBackground(Color.WHITE);
        board.setVerticalTextPosition(SwingConstants.TOP);
        board.setHorizontalTextPosition(SwingConstants.CENTER);
        board.setBorder(border);
        board.setFont(new Font("Impact", Font.PLAIN, 50));
        board.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                SoundBoard frame = new SoundBoard();
                Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = ((int) tk.getScreenSize().getWidth());
                int ySize = ((int) tk.getScreenSize().getHeight());
                frame.setSize(xSize,ySize);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        buttons.add(piano);
        buttons.add(trumpet);
        buttons.add(board);

        homeScreen.add(welcomeBanner);
        greetingLabel.add(chooseInstrument);

        add(homeScreen,  BorderLayout.NORTH);
        add(greetingLabel, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        HomeScreen frame = new HomeScreen();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        frame.setSize(xSize,ySize);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
