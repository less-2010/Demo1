package travel_sky;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public  abstract class Enemy extends MoveObject{

	public Enemy(String imgURL, int width, int height) {
		super(imgURL, width, height);
	}
	
}
