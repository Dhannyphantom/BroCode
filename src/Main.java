import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File musicFile = new File("beat.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        System.out.println("Welcome to Danny Audio Player");
        System.out.println("Press p: play, s: stop, r; reset, q: quit");

        String action = scanner.next();
        action = action.toLowerCase();
        while (!action.equals("q")) {
            switch (action) {
                case "p":
                    clip.start();
                    break;
                 case "s":
                    clip.stop();
                    break;
                case "r":
                    clip.setMicrosecondPosition(0);
                    break;
                default:
                    clip.close();
                    System.out.println("Bye");
            }
            action = scanner.next();
        }

    }
}
