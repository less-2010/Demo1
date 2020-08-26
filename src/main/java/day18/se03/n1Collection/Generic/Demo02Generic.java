package day18.se03.n1Collection.Generic;

import java.util.ArrayList;

public class Demo02Generic {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("1");
        a.add("小明");
        a.add("小明白");
        for (Object object:a
             ) {
            String s = (String)object;//java.lang.ClassCastException

        }
        ArrayList<String> arr = new ArrayList<String>();//泛型，规定好
//        arr.add(1);//报错不符合泛型规定
        arr.add("小明名");//符合泛型规定
       /* 泛型也可以自定义使用，也有三步骤:
       是Object的子类
        1、泛型的定义:定义在类、定义在方法、
        2、泛型的设置
        3、泛型的确定
        4、泛型的触发:当调用设置的代码时  泛型:把类型作为变量的值
*/
        Person p = new Person();//没有确定泛型
        p.play(new Dog());
        p.play(new Bird());

        Person<Dog,Object> d = new Person();
        d.play(new Dog());
//        d.play(new Bird());//报错不符合泛型规定
        d.show(new Dog());
        p.show(new Bird());

        Bird<Fly> bird = new Bird();
        bird.add(new Fly());


//      ？：确定泛型时的通配符，不能new对象的时候使用，只能在方法参数时使用
        Customer c = new Customer();
        Person<Bird,Love> per = new Person();
        per.setPrt(new Bird());
        c.allPlayPet(per);
//        ？的extends 和super问题
        Person<Canary,Money>p2 = new Person();
        p2.setPrt(new Canary());
        c.call(p2);

        Person<Bird,Money>p3 = new Person();
        p3.setPrt(new Bird());
        c.call(p3);


    }


}
