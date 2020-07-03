package day16.se01.n8DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) {
        /**
         * DateFormat是--个抽象的时间格式化类
         * DateFormat以与语言无关的方式格式化(Date变字符串)并解析(字符串变Date)
         * 日期或时间。DateFormat可帮助进行格式化并解析任何语言环境的日期。
         * 对于月、星期，甚至日历格式(阴历和阳历)，其代码可完全与语言环境的约定，
         * 无关。在格式化和解析日期时间的过程中，其子类SimpleDateFormat更为常用。
         * SimpleDateFormat类
         * 构造方法
         * SimpleDateFormat()
         * SimpleDateFormat(String pattern) 按照指定的模式创建SimpleDateFormat对象
         */

//        1、格式化: Date变String
        Date date=new Date();
        System. out . println(date);
        SimpleDateFormat sdf=new SimpleDateFormat(
                "yyyy- MM-dd HH:mm:ss E a"
        );
        String line=sdf . format(date);
        System. out. println(line);
//        2、解析: String变Date
        String str="2008-08-08 20:08:08";
        SimpleDateFormat sdf2=new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss"
        );
        Date date2=new Date( );
        try {
            try {
                date2 = sdf2.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(date2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
