package day16.se01.n7Canlendar;

import java.util.Calendar;

public class Demo2Get {
    public static void main(String[] args) {
        /**
         * Calendar提供了-一个方法:
         * get(int field); 获取某个日历字段的值
         * 该方法可以获取当前Calendar所表示的日期中给定的时间分量
         * 所对应的值。不同的int值表示不同的时间分量。而Calendar
         * 提供了大量的静态常量用于说明这些时间分量。
         *
         */
        Calendar c=Calendar . getInstance();
        int year=c. get(Calendar . YEAR);//获取年
        int month=c . get (Calendar.MONTH)+1;//获取月，月从0开始
        int date = c.get(Calendar.DAY_OF_MONTH);//获取日

        int h=c. get(Calendar .HOUR_OF_DAY);// 获取小时
        int m=c.get(Calendar .MINUTE);//获取分钟
        int s=c.get(Calendar . SECOND);//获取秒
        System. out . println(year+"-" +month+"- "+date);
        System. out . println(h+" :"+m+":"+s);
        int dow=c . get (Calendar . DAY_OF_WEEK)-1; //获取星期几，1表示sunday
        String[]data= {"日","一","二","三","四","五","六"};
        System. out . println("星期"+data [dow]);
        int day=c. get (Calendar .DAY_OF_YEAR);
        System. out . println("今天是今年的第"+day+"天");
        int d=c. getActualMaximum(Calendar.DAY_OF_YEAR);
        System. out . println("今年一共有: "+d+"天");



    }

}
