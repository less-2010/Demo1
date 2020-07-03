package day12.oop7;

public class A {
    private int Aa = 10;
    int Ab = 10;
    protected int Ac = 10;
    public int Ad = 10;
    public void m1(){
        Aa = 20;//本类中可以访问private修饰的属性
        Ab = 20;//本类中可以访问default修饰的属性
        Ac = 20;//本类中可以访问protected修饰的属性
        Ad = 20;//本类中可以访问public修饰的属性
    }
    
}
