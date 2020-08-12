package day12.oop7.newpack;

import day12.oop7.A;

public class C  extends A{
    public void Cm1(){
        A a = new A();
//      a.Aa=30;  //不同包中子类不能访问private
//      a.Ab=71;  //不同包中的类不能访问default
        Ac = 100; //不同包中的类(继承后)可以访问Protected
        Ad = 30;  //不同包中子类可以访问public
    }
}
