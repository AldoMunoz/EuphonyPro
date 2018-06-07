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
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;


public class Piano_Screen extends JFrame {


    public Piano_Screen() {
        setTitle("Piano Screen!");
        List<String> pianoNotes = new ArrayList<String>();
        Border border = new LineBorder(Color.BLACK, 1);

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        JPanel p2 = new JPanel(new GridLayout(1,7,10,10));
        JPanel p3 = new JPanel(new GridLayout(4,1));
        p2.setBackground(Color.BLACK);

        ImageIcon playBttn = new ImageIcon("playbutton.png");
        Image image = playBttn.getImage();
        Image newimg = image.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH);
        playBttn = new ImageIcon(newimg);

        ImageIcon stopBttn = new ImageIcon("stopbutton.png");
        Image image1 = stopBttn.getImage(); // transform it
        Image newimg1 = image1.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH);
        stopBttn = new ImageIcon(newimg1);

        ImageIcon cancelBttn = new ImageIcon("xbutton.png");
        Image image2 = cancelBttn.getImage();
        Image newimg2 = image2.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH);
        cancelBttn = new ImageIcon(newimg2);

        ImageIcon homeBttn = new ImageIcon("homebutton.png");
        Image image3 = homeBttn.getImage();
        Image newimg3 = image3.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH);
        homeBttn = new ImageIcon(newimg3);

        JButton play = new JButton(playBttn);
        play.setPreferredSize(new Dimension(100, 100));
        play.setBackground(Color.YELLOW);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < pianoNotes.size(); i++) {
                    playMusic(pianoNotes.get(i));
                }
            }
        });
        p3.add(play);

        JButton stop = new JButton(stopBttn);
        stop.setPreferredSize(new Dimension(100,100));
        stop.setBackground(Color.YELLOW);
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        p3.add(stop);

        JButton cancel = new JButton(cancelBttn);
        cancel.setPreferredSize(new Dimension(100,100));
        cancel.setBackground(Color.YELLOW);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();
                p1.revalidate();
                p1.repaint();
            }
        });
        p3.add(cancel);

        JButton home = new JButton(homeBttn);
        home.setPreferredSize(new Dimension(100,100));
        home.setBackground(Color.YELLOW);
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
        p3.add(home);

        p2.setBorder(border);
        p1.setBorder(border);

        JButton a = new JButton("A");
        a.setPreferredSize(new Dimension(40, 60));
        a.setFont(new Font("Stencil", Font.BOLD, 30));
        a.setBackground(Color.WHITE);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel aLetter = new JLabel("A");
                aLetter.setFont(new Font("Stencil", Font.BOLD, 30));
                pianoNotes.add("a.wav");
                p1.add(aLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(a);
        JButton b = new JButton("B");
        b.setPreferredSize(new Dimension(40, 60));
        b.setFont(new Font("Stencil", Font.BOLD, 30));
        b.setBackground(Color.WHITE);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel bLetter = new JLabel("B");
                bLetter.setFont(new Font("Stencil", Font.BOLD, 30));
                pianoNotes.add("b.wav");
                p1.add(bLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(b);
        JButton c = new JButton("C");
        c.setBackground(Color.WHITE);
        c.setFont(new Font("Stencil", Font.BOLD, 30));
        c.setPreferredSize(new Dimension(40, 100));
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel cLetter = new JLabel("C");
                cLetter.setFont(new Font("Stencil", Font.BOLD, 30));
                pianoNotes.add("c.wav");
                p1.add(cLetter);
                p1.revalidate();
            }
        });
        p2.add(c);
        JButton d = new JButton("D");
        d.setPreferredSize(new Dimension(40, 60));
        d.setFont(new Font("Stencil", Font.BOLD, 30));
        d.setBackground(Color.WHITE);
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel dLetter = new JLabel("D");
                dLetter.setFont(new Font("Stencil", Font.BOLD, 30));
                pianoNotes.add("d.wav");
                p1.add(dLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(d);
        JButton e = new JButton("E");
        e.setPreferredSize(new Dimension(40, 60));
        e.setFont(new Font("Stencil", Font.BOLD, 30));
        e.setBackground(Color.WHITE);
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel eLetter = new JLabel("E");
                eLetter.setFont(new Font("Stencil", Font.BOLD, 30));
                pianoNotes.add("e.wav");
                p1.add(eLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(e);
        JButton f = new JButton("F");
        f.setPreferredSize(new Dimension(40, 60));
        f.setFont(new Font("Stencil", Font.BOLD, 30));
        f.setBackground(Color.WHITE);
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel fLetter = new JLabel("F");
                fLetter.setFont(new Font("Stencil", Font.BOLD, 30));
                pianoNotes.add("f.wav");
                p1.add(fLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(f);
        JButton g = new JButton("G");
        g.setPreferredSize(new Dimension(40, 60));
        g.setFont(new Font("Stencil", Font.BOLD, 30));
        g.setBackground(Color.WHITE);
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel gLetter = new JLabel("G");
                gLetter.setFont(new Font("Stencil", Font.BOLD, 30));
                pianoNotes.add("g.wav");
                p1.add(gLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(g);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        add(p3, BorderLayout.EAST);


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
