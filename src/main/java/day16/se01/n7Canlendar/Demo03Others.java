package day16.se01.n7Canlendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo03Others {
    public static void main(String[] args) {
        /**
         *
         * void set(int field,int x);设置日历字段的值
         * 设置当前Calendar指定时间分量所对应的值
         *
          */
        Calendar c=Calendar . getInstance();
        c.set(Calendar.YEAR, 2008);//设置年
        c.set(Calendar.MONTH, Calendar.AUGUST);//设置月
        c.set(Calendar.DATE, 8);//设置日
        System.out.println(c.getTime());//输出
        /**
         * void add(int field, int amount)
         * 对指定时间分量累加给定值，若amount是负数则是减去
         */
        c.add(Calendar.YEAR, 12);//加12年
        c.add(Calendar.MONTH, 2);//加2个月
        c.add(Calendar.DAY_OF_YEAR,3);//加3天
        System.out.println(c.getTime());//输出

        GregorianCalendar g=new GregorianCalendar();
        System. out . println(g. isLeapYear(2020));
//        System. out . println(c . isLeapYear(2020));//报错:没有这个方法
        System. out . println(c. getClass()==g. getClass());


    }
}
