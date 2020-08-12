package day09;

public class Test {
	public static void main(String[] args) {
		Test test=new Test();
		test.shape();
	}
	public void shape() {
		Rect rect=new Rect(2,3);
		Circle circle=new Circle(4);
		Square square=new Square(5);
		System.out.println("矩形rect的周长为:"+rect.perimeters()+"\t\t面积为:"+rect.areas());
		System.out.println("圆形circle的周长为:"+circle.perimeters()+"\t面积为:"+circle.areas());
		System.out.println("正方形square的周长为:"+square.perimeters()+"\t面积为:"+square.areas());
	}
}
