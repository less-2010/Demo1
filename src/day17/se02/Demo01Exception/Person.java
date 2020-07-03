package day17.se02.Demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    public static void main(String[] args) {
        System.out.println(Test1());
        System.out.println(Test2());
        System.out.println(Test3());

    }

    private static StringBuilder Test3() {
        SimpleDateFormat sdf=new SimpleDateFormat( "yyyy年MM月dd日");
        String string="19$$99年01月12日";
        StringBuilder rStr=new StringBuilder( "begin");
        try {
            Date date =sdf . parse(string);
            return rStr;
        } catch (ParseException e) {
            System. out . println("catch代码块");
            rStr . append( "catch");
            return rStr;//先封存 地址，再finally， 再return封 存
        }finally {
            System. out . println("final1y代码块");
            rStr . append( "finally");
        }

    }

    private static int Test2() {
        SimpleDateFormat sdf=new SimpleDateFormat( "yyyy年MM月dd日");
        String string="1999年01月12日";
        int a =0;

        try {  //可能抛出异常的代码区

            Date date =sdf . parse(string);
            return a;
        } catch (ParseException e) {//处理方案区
            System . out . println("catch代码块");
            a+=100;
            return a;   //先封存基本数据类型， 再finally, 再return封存
        }finally {
            System . out . println("final1y代码块" );
            a=1;
        }

    }

    private int age=0;


        private static Person Test1() {
        SimpleDateFormat sdf=new SimpleDateFormat( "yyyy年MM月dd日");
        String string="19$$99年01月12日";
        Person p = new Person();
        String rStr="begin" ;
        try {
            Date date =sdf . parse(string);
        } catch (ParseException e) {
            System . out . println("catch代码块");
            return p;   //先封存引用地址， 再finally, 再return封存
        }finally {
            System . out . println("final1y代码块" );
            p.age=1;
        } return null;
    }


}
