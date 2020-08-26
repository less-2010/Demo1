package day05;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Circle[] circles = new Circle[100];
//        for (int i = 0; i < circles.length; i++) {
//            circles[i]= new Circle(i);
//        }
//        for (Circle c:circles
//             ) {
//            System.out.println(c.toString());
//        }
//        System.out.println(Arrays.stream(circles).count());
        Car car = new Car("大众","红色",500000,"G16541c");
        car.goFord();
        car.outFord();
        System.out.println(car.toString());
    }
}
