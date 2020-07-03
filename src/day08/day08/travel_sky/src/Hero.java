package day08.day08.travel_sky.src;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Hero{
	BufferedImage img;
	int width=97;
	int height=139;
	int x=0;
	int y=0;

	
	public Hero() {
		try {
			img = ImageIO.read(Hero.class.getResource("/imges/hero1.png"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	

	public void paint(Graphics g) {
		g.drawImage(img,x,y,null);
		
	}
	
    public 	void move(int x,int y) {
		this.x=x;
		this.y=y;

	}



}
