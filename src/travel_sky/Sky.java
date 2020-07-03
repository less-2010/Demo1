package travel_sky;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky extends MoveObject{
	int y2=-height;
	static String imgname = "background5.bmp";
//	@SuppressWarnings("deprecation")
	AudioClip music2 = Applet.newAudioClip(Start.class.getResource("bgm.wav"));
	public Sky() {
		super(imgname,1200,1800);
		x=0;
		music2.loop();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, x, y2, null);
	}
	
	public void move() {
		y+=1;
		y2+=1;
		if(y>=height)y=-height;
		if(y2>=height)y2=-height;
	}

}
