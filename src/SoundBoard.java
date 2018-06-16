import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class SoundBoard extends JFrame{
    Color red = new Color(255, 51, 51);
    Color blue = new Color(0, 128, 255);
    Color green = new Color(0, 204, 0);
    Color orange = new Color(255, 128, 0);
    Color cyan = new Color(51, 255, 255);
    Color purple = new Color(153, 52, 255);
    Border border = new LineBorder(Color.BLACK, 2);
    Border newBorder = new LineBorder(Color.WHITE, 1);
    Border border2 = new LineBorder(Color.BLACK, 15);
    Font a = new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD,30);
    Font b = new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD,20);
    Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);


    public SoundBoard(){
        JPanel p1 = new JPanel(new GridLayout(7, 7,10,10));
        p1.setBackground(Color.BLACK);
        p1.setBorder(padding);
        JPanel p2 = new JPanel(new GridLayout(1,1));
        p2.setBorder(border2);

        JButton b1 = new JButton("High Hats 1");
        b1.setBackground(Color.YELLOW);
        b1.setBorder(border);
        b1.setFont(a);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihats1.wav");
            }
        });
        p1.add(b1);
        JButton b2 = new JButton("High Hats 2");
        b2.setBackground(Color.YELLOW);
        b2.setBorder(border);
        b2.setFont(a);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihats2.wav");
            }
        });
        p1.add(b2);
        JButton b3 = new JButton("High Hats 2 w/ Beep");
        b3.setBackground(Color.YELLOW);
        b3.setBorder(border);
        b3.setFont(b);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihatswbeep.wav");
            }
        });
        p1.add(b3);
        JButton b4 = new JButton("High Hats 2 w/ Beep 2");
        b4.setBackground(Color.YELLOW);
        b4.setBorder(border);
        b4.setFont(b);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihatswbeep2.wav");
            }
        });
        p1.add(b4);
        JButton b5 = new JButton("Beat 1");
        b5.setBackground(Color.YELLOW);
        b5.setBorder(border);
        b5.setFont(a);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("beat1.wav");
            }
        });
        p1.add(b5);
        JButton b6 = new JButton("High Hats w/ Beep 3");
        b6.setBackground(Color.YELLOW);
        b6.setBorder(border);
        b6.setFont(b);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hihatswbeat3.wav");
            }
        });
        p1.add(b6);
        JButton b7 = new JButton("Beat 2");
        b7.setBackground(Color.YELLOW);
        b7.setBorder(border);
        b7.setFont(a);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("beat2.wav");
            }
        });
        p1.add(b7);
        JButton b8 = new JButton("Nano Loop");
        b8.setBackground(Color.YELLOW);
        b8.setBorder(border);
        b8.setFont(a);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("nanoloop.wav");
            }
        });
        p1.add(b8);
        JButton b9 = new JButton("Hat 1");
        b9.setBackground(red);
        b9.setBorder(border);
        b9.setFont(a);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hat1.aif");
            }
        });
        p1.add(b9);
        JButton b10 = new JButton("Hat 2");
        b10.setBackground(red);
        b10.setBorder(border);
        b10.setFont(a);
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hat2.aif");
            }
        });
        p1.add(b10);
        JButton b11 = new JButton("Chill Drums");
        b11.setBackground(blue);
        b11.setBorder(border);
        b11.setFont(a);
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("chilldrums.aif");
            }
        });
        p1.add(b11);
        JButton b12 = new JButton("Happy Drum Beat");
        b12.setBackground(blue);
        b12.setBorder(border);
        b12.setFont(a);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("happydrumbeat.wav");
            }
        });
        p1.add(b12);
        JButton b13 = new JButton("Hip Hop Drums");
        b13.setBackground(blue);
        b13.setBorder(border);
        b13.setFont(a);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("hiphopdrums.wav");
            }
        });
        p1.add(b13);
        JButton b14 = new JButton("Kicking Drum Beat");
        b14.setBackground(blue);
        b14.setBorder(border);
        b14.setFont(b);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("kickingdrumbeat.aif");
            }
        });
        p1.add(b14);
        JButton b15 = new JButton("Lo-fi Drums");
        b15.setBackground(blue);
        b15.setBorder(border);
        b15.setFont(a);
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("lofidrums.wav");
            }
        });
        p1.add(b15);
        JButton b16 = new JButton("Lush Drums");
        b16.setBackground(blue);
        b16.setBorder(border);
        b16.setFont(a);
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("lushdrums.aif");
            }
        });
        p1.add(b16);
        JButton b17 = new JButton("Slow Funk Drums");
        b17.setBackground(blue);
        b17.setBorder(border);
        b17.setFont(a);
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("slowfunkdrums.aif");
            }
        });
        p1.add(b17);
        JButton b18 = new JButton("Swinger Drums");
        b18.setBackground(blue);
        b18.setBorder(border);
        b18.setFont(a);
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("swingerdrums.aif");
            }
        });
        p1.add(b18);
        JButton b19 = new JButton("Vinyl Drums");
        b19.setBackground(blue);
        b19.setBorder(border);
        b19.setFont(a);
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("vinyldrums.aif");
            }
        });
        p1.add(b19);
        JButton b20 = new JButton("Wobba-Wobba Drums");
        b20.setBackground(blue);
        b20.setBorder(border);
        b20.setFont(b);
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("wobbawobbabeat.wav");
            }
        });
        p1.add(b20);
        JButton b21 = new JButton("808 Kick");
        b21.setBackground(red);
        b21.setBorder(border);
        b21.setFont(a);
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("808-kick.wav");
            }
        });
        p1.add(b21);
        JButton b22 = new JButton("Drum Bap");
        b22.setBackground(red);
        b22.setBorder(border);
        b22.setFont(a);
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("bap.wav");
            }
        });
        p1.add(b22);
        JButton b23 = new JButton("Kick Punch Drums");
        b23.setBackground(red);
        b23.setBorder(border);
        b23.setFont(a);
        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("kick-punch.wav");
            }
        });
        p1.add(b23);
        JButton b24 = new JButton("\"Throw Your Hands\" Drums");
        b24.setBackground(red);
        b24.setBorder(border);
        b24.setFont(b);
        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("throw-your-hand.wav");
            }
        });
        p1.add(b24);
        JButton b25 = new JButton("Thud Snare");
        b25.setBackground(red);
        b25.setBorder(border);
        b25.setFont(a);
        b25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("thud-snare.wav");
            }
        });
        p1.add(b25);
        JButton b26 = new JButton("Trigger Bap");
        b26.setBackground(red);
        b26.setBorder(border);
        b26.setFont(a);
        b26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("trigger-bap.wav");
            }
        });
        p1.add(b26);
        JButton b27 = new JButton("Acid Born");
        b27.setBackground(green);
        b27.setBorder(border);
        b27.setFont(a);
        b27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("Acidbjorn.aif");
            }
        });
        p1.add(b27);
        JButton b28 = new JButton("Analog Climb");
        b28.setBackground(green);
        b28.setBorder(border);
        b28.setFont(a);
        b28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("analogclimb.aif");
            }
        });
        p1.add(b28);
        JButton b29 = new JButton("Echo Melody");
        b29.setBackground(orange);
        b29.setBorder(border);
        b29.setFont(a);
        b29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("120_fife-echo-melody.wav");
            }
        });
        p1.add(b29);
        JButton b30 = new JButton("Pad Cutoff Rhythm");
        b30.setBackground(green);
        b30.setBorder(border);
        b30.setFont(b);
        b30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("pad-cutoff-rhythm-loop.wav");
            }
        });
        p1.add(b30);
        JButton b31 = new JButton("Synth Melody 1");
        b31.setBackground(cyan);
        b31.setBorder(border);
        b31.setFont(a);
        b31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("synth-melody-hyperion1.wav");
            }
        });
        p1.add(b31);
        JButton b32 = new JButton("Synth Melody 2");
        b32.setBackground(cyan);
        b32.setBorder(border);
        b32.setFont(a);
        b32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("synth-melody-hyperion2.wav");
            }
        });
        p1.add(b32);
        JButton b33 = new JButton("Synth Melody 3");
        b33.setBackground(cyan);
        b33.setBorder(border);
        b33.setFont(a);
        b33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("synth-melody-hyperion3.wav");
            }
        });
        p1.add(b33);
        JButton b34 = new JButton("Big Beat");
        b34.setBackground(cyan);
        b34.setBorder(border);
        b34.setFont(a);
        b34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("bigbeat2.aif");
            }
        });
        p1.add(b34);
        JButton b35 = new JButton("Backwards Flute");
        b35.setBackground(orange);
        b35.setBorder(border);
        b35.setFont(a);
        b35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("192_backwards_flutey.wav");
            }
        });
        p1.add(b35);
        JButton b36 = new JButton("Orchestra Flute");
        b36.setBackground(orange);
        b36.setBorder(border);
        b36.setFont(a);
        b36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("pretty-orchestra-flute-melody.wav");
            }
        });
        p1.add(b36);
        JButton b37 = new JButton("All Right!");
        b37.setBackground(purple);
        b37.setBorder(border);
        b37.setFont(a);
        b37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("a-right.aif");
            }
        });
        p1.add(b37);
        JButton b38 = new JButton("Ah Yeah!");
        b38.setBackground(purple);
        b38.setBorder(border);
        b38.setFont(a);
        b38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("ah_yeah!.aif");
            }
        });
        p1.add(b38);
        JButton b39 = new JButton("Absolutely Gorgeous");
        b39.setBackground(purple);
        b39.setBorder(border);
        b39.setFont(b);
        b39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("absolutely_gorgeous.aif");
            }
        });
        p1.add(b39);
        JButton b40 = new JButton("Bramazo");
        b40.setBackground(purple);
        b40.setBorder(border);
        b40.setFont(a);
        b40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("bramazo.aif");
            }
        });
        p1.add(b40);
        JButton b41 = new JButton("Bouncing Bass");
        b41.setBackground(purple);
        b41.setBorder(border);
        b41.setFont(a);
        b41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("follow_the_bouncing_bass.aif");
            }
        });
        p1.add(b41);
        JButton b42 = new JButton("Houston");
        b42.setBackground(purple);
        b42.setBorder(border);
        b42.setFont(a);
        b42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("houston_we_have_problem.aif");
            }
        });
        p1.add(b42);
        JButton b43 = new JButton("Let The Bass Kick");
        b43.setBackground(purple);
        b43.setBorder(border);
        b43.setFont(a);
        b43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("let-the-bass-kick.aif");
            }
        });
        p1.add(b43);
        JButton b44 = new JButton("Guitar Groove 1");
        b44.setBackground(cyan);
        b44.setBorder(border);
        b44.setFont(a);
        b44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("guitar-groove1.wav");
            }
        });
        p1.add(b44);
        JButton b45 = new JButton("Guitar Groove 2");
        b45.setBackground(cyan);
        b45.setBorder(border);
        b45.setFont(a);
        b45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("guitar-groove2.wav");
            }
        });
        p1.add(b45);
        JButton b46 = new JButton("Guitar Groove 3");
        b46.setBackground(cyan);
        b46.setBorder(border);
        b46.setFont(a);
        b46.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("guitar-groove3.wav");
            }
        });
        p1.add(b46);
        JButton b47 = new JButton("Mellow Melodic Tune");
        b47.setBackground(cyan);
        b47.setBorder(border);
        b47.setFont(b);
        b47.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("mellow-melodic.wav");
            }
        });
        p1.add(b47);
        JButton b48 = new JButton("Old Timey Tune");
        b48.setBackground(cyan);
        b48.setBorder(border);
        b48.setFont(a);
        b48.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("oldtimey.wav");
            }
        });
        p1.add(b48);
        JButton b49 = new JButton("Whistling Tune");
        b49.setBackground(cyan);
        b49.setBorder(border);
        b49.setFont(a);
        b49.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playMusic("whistling.wav");
            }
        });
        p1.add(b49);

        ImageIcon homeBttn = new ImageIcon("homebutton.png");
        Image image3 = homeBttn.getImage();
        Image newimg3 = image3.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH);
        homeBttn = new ImageIcon(newimg3);
        JButton home = new JButton(homeBttn);
        home.setPreferredSize(new Dimension(125,100));
        home.setBackground(Color.WHITE);
        home.setBorder(newBorder);
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomeScreen frame = new HomeScreen();
                Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = ((int) tk.getScreenSize().getWidth());
                int ySize = ((int) tk.getScreenSize().getHeight());
                frame.setSize(xSize,ySize);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        p2.add(home);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
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

