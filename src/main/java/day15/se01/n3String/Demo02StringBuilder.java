package day15.se01.n3String;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        /**
         * StringBuilder是带缓冲区的可变字符串。
         * 一个String对象的长度是固定的，不能改变它的内容，也不能附加新的字符至
         * String对象中。可以使用连接"+"运算符来连接字符串以达到附加新字符串到
         * 原字符串的目的，但使用连接运算符后会产生新的字符串的实例，即需要另外
         * 分配空间。如果既想节省开销，又能改变字符串的内容，则可以使用
         * StringBuilder类
         * StringBuilder类的构造方法:
         * StringBuilder()
         * StringBuilder(String s)
         * StringBuilder类的常用方法:
         * StringBuilder append(String s)在可变字符串末尾追加
         * StringBuilder insert(int offset,String s)在可变字符串指定位置插入
         * int length() 返回可变字符串的长度
         * String toString()将可变字符串转化为字符串对象
         */
        String str1 = "Hello";
        String str2 = str1;
        System.out.println("1==2:"+(str1==str2));
        str1 = str1+"Word";
        System.out.println("1==2-2"+(str1==str2));

        StringBuilder s=new StringBuilder();//空 参构造
        System. out . println("s:"+s);
        StringBuilder s2 = new StringBuilder("abc");//带参构造
        System.out.println("s："+s2);

        System.out.println(s2.append("defg"));
        System.out.println(s2);
        System.out.println(s2.insert(3,"xyz"));
        String str = s2.toString();
        System.out.println(str);
        System.out.println(s2.length());
        System.out.println(s2.append("1").append("2").append("3"));

        test();
        test2();

    }

    private static void test() {
        String str="";
        long s= System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            str = str+"a";

        }
        long e =System.currentTimeMillis();
        System.out.println("StringBuilder耗时："+(e-s));
    }
    private static void test2() {
        StringBuilder str = new StringBuilder();
        long s= System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            str.append("a");

        }
        long e =System.currentTimeMillis();
        System.out.println("StringBuilder耗时："+(e-s));
    }

}
