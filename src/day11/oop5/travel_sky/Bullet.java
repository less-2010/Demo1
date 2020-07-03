package day11.oop5.travel_sky;

public class Bullet extends MoveObject{

	public Bullet(int x,int y) {
		super("/day11/oop5/travel_sky/imges/bullet.png", 40, 80);
		this.x=x-width/2;
		this.y=y-height/2;
	}
	public void move() {
		y-=10;

	}

}
