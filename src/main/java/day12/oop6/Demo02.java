package day12.oop6;

public class Demo02 {
    public static void main(String[] args) {

/*
    # 二、面向对象.
        ## 5、内部类:一个类可以定义在另一个类的内部，这个类称为另外- -个类的内部类

            ### 5-1、成员内部类:当定义的位置是作为一一个成员时，称为成员内部类。

                1)对外不具备可见性，所属外部类则可见。
                2)内部类可以调用所属外部类的成员。
                3)内部类有与外部类同名成员会覆盖，可用“外部类.this.成员”来调出外部类的同名成员。
*/

            Out n = new Out();
            // System.out.println(n.aInner);
            // System.out.println(n.ac);
            System.out.println(n.name);
            n.get_name();

            Other o = new Other();
            o.m1();

            // Inner in = new Inner(); //对外不具备可见性，所属外部类则可见。

/*
                4)内部类可以自由访问外部类成员，但是，外部类访问内部类成员需要内部类对象名.调用。
                5)对外要new内部类对象，得通过外部类的对象进行
*/
            Out.Inner in = n.new Inner();
            System.out.println(in.name);

//              6)内部类和所属外部类是两个类。参见.class文件

/*
            ### 5-2、局部内部类:当定义的位置在方法内或某作用域内时，称为局部内部类。

                1)类似于一个局部变量，只在本方法内或本作用域内定义后有效。
                2)类似于局部变量，不能用static修饰。

            ### 5-3、 匿名内部类:没有类名(匿名)，是对某个类的继承或某个接口的实现。

                1)定义方式:比较特别。
                2)作用:一 般用于实现父类或者接口中的方法。
                3)唯一的没有构造方法的类一- 没有类名怎么去写构造?
                4)只可能生成唯一的对 象。
                5)该对象如果需要引用，只能向上造型。
                6)可以作为成员内部类存在，也可以作为局部内部类存在。
                7) .class文件名 为: outer$1.class*/

            Out out = new Out(){ //局部匿名内部类 new 对象的同时定义
                //子类的拓展内容

            };
            System.out.println(out.getClass().getName());//输出类文件名
/*
            ### 5-4、静态内部类: static修饰的内 部类

                1)只能是成员内部类，不能是局部内部类。
                2)不能访问外部类的实例成员。
                3)匿名内部类唯一的对象可以赋值给静态成员。

            ### 5-5、可以实现多继承的效果。
*/
            Son.Separtion ss = new Son().new Separtion();
            ss.m11();





    }
    Out ou = new Out(){ };//成员匿名内部类
    
    
}