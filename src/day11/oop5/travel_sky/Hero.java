package day11.oop5.travel_sky;


public class Hero extends MoveObject{
	
	int life=3;
	public Hero() {
		super("/day11/oop5/travel_sky/imges/hero1.png",97,139);
	}
	
	public void move(int x,int y) {
		this.x=x-width/2;
		this.y=y-height/2;
	}
	
	public void move() {}
	
	int doubleFire=0;
	public Bullet[] biu() {
		
		if(doubleFire>0) {
			Bullet[]bs=new Bullet[2];
			bs[0]=new Bullet(x+width/4,y+height/2);
			bs[1]=new Bullet(x+width*3/4,y+height/2);
			doubleFire-=2;
			return bs;
		}else {
			Bullet[]bs=new Bullet[1];
			bs[0]=new Bullet(x+width/2,y+height/2);
			return bs;
		}
		
	}

}
