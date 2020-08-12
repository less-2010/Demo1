package day08.day08.travel_sky.src;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy{
    BufferedImage img;
    int width;
    int height;
    int x=(int)(Math.random()*(1200-97));
    int y=0;


    public Enemy(String imgURL,int width,int height) {
        try {
            img = ImageIO.read(Enemy.class.getResource(imgURL));
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

        this.width = width;
        this.height = height;
    }


    public void paint(Graphics g) {
        g.drawImage(img,x,y,null);

    }

    public 	void move(int x,int y) {
        this.x=x;
        this.y=y;

    }



}
