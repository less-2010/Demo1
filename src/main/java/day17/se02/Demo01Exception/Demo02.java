package day17.se02.Demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {



    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String string = "1999年01月18日";
        try {//可能出现异常的代码块
            Date date = sdf.parse(string);//报错需要异常处理

        } catch (ParseException e) {//需要捕获的异常类型
//       捕获异常后的方案
//       日期格式错误
            e.printStackTrace();
        }finally {
//            不论是否捕获到异常都需要执行的代码块
        }
    }
}
