package day12.oop7;

public class B {
    public void Bm1(){
        A a  = new A();
//      a.Aa = 30;//报错 同包的另一个类可以访问private修饰的属性
        a.Ab = 20;//同包的另一个类可以访问default修饰的属性
        a.Ac = 20;//同包的另一个类可以访问default修饰的属性
        a.Ad = 20;//同包的另一个类可以访问default修饰的属性

    }
}
