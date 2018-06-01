import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class PlayMusic {
    public static void main(String[] args) {
        playMusic("fortnitetest.wav");
        System.out.println("Running");
    }

    public static void playMusic(String filepath) {
        InputStream music;

        try{
            music = new FileInputStream(new File(filepath));
            AudioStream audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
