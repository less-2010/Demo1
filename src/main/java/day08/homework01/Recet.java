package day08.homework01;

public class Recet extends Shape{
        // 矩形类
        double width;
        double height;
        public void Rect() {
        }
        public void Rect(double width, double height) {
            // 初始化矩形长和宽
            this.height=height;
            this.width=width;
        }
        @Override
        public void get_Perimeter() {
            // 求周长
           Shape.perimeter = (height+width)*2;
            System.out.println("矩形的周长为:"+perimeter);
        }
        @Override
        public void get_Area(){
            // 求面积
            Shape.area = height*width;
            System.out.println("矩形的面积为:"+area);
        }
    
}