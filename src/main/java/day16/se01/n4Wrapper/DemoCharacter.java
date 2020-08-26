package day16.se01.n4Wrapper;

public class DemoCharacter {
    public static void main(String[] args) {
//        Character :用于将char 类型值转换成包装对象
//        1、char转Character
        Character c1=new Character('A');
        Character c2=Character . valueOf( 'A');
//        2、Character转 char
        Character ch1=new Character('A');
        char ch2=ch1. toString(). charAt(0);
        char ch3=Character . toString(ch1) . charAt(0) ;
//        Character除了提供包装类和基本数据类型的转换外，还提供了一些实用
//        的方法:
//        3、判断一个字符是否为字母或阿拉伯数字
        System . out. println(Character . isLetter('A'));
        System. out. println(Character. isDigit('9'));
//        4、判断是否为空格
        System. out. println(Character. isWhitespace(' ' ));
//        5、判断是否为大写或小写
        System. out . println(Character. isUpperCase('A'));
        System. out. println(Character. isLowerCase('a'));
//        6、返回只含该字符的字符串
        System.out.println(Character.toString('A'));
//        7、转为大写或小写
        System. out. println(Character. toUpperCase('b'));
        System. out. println(Character . toLowerCase('D'));







    }
}
