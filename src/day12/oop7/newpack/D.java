package day12.oop7.newpack;

import day12.oop7.A;

public class D {
    public void Dm1(){
        A a = new A();
//      a.Aa=30;  //不同包中子类不能访问private修饰的属性
//      a.Ab=71;  //不同包中的类不能访问default修饰的属性
//      a.Ac = 100; //不同包中的类(没继承)可以不访问Protected修饰的属性
        a.Ad = 30;  //不同包中子类（没继承）可以访问public修饰的属性
    }
}
