package travel_sky;

public class SpecialPlane extends Enemy{
    int speed=1;
	public SpecialPlane() {
		super("SpecialPlane.png", 60, 51);
	}
	
	public void move() {
		super.move();
	    x+=speed;
		if(x>=(Start.WIDTH-width)|x<=0)speed=-speed;
	}

}
