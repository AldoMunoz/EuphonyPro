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
        JButton b2 = new JButton("High Hats 2");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihats2.wav");
            }
        });
        p1.add(b2);
        JButton b3 = new JButton("High Hats 2 w/ Beep");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihatswbeep.wav");
            }
        });
        p1.add(b3);
        JButton b4 = new JButton("High Hats 2 w/ Beep 2");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihatswbeep2.wav");
            }
        });
        p1.add(b4);
        JButton b5 = new JButton("Beat 1");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("beat1.wav");
            }
        });
        p1.add(b5);
        JButton b6 = new JButton("High Hats w/ Beep 3");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihatswbeat3.wav");
            }
        });
        p1.add(b6);
        JButton b7 = new JButton("Beat 2");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("beat2.wav");
            }
        });
        p1.add(b7);
        JButton b8 = new JButton("Nano Loop");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("nanoloop.wav");
            }
        });
        p1.add(b8);
        JButton b9 = new JButton("Hat 1");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hat1.aif");
            }
        });
        p1.add(b9);
        JButton b10 = new JButton("Hat 2");
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hat2.aif");
            }
        });
        p1.add(b10);

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

