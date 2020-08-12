package day09;// 作业：使用抽象类和抽象方法
// 设计一个形状类Shape,方法:求周长和求面积
// 形状类的子类:Rect(矩形),Circle(圆形)
//  Rect类的子类:Square(正方形)
//  不同的子类会有不同的计算周长和面积的方法



public abstract class Shape {
	public abstract double perimeters();
	public abstract double areas();
}
class Rect extends Shape{
	double width;
	double height;
	public Rect() {
		this.width=0;
		this.height=0;
	}
	public Rect(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double perimeters() {
		return (this.width+this.height)*2;
	}
	public double areas() {
		return this.width*this.height;
	}
}
class Circle extends Shape{
	double radius;
	final static double PI=3.1415926; 
	public Circle() {
		this.radius=0.0;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double perimeters() {
		return this.radius*2*PI;
	}
	public double areas() {
		return this.radius*this.radius*PI;
	}
}
class Square extends Rect{
	public Square() {
		super();
	}
	public Square(double width) {
		super(width,width);
	}
	public double perimeters(){
		return this.width*4;
	}
	public double areas() {
		return this.width*this.width;
	}
}