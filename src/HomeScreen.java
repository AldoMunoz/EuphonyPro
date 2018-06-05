import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ppop
public class HomeScreen extends JFrame {
    public HomeScreen(){
        JPanel homeScreen = new JPanel();
        JPanel greetingLabel = new JPanel();
        JPanel option = new JPanel();
        option.setLayout(new GridLayout(2,1));

        //ImageIcon guitarPicture = new ImageIcon("o.gif");
        ImageIcon pianoPicture = new ImageIcon("CompSciPiano.jpg");
        ImageIcon trumpetPicture = new ImageIcon("trumpet.jpeg");

        JLabel welcomeBanner = new JLabel("Welcome to Euphony!");
        JLabel chooseInstrument = new JLabel("Pick your instrument:");

        JButton piano = new JButton("Piano", pianoPicture);
        JButton trumpet = new JButton("Trumpet", trumpetPicture);
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

        trumpet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Trumpet_Screen frame2 = new Trumpet_Screen();
                frame2.setSize(1000, 1000);
                frame2.setLocationRelativeTo(null);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setVisible(true);
            }
        });


        homeScreen.add(welcomeBanner);
        greetingLabel.add(chooseInstrument);
        option.add(piano);
        option.add(trumpet);

        add(homeScreen,  BorderLayout.NORTH);
        add(greetingLabel, BorderLayout.CENTER);
        add(option, BorderLayout.EAST);

    }

    public static void main(String[] args) {
        HomeScreen frame = new HomeScreen();
        frame.setSize(500, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
