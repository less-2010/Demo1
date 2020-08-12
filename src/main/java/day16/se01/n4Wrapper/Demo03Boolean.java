package day16.se01.n4Wrapper;

public class Demo03Boolean {
    public static void main(String[] args) {
//        Boolean:用于将-一个基本数据类型boolean的值包装为对象
//        1、将boolean转Boolean
        Boolean b1=new Boolean(true);//方法
        Boolean b2=Boolean. valueOf(true);//方法二
//        2、将Boolean转boolean
        Boolean b3=new Boolean(true );
        boolean b4=b3. booleanValue();
//        3、将String转Boolean
        String s="true";
        Boolean bo1=new Boolean(s);
        Boolean bo2=Boolean. valueOf(s );
//        4、将Boolean转String
        Boolean boo=new Boolean(true) ;
        String s1=boo. toString();
        String s2=Boolean. toString(boo);
        String s3=String . valueOf(boo);
//        5、boolean转String
        boolean b=true ;
        String st1=String. valueOf(b);
//        6、String转boolean
        String str="true";
        boolean bool1 = Boolean.parseBoolean(str);
        Boolean bool2 = new Boolean(str);
        boolean bool3 = bool2.booleanValue();


    }

}
