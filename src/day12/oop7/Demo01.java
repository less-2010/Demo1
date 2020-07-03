package day12.oop7;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
/*  # 二、面向对象

        ## 6、访问控制与封装

            ### 6-1、包的概念:

                1)如果仅仅将类名作为类的唯一标识，则不可避免会出现命名冲突，java中用
                包的概念来解决命名冲突。在定义类时，第一行必须是声明包的语句， 类的全称
                是包名加类名。包在存储空间上是以项目开始的文件夹的层次目录。
                2)正规的包命名规则是域名倒着写，其后跟项目名、模块名。例如:
                cn. com. zte. project1. register
                3)访问一个类时，可以使用类的全称，但是这样过于繁琐。
                4)通过import语句声明了类的全称，该源文件中就可以直接用类名来表示类的全称了
*/
        java.util.Arrays.toString(new int[5]);
        Arrays.toString(new int[5]);
        Scanner s;
/*
        ## 6-2、访问权限修饰符:

            ### 6-2-1、对属性的访问

                1) private修饰的成员:只能在本类中访问。
                2) (defau1t)修 饰的成员:只能在本类和同包中访问。
                3) protected修饰的成员:可以在本类和同包、以及异包的子类中访问。
                4) public修饰的成员:可以在整个项目中访问。

            ### 6-2-2、对类的修饰


        ## 6-3、封装
            ### 6-3-1、封装的概念

                把客观事物抽象成抽象的类，并且类可以把自己的属性和方法只让可以信任的
                类或者对象进行操作，对不可以信任的类或者对象隐藏，这样的过程叫做封装。

            ### 6-3-2、封装的分类:

                6-3-2-1、对属性的封装
                将属性设置为private (私有)，限制其只能在类的内部使用
                6-3-2-2、对方法的封装
                将外部可以访问的方法设置为public,不能访问的设置为private
                6-3-2-3、对私有属性提供get、set方法，可酌情设置密码
                6-3-2-4、对私有方法提供相应调用，常用场景:懒汉单例模式

*/
        Person p1 = new Person();
        System.out.println(p1);
        System.out.println(p1.getDeposit(123));

        Son s1= new Son();
        s1.sleep();

        Other o1  = new Other();
        o1.sleep();
//      p1.bathe();//报错，私有方法，封装隐藏
        p1.camera(123456);//被信任,可以使用


//            懒汉单例模式（单线程）
//      LazySingleton ls=new LazySingleton();//(多线程不安全)
//      LazySingleton ls2=new LazySingleton();//构造设置为私有才可能单例
        LazySingleton ls3=LazySingleton . getInstance();
        LazySingleton ls4=LazySingleton . getInstance();
        System. out . println(ls3.a);
        System. out . println(ls4.a);//A没有实现单例






    }
}
