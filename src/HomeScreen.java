import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ppop
public class HomeScreen extends JFrame {
    public HomeScreen(){
        JPanel homeScreen = new JPanel();
        JPanel greetingLabel = new JPanel();
        JPanel pianoOption = new JPanel();
        JPanel guitarOption = new JPanel();
        //ImageIcon guitarPicture = new ImageIcon("o.gif");
        ImageIcon pianoPicture = new ImageIcon("CompSciPiano.jpg");

        JLabel welcomeBanner = new JLabel("Welcome to Euphony");
        JLabel chooseInstrument = new JLabel("Pick your instument");

        JButton piano = new JButton("Piano", pianoPicture);
        piano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Piano_Screen frame = new Piano_Screen();
                frame.setSize(1000, 1000);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

        JButton guitar = new JButton("Guitar");

        homeScreen.add(welcomeBanner);
        greetingLabel.add(chooseInstrument);
        pianoOption.add(piano);

        guitarOption.add(guitar);

        add(homeScreen,  BorderLayout.NORTH);
        add(greetingLabel, BorderLayout.CENTER);
        add(pianoOption, BorderLayout.EAST);
        add(guitarOption, BorderLayout.WEST);

    }

    public static void main(String[] args) {
        HomeScreen frame = new HomeScreen();
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
