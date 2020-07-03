package day17.se02.Demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class n1Exception {
    public static void main(String[] args) throws ParseException {
        /**
         * 什么是异常(Exception)
         * 异常是程序在编译或运行过程中出现的例外，这些例外有的可以避免，有的却
         * 无法避免。
         * Exception类继承自Throwable类， Throwable类还有一个子类Error。
         * Error代表的是错误，不再是程序员编程处理的范围。
         * 检查异常也称为编译期异常
         * 不可避免，必须进行异常处理，要不编译器报错
         * Exception以及它的子类(除去RuntimeException)
         *
         * 未检查异常也称为运行时异常
         * 可以避免，不需要必须处理
         * RuntimeException以及它的子类|
         */
//       ## 常见的运行时异常

//               NullPointerException空指针异常
        String name=null;
        System. out . println(name . hashCode());
//                处理
//        1)if(name!null){
//            System. out . println(name . hashCode());
//        }
//        2) System.out.println(Objects.hash(name));
//              ArithmeticException 算数异常
        Scanner sc=new Scanner(System. in);
        int i=sc.nextInt();
        System. out . println(10/i);
//              ArrayIndexOutOfBoundsException数组 下标越界异常
        String[]s=new String[3];

        System. out. println(s[4] );
//              ClassCastException类型转换 异常
       Object o=new Integer(20);
       String str = (String)o;

//       ## 常见的编译期异常
//               parseException 解析异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String string = "1999年01月18日";
        Date date = sdf.parse(string);//报错需要异常处理
      /*  Java编译期异常必须处理，否则编译器会提示错误，且源文件无法成功编译
        处理方法有两种:
        1、使用try_ _catch_ fina1ly关键字捕获并处理
        2、使用throws关键字声明抛出异常，让别人去处理*/






    }

 }