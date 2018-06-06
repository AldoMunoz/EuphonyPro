import javax.swing.*;
import java.awt.*;
//ppop
public class HomeScreen extends JFrame {
    public HomeScreen(){
        JPanel homeScreen = new JPanel();
        homeScreen.setBackground(Color.RED);
        JPanel greetingLabel = new JPanel();
        greetingLabel.setBackground(Color.WHITE);
        JPanel buttons = new JPanel();
        buttons.setBackground(Color.WHITE);

        ImageIcon guitarPicture = new ImageIcon("CompSciGuitar.jpeg");
        Image image = guitarPicture.getImage();
        Image newimg = image.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH);
        guitarPicture = new ImageIcon(newimg);
        ImageIcon pianoPicture = new ImageIcon("CompSciPiano.jpg");
        Image image1 = pianoPicture.getImage();
        Image newimg1 = image1.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH);
        pianoPicture = new ImageIcon(newimg1);
        ImageIcon boardPicture = new ImageIcon("CompSciSoundboard.jpg");
        Image image2 = boardPicture.getImage();
        Image newimg2 = image2.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH);
        boardPicture = new ImageIcon(newimg2);

        JLabel welcomeBanner = new JLabel("Welcome to Euphony");
        welcomeBanner.setFont(new Font("Windings 3", Font.BOLD, 100));
        JLabel chooseInstrument = new JLabel("Pick Your Instrument");
        chooseInstrument.setFont(new Font("Windings 3", Font.BOLD, 60));

        JButton piano = new JButton("Piano", pianoPicture);
        piano.setBackground(Color.WHITE);
        piano.setFont(new Font("Windings 3", Font.PLAIN, 20));
        JButton guitar = new JButton("Guitar", guitarPicture);
        guitar.setBackground(Color.WHITE);
        guitar.setFont(new Font("Windings 3", Font.PLAIN, 20));
        JButton board = new JButton("Sound Board", boardPicture);
        board.setBackground(Color.WHITE);
        board.setFont(new Font("Windings 3", Font.PLAIN, 20));
        buttons.add(piano);
        buttons.add(guitar);
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