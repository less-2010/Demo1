package day17.se02.Demo01Exception;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03Return {
    public static void main(String[] args) {

        Test1();

    }

    private static Integer Test1() {
        SimpleDateFormat sdf=new SimpleDateFormat( "yyyy年MM月dd日");
        String string="19$$99年01月12日";
        Integer i = new Integer(0);
        String rStr="begin" ;
        try {
            Date date =sdf . parse(string);
        } catch (ParseException e) {
            System . out . println(" catch代码块" );
            return i;//封存， 再finally, 再return封 存
        }finally {
            System . out . println(" final1y代码块" );
            rStr="finally";
            return i;

        }
    }
}
