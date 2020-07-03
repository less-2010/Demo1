package travel_sky;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MoveObject {
	BufferedImage img;
	
	int width;
	int height;
	int x=(int)(Math.random()*(Start.WIDTH-width-3));
	int y=0;
	@SuppressWarnings("deprecation")
	AudioClip music = Applet.newAudioClip(Start.class.getResource("jizhongh.wav"));
	
	public MoveObject(String imgURL,int width,int height) {
		try {
			img=ImageIO.read(Enemy.class.getResource(imgURL));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.width=width;
		this.height=height;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public void move() {
		y+=2;
	}
	public void music() {
		System.out.println("»÷ÖÐ~£¡");
		music.play();
	}

}
