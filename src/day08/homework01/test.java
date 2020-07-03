package day08.homework01;

public class test {
    public static void main(String[] args) {


        Recet recet = new Recet();
        // 矩形
        recet.Rect(4, 5);
        recet.get_Perimeter();
        recet.get_Area();
        // 
        // 圆形
        Circle circle = new Circle();
        circle.Circle(3);
        circle.get_Perimeter();
        circle.get_Area();

        //正方形
        Square square = new Square();
        square.Square(6);
        square.get_Area();
        square.get_Primenter();


    }
    
}