package day05;

// 作业
// 创建一个圆Circle类， 为该类提供两个方法，
// 方法-用于求圆的面积，方法二用于求圆的周长，
// 同时为该类提供-个变量r表示半径，
// 一 .个常量PI表示圆周率。为该类提供一个无参的构造方法，
// 用于初始化r的值为1; 且提供个有参的构造方法，
// 参数用于初始化半径r的值，

import java.util.Scanner;

public class Circle {
    float r ;
    float pi =3.14f;
    
    //无参数构造函数
    public void Circle(){
        r = 1;
    }
    public void Circle(float r){
    // 有参数构造函数
        this.r = r;
    }

    public float Lenght(float r) {
        return pi * r * 2;
        // System.out.println("面积="+pi*r*2);

    }
    public float Area(float r) {
        return 2* pi*r;
       // System.out.println("面积="+pi*r*r);

    }

    public static void main(String[] args) {
        Circle S = new Circle();
        S.Lenght(1);
        S.Area(2);
        S.Circle(2);
        
    }
    
}