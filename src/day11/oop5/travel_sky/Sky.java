package day11.oop5.travel_sky;

import java.awt.Graphics;

public class Sky extends MoveObject{
//	public static final String bg0 = "/travel_sky/imges/background.bmp";
//	public static final String bg1 = "/day11/oop5/travel_sky/imges/background1.bmp";
	public static final String bg2 = "/day11/oop5/travel_sky/imges/background2.bmp";
//	public static final String bg3 = "/travel_sky/imges/background3.bmp";
//	public static final String bg4 = "/travel_sky/imges/background5.bmp";

	int y2=-height;
	public Sky() {
		super(bg2,1200,1800);
		x=0;
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
