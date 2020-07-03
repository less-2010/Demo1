package day15.se01.n1object;

import java.util.Objects;

public class Demo06objects {
    public static void main(String[] args) {
        String s1= "abc";
        s1=null;
        String s2 = "abc";
//        boolean b = s1.equals(s2);//空指针异常
//        System.out.println(b);
        /**
         * 在JDK7添加了一个0bjects工具类，它提供了一些方法来操作
         *         对象，它由一些静态的实用方法组成，这些方法时null-save
         *         (空指针安全) 的，用于计算对象的hashCode、返回对象的字符串
         *         表示形式、比较两个对象。|
         *
          */
//       boolean b2=Objects.equals(s1, s2);
//        System . out. println(b2);
        Person p1=new Person() ;
        Person p2=null;
        System.out.println(Objects.equals(p2,p1));
//        System.out.println( s1.hashCode());
        System.out.println(Objects.hash(s1));
        System.out.println(p1.hashCode());



    }
}
