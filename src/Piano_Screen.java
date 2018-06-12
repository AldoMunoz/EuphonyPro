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

//Set Speed Button = next order of operations!!!

public class Piano_Screen extends JFrame {
    Color Snow2 = new Color(255,250,250);
    Border border = new LineBorder(Color.BLACK, 1);
    Border newBorder = new LineBorder(Color.WHITE, 1);
    Border wBorder = new LineBorder(Color.WHITE, 3);

    public Piano_Screen() {
        setTitle("Piano Screen!");
        List<String> pianoNotes = new ArrayList<String>();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(1,7,10,10));
        JPanel p3 = new JPanel(new GridLayout(4,1));
        p2.setBackground(Color.WHITE);
        p1.setBackground(Color.WHITE);
        p1.setLayout(new FlowLayout());
        p1.setBackground(Snow2);

        //BUTTONS ON THE SIDE//

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
        play.setPreferredSize(new Dimension(125, 100));
        play.setBackground(Color.WHITE);
        play.setBorder(newBorder);
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
        stop.setPreferredSize(new Dimension(125,100));
        stop.setBackground(Color.WHITE);
        stop.setBorder(newBorder);
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        p3.add(stop);

        JButton cancel = new JButton(cancelBttn);
        cancel.setPreferredSize(new Dimension(125,100));
        cancel.setBackground(Color.WHITE);
        cancel.setBorder(newBorder);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();
                p1.revalidate();
                p1.repaint();
                pianoNotes.clear();
            }
        });
        p3.add(cancel);

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
        p3.add(home);

        p2.setBorder(border);
        p1.setBorder(border);

        //BUTTONS ON THE SIDE//

        //PIANO KEYS//

        JButton a = new JButton("A");
        a.setPreferredSize(new Dimension(40, 60));
        a.setFont(new Font("Impact", Font.BOLD, 50));
        a.setForeground(Color.WHITE);
        a.setBackground(Color.BLACK);
        a.setBorder(wBorder);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel aLetter = new JLabel("A");
                aLetter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("a.wav");
                p1.add(aLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(a);
        JButton b = new JButton("B");
        b.setPreferredSize(new Dimension(40, 60));
        b.setFont(new Font("Impact", Font.BOLD, 50));
        b.setForeground(Color.WHITE);
        b.setBackground(Color.BLACK);
        b.setBorder(wBorder);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel bLetter = new JLabel("B");
                bLetter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("b.wav");
                p1.add(bLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(b);
        JButton c = new JButton("C");
        c.setForeground(Color.WHITE);
        c.setBackground(Color.BLACK);
        c.setBorder(wBorder);
        c.setFont(new Font("Impact", Font.BOLD, 50));
        c.setPreferredSize(new Dimension(40, 100));
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel cLetter = new JLabel("C");
                cLetter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("c.wav");
                p1.add(cLetter);
                p1.revalidate();
            }
        });
        p2.add(c);
        JButton d = new JButton("D");
        d.setPreferredSize(new Dimension(40, 60));
        d.setFont(new Font("Impact", Font.BOLD, 50));
        d.setForeground(Color.WHITE);
        d.setBackground(Color.BLACK);
        d.setBorder(wBorder);
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel dLetter = new JLabel("D");
                dLetter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("d.wav");
                p1.add(dLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(d);
        JButton e = new JButton("E");
        e.setPreferredSize(new Dimension(40, 60));
        e.setFont(new Font("Impact", Font.BOLD, 50));
        e.setForeground(Color.WHITE);
        e.setBackground(Color.BLACK);
        e.setBorder(wBorder);
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel eLetter = new JLabel("E");
                eLetter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("e.wav");
                p1.add(eLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(e);
        JButton f = new JButton("F");
        f.setPreferredSize(new Dimension(40, 60));
        f.setFont(new Font("Impact", Font.BOLD, 50));
        f.setForeground(Color.WHITE);
        f.setBackground(Color.BLACK);
        f.setBorder(wBorder);
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel fLetter = new JLabel("F");
                fLetter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("f.wav");
                p1.add(fLetter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(f);
        JButton g = new JButton("G");
        g.setPreferredSize(new Dimension(40, 60));
        g.setFont(new Font("Impact", Font.BOLD, 50));
        g.setForeground(Color.WHITE);
        g.setBackground(Color.BLACK);
        g.setBorder(wBorder);
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel gLetter = new JLabel("G");
                gLetter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("g.wav");
                p1.add(gLetter);
                p1.revalidate();
            }
        }); {
        }

        p2.add(g);
        JButton rest = new JButton("Rest");
        rest.setPreferredSize(new Dimension(40, 60));
        rest.setFont(new Font("Impact", Font.BOLD, 50));
        rest.setForeground(Color.WHITE);
        rest.setBackground(Color.BLACK);
        rest.setBorder(wBorder);
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel restLestter = new JLabel("Rest");
                restLestter.setFont(new Font("Impact", Font.BOLD, 60));
                pianoNotes.add("rest.mp3");
                p1.add(restLestter);
                p1.revalidate();
            }
        }); {
        }
        p2.add(rest);



        //PIANO KEYS//

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
