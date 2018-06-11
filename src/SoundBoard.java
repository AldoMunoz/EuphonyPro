import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class SoundBoard extends JFrame{
    public SoundBoard(){
        JPanel p1 = new JPanel(new GridLayout(10, 10));
        JButton b1 = new JButton("High Hats 1");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihats1.wav");
            }
        });
        p1.add(b1);

        add(p1);
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

    public static void playMusic (String filepath) {
        InputStream music;

        try{
            music = new FileInputStream(new File(filepath));
            AudioStream audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
            TimeUnit.MILLISECONDS.sleep(500);
        }
        catch (Exception el)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

}

