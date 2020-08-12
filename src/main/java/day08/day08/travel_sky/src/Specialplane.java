package day08.day08.travel_sky.src;

public class Specialplane extends Enemy {
    int speed = (int)(Math.random()*-1);
    public Specialplane() {
        super("imges/SpecialPlane.png",60, 51);
    }
}
