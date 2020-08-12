package day08.day08.travel_sky.src;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky {
	BufferedImage img;
	int width=1200;
	int height=1800;
	int x=0;
	int y=0;
	int y2=-height;
	
	public Sky() {
		try {
			img = ImageIO.read(Sky.class.getResource("/imges/bg1.bmp"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

	public void paint(Graphics g) {
		g.drawImage(img,x,y,null);
		g.drawImage(img,x,y2,null);
		
	}

}
