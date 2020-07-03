package day16.se01.n7Canlendar;

import java.util.Calendar;
import java.util.Date;

public class Demo1Calenar {
    public static void main(String[] args) {
        /**
         *
         *java。util。Calendar
         * 日历类，是一个抽象类，定义了操作日期的相关方法。
         * 常用实现类: java. util. GregorianCalendar,即:阳历
         * Calendar常用方法:
         * static Calendar getInstance()
         * 该方法可以获取一一个当前系统所在地区适用的实现类对象，大部分
         * 地区返回的都是阳历。
         * Date getTime();
         *void setTime(Date date); 使用指定的Date设置该日历对象
         * get(int field);获取某个日历字段的值
         * void set(int field,int x); 设置日历字段的值
         * 常用的日历字段:
         * AM_ PM上午或者 下午
         * YEAR年MONTH月DATA日
         * HOUR 12小时制HOUR_ OF_ _DAY 24小时制
         * MINUTE分钟SECOND秒MILLISECOND亳秒
         * /
         *
         */
        Calendar calendar= Calendar. getInstance();
//         * 获取的对象默认表示当前系统时间
        System.out.println(calendar);
        Date date = calendar.getTime();//获取calendar对象中的Date实例
        System.out.println(date);
        long time = date.getTime();//获取毫秒数
        time +=1000*60*60*24;
        date.setTime(time);
        calendar.setTime(date);
        System.out.println(calendar);

    }
}
