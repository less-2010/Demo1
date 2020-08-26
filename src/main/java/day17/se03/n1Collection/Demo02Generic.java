package day17.se03.n1Collection;

import java.util.ArrayList;
import java.util.Objects;

public class Demo02Generic {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("1");
        a.add("小明");
        a.add("小明白");
        for (Object object:a
             ) {
//            String s = (String)object;//java.lang.ClassCastException

        }
        ArrayList<String> arr = new ArrayList<String>();//泛型，规定好
//        arr.add(1);//报错不符合泛型规定
        arr.add("小明名");//符合泛型规定
       /* 泛型也可以自定义使用，也有三步骤:
        1、泛型的定义:定义在类、定义在方法、
        2、泛型的设置
        3、泛型的确定*/
        Person p = new Person();//没有确定泛型
        p.play(new Dog());
        p.play(new Bird());

        Person<Dog> d = new Person();
        d.play(new Dog());
//        d.play(new Bird());//报错

    }
}
