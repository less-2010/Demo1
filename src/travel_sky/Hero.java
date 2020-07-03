package travel_sky;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Hero extends MoveObject {
	@SuppressWarnings("deprecation")
	AudioClip music4 = Applet.newAudioClip(Start.class.getResource("booom.wav"));
	int life = 3;
	int Booooom = 0;

	public Hero() {
		super("hero1.png", 97, 139);
	}

	public void move(int x, int y) {
		this.x = x - width / 2;
		this.y = y - height / 2;
	}

	public void move() {
	}

	int doubleFire = 0;
	int boomboomFire = 0;

	public Bullet[] biu() {
		if (Booooom > 0) {
			if (boomboomFire > 0) {
				
				Bullet[] bs = new Bullet[30];
				music4.play();
				for (int a = 0; a < 30; a++) {
					bs[a] = new Bullet((Start.WIDTH - (a * 40)), y + height / 2);
				}
				boomboomFire = 0;
				Booooom--;
				return bs;
			} else {
				boomboomFire = 0;
			}
		}

		if (doubleFire > 0) {
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(x + width / 4, y + height / 2);
			bs[1] = new Bullet(x + width * 3 / 4, y + height / 2);
			doubleFire -= 2;
			return bs;
		} else {
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(x + width / 2, y + height / 2);
			return bs;
		}

	}

}
