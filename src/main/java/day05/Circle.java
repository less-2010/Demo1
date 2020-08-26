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
    double r;
    static final double PI = 3.14d;

    public Circle(int i) {
        r=i;
    }

    //无参数构造函数
    public void Circle() {
        r = 1;
    }

    public void Circle(double r) {
        // 有参数构造函数
        this.r = r;
    }

    public double Lenght(double r) {
        return PI * r * 2;
    }

    public double Area() {
        return 2 * PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}