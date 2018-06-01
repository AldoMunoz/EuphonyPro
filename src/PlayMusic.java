import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class PlayMusic {
    public static void main(String[] args) {

    }

    public static void playMusic(String filepath) {
        InputStream music;

        try{
            music = new FileInputStream(new File(filepath));
            AudioStream audio = new AudioStream(music);
            AudioPlayer
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog("Error");
        }
    }
}
