package day15.se01.n6Date;
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {


    /**
     * java.util.Date
     * Date的没一个实例用于表示一个确切的时间点，内部维护了一个long值，
     * 该值保存的是子=自1970年1余额1日00：00：00到当前Date所表示时间之间经过的毫秒数。
     * 由于Date自身设计问题(主要问题是时区问题)，所以Date大部分
     * 的操作时间的方法都被声明为过时方法，实际开发中已经不再建议使用了。
     * Date类的构造方法
     * Date()无参 构造
     * Date(long time)有 长整型参数的构造方法
     * 其他构造方法已经废弃不用
     * Date类常用方法
     * long getTime(); 返回自1970年1月1日00:00:00以来此对象表示的
     * setTime(long time);设置该对象的毫秒数
     * String同String();将Date对象转换为字符串
     */
        Date date=new Date();
        System. out. println(date);
//        date . getYear();//中间画有横线，表示该方法已过时，不推荐使用它的大多数方法都过时了。
        long time=date.getTime();//获取亳秒数，内部维护的1ong值
        System. out . println(time);
        time += 1000*60*60*24;//将亳秒 数往后推移1天
        date. setTime(time);//将推后-天的亳秒数设置回Date对象
        System. out . println(date) ;
        Date date2=new Date(time);//第2种构造方法
        System. out . println(date2);//毫秒数相同，所....

    }

}
