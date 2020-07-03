package day15.se01.n3String;

/**
 * String类代表字符串，提供了开发中常用的字符串处理的方法，如:求字符串.
 * 的长度、截取字符串、替换字符串等方法。
 * 字符串是常量，它的值创建之后就不可以再修改了。
 * String类常用构造方法:
 * String()无参构造方法
 * String(String str)有- -个字符串参数的构造方法
 * String(char[]ch)有-个char类型数组参数的构造方法
 * String(byte[]b)有- -个byte数组参数的构造方法
 *
 */

public class Demo00String {
    public static void main(String[] args) {

//      声明和创建字符串对象的方式:
        String s1="He11o Java";  //不使用new 创建的对象都放在常量池  ，如果已经有这个对象就把地址传给刚创建的
        String s2=new String();
        String s3="";
        char[]ch=new char[] {'h','e','1','l','o'};
        String s4=new String(ch);
        byte[]b=new byte[] {65, 97};
        String s5=new String(b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2.equals(s3));// true 都是空串
        System.out.println(s2==s3);//false;
        String s6 ="";//常量池，已有相同的字符串，只返回地址
        System.out.println(s3==s6);//true
        System.out.println(s6==s2);//false

        System.out.println(s4);
        System.out.println(s5);

    }
}
