package comstudy21;

import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class MusicPlayTest extends JFrame implements Runnable {
	
	 public MusicPlayTest() {
	      try {
	         play();
	         try {
	            Thread.sleep(20000);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      }
	   }

	   public void play() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	      InputStream is = this.getClass().getResourceAsStream("BGM_1.wav");
	      AudioInputStream stream = AudioSystem.getAudioInputStream(is);
	      
	      Clip clip = AudioSystem.getClip();
	      clip.stop();
	      clip.open(stream);
	      System.out.println("사운드 재생중 ...");
	      clip.start();
	   }

	   
	   public static void main(String[] args) {
	      new MusicPlayTest();
	   }

	@Override
	public void run() {
		
	}   
}
