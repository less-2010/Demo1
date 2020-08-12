package day08.homework01;

public class Circle extends Shape {
    double radius;
    double Pi;
    public void Circle(){};
    public void Circle(double radius) {
        this.radius = radius;
        this.Pi = 3.1415926535d;
    }

    public void get_Area() {
        // 求⚪面积
        super.area = radius * radius * Pi;
        System.out.println("⚪的面积为：" + super.area);
    }

    public void get_Perimeter(){
        // 求⚪周长
        super.perimeter = 2 * Pi * radius;
        System.out.println("⚪的周长为：" + super.perimeter);
    }

    
}