package day16.se01.n4Wrapper;

public class Demo01Integer {
    public static void main(String[] args) {
//         java.1ang包下，为8种基本数据类型提供了对应的包装类。
//            例如: byte- ->Byte ...
         /*   包装类提供了字符串、基本数据类型、包装类之间相互转化的方法
            数字基本数据类型的包装类都继承了Number类，它们的使用方式相似。
            下面以常用的基本数据类型int对象的包装类Integer为例，说明数字类型
            包装类的使用。*/
//            * 1、基本数据类型int值转化为Integer类型对象
//            装箱:把基本类型的数据包装到包装类中
            int i=20;
            Integer i1=new Integer(i);//方法一
            Integer i2=Integer . valueOf(i);//方法二.
//            2、Integer对象转化为基本数据类型int值
//            拆箱:在包装类中取出基本类型的数据
            Integer in=new Integer(20) ;
            int in1=in. intValue();
//            3、String类型的数字转化为Integer对象
            String s="120";
            Integer int1=new Integer(s);//方法一 一
            Integer int2=Integer . valueOf(s);//方法二
//            4、Integer类 型转化为String类型
            Integer int0=new Integer(30);
            String s1=int0. toString();
//            5、String类型的数字转化为基本数据类型的int值
            String ss="110";
            int inte=Integer . parseInt(ss);//方法-一
            Integer inte1=new Integer(ss);
            int inte2=inte1 . intValue();//间接方法
//            6、基本数据类型int转化为String类型
            int ins = 10;






    }
}
