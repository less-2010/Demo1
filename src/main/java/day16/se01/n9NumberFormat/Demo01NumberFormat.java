package day16.se01.n9NumberFormat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Demo01NumberFormat {
    public static void main(String[] args) {
        /**
         * NumberFormat是- 一个数字格式化抽象类
         * 该类提供了格式化和解析数值的方法
         * 常用方法:
         * String format (double d); 将数字格式化为字符串
         * Number parse(String s);将字符串解析为数字
         * void setMaximumF ractionDigits( int newValue);设置最大小数位
         * void setMinimumF ractionDigits( int newValue);设置最大小数位
         * 通常情况下会使用其子类DecimalFormat
         * DecimalFormat
         * 构造:
         * DecimalFormat()
         * DecimalFormat(String pattern) 按照指定模式构建对象
         */

         NumberFormat nf=NumberFormat . getInstance();
          System. out . println(nf . format (12345678));
        try {
            Number  n = nf.parse("123");
            int a = n.intValue();
            System.out.println(a+111);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DecimalFormat df = new DecimalFormat("0000,0000,0000");//0强制保留多少位  少的补零
        System.out.println(df.format(13156588888l));
        DecimalFormat df1 = new DecimalFormat("#####,#####,0000");
        System.out.println(df1.format(12345678901331d));
//        DecimalFormat df2 = new DecimalFormat("0%");
//        System. out . println( df2. format(12345678));
//        df . setMaximumFractionDigits(2);
//        System. out . println(df . format (1234.5678));
//        df2. setMinimumFractionDigits(2);
//        System. out . println(df2. format(12345678));

    }
}
