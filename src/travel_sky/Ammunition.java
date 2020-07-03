package travel_sky;

import java.awt.Graphics;

public class Ammunition extends Enemy{
	int count = (int)(Math.random()*2);
	public Ammunition() {
		super("Ammunition.png",60,50);
	}
	public void move() {
		y+=5;
		
	}
	public void paint(Graphics g) {
		g.drawImage(img, x, y, null);
//		y+=2;
		if(count == 0) {
			x+=9;
			if(x>(Start.WIDTH-width)) {
				count = 1;
			}
		}
		else {
			x-=9;
			if(x<=0) {
				count = 0;
			}
		}
}

}
