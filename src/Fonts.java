import java.awt.*;

//use this to find the name of all fonts on JAVA

public class Fonts {
    public static void main(String[] args) {
        String fonts[]
                = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (int i = 0; i < fonts.length; i++) {
            System.out.println(fonts[i]);
        }
    }
}
