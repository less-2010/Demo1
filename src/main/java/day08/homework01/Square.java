package day08.homework01;

public class Square extends Recet {
    double length;
    public void Square() {
    }

    public void Square(double length) {
        this.length = length;
    }

    public void get_Area() {
        
        // 正方形周长
        super.perimeter = length * 4;
        System.out.println("正方形的周长为："+ super.perimeter);
        
    }

    public void get_Primenter() {
        
        // 正方形面积
        super.area = length*length;
        System.out.println("正方形的面积为："+ super.area);        
    }


    
}