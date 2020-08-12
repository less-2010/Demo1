package day11.oop5.travel_sky;

public class SpecialPlane extends Enemy{
    int speed=2;
	public SpecialPlane() {
		super("/day11/oop5/travel_sky/imges/SpecialPlane.png", 60, 51);
	}
	
	public void move() {
		super.move();
	    x+=speed;
		if(x>=(Start.WIDTH-width)|x<=0)speed=-speed;
	}

}
