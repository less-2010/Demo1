package day16.se01.n8DateFormat;


import java.util.Calendar;
import java.util.Date;


public class Demo03Test{


    public static void main(String[] args) {
        /**
         *  电子表功能:
         *         程序启动后，每秒向控制台输出当前系统时间，格式如:
         *         10:35:33
         */
        getTime();



    }

    public static void getTime() {


        for (int i = 0; i >-1 ; i++) {
            Date date1 = new Date();
            Calendar date  = Calendar.getInstance();
//            int year = date.get(Calendar.YEAR);
//            int month = date.get(Calendar.MONTH);
//            int day = date.get(Calendar.DATE);
            long hour = date.get(Calendar.HOUR);
            long second = date.get(Calendar.SECOND);
            long minute =date.get(Calendar.MINUTE);
            try {

                Thread.sleep(3600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                System.out.println(hour + ":" + minute + ":" + second);

//                System.out.println(date1.getTime());
            }

    }
}
