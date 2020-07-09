package Day14.API;

import java.util.Random;

public class DemoObject {
    public static void main(String[] args) {

        /**
         * java.lang.object
         * object类是类层次结构中最顶层父类。
         * 所有类(包括数组)直接或间接的继承自0bject类。
         * 同时也继承了该类中的方法
         *
         */
//      hashCode()、toString()、equals()这三个方法是我们今后在做项目时
//		经常要调用的方法，尤其是在编写一个标准的Java类之后，我们常常重写这三个方法。
//		标准的Java类又叫做JavaBean，要求如下：
//    		1、所有成员变量的访问权限：private
//    		2、为每一个成员变量设置一对getter&setter
//    		3、设置一个无参构造和一个全参构造。
        Object o1 = new Random(); //所有类型对象的引用都可以赋值给object类的引用变量
//        object的构造方法:只有-个无参的构造。
//        object()，默认提供的一个无参空构造。参见源码。
//        object的常用方法
//        8-1) boolean equals(object o)比较两个对象是否相等
        Object o2 = new  Object();
        Object o3 = new  Object();//无参空构造
        System.out.println(o3.equals(o2));//false  //两个对象在堆内存中的值不同
        System.out.println(o3.equals(o1));//false
//        8-2) int hashCode() 返回一个对象的哈希码
        System. out . println(o2. hashCode());//1956725890
        System. out . println(o2. hashCode());//1956725890
        System. out . println(o3. hashCode());//356573597
//        对于object类来说，哈希码表示对象的地址，所以，不同的对象有着不同的哈希码;但是，对于哈希码本身而言，并不要求如此严格的一一对应。

     /*
        哈希码:它是一种算法，让同一个类的对象按照自己不同的特征，
        尽量的有不同的哈希码，但不表示不同对象的哈希码完全不同。
        1、对象相同，哈希码一定相同;哈希码不同，对象一定不同。
        2、哈希码相同，对象尽量相同，但不一定相同。不同对象，可能哈希码相同
        */
        String  s1  ="ABCDEa123abc";
        String  s2  ="ABCDFB123abc";
        System.out.println(s1.hashCode());//165374702
//        不同对象，哈希码可能相同
        System.out.println(s1.hashCode()==s2.hashCode());//true
        System.out.println(s2.hashCode());//165374702
        System.out.println(s1.equals(s2));//false
        System.out.println(s1==s2);//false
//        8-3) toString()
        System.out.println(s1.toString()==s1);//true 直接打印对象名默认调用toString()

    }


}
