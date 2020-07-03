package travel_sky;

import java.applet.Applet;
import java.applet.AudioClip;

public class Bullet extends MoveObject{
	@SuppressWarnings("deprecation")
	AudioClip music3 = Applet.newAudioClip(Start.class.getResource("lazer.wav"));
	public Bullet(int x,int y) {
		super("bullet.png", 40, 80);
		this.x=x-width/2;
		this.y=y-height/2;
		music3.play();
	}
	public void move() {
		y-=5;
	}

}
