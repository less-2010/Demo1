package day15.se01.n3String;

public class Demo01Methods {
    public static void main(String[] args) {
//        String类常用方法:
//        1、int length( )求字符串值的字符个数
        String s1="HelloJava";
        System. out . println(s1.length());//9
//        2、boolean equals (0bject o) 比较两个字符串是否相同
        String s2="HelloJSP";
        System.out.println(s1.equals(s2));//false
//        3、String replace(char old ,char new)字符串替换
        System.out.println(s1.replace('l','p'));//HeppoJava
//        String replace(CharSequence target, CharSequence replacement) 字符串替换
        System.out.println(s1.replace("Java","Python"));//HelloPython
//        4、 char charAt(int index)返回指定字符串指定位置的字符
        System. out . println(s1. charAt(6));//a
//        5、int compareTo(String s)按字典顺序比较字符串大小

        System . out. println("a" . compareTo("ac"));//-1
//        6、boolean endsWith(String s) 比较字符串是否以指定的参数结尾
        System. out . println(s2. endsWith("JSP"));//false
//        7、boolean startsWith(String s)比较字符串是否以指定的参数开头
        System. out . println(s2. startsWith( "He11o"));//true
//        8、Static String vlaueOf(int i)将基本数据类型转换为字符串
        System. out . println(String.valueOf(10)+5);//105
//        9、boolean IsEmpty()判断一个字符串值的长度是不是为0
        System.out.println("".isEmpty());// true
//       10、int indexOf(ch ch)返回指定字符序列在字符串中的索引
		s1="HelloWorld";
		System.out.println(s1.indexOf('W'));//?
		System.out.println(s1.indexOf("l"));//?第一次出现的位置索引
		System.out.println(s1.indexOf("lo"));//取指定字符序列的第1个字符
//		11、int lastIndexOf(ch ch)返回指定字符序列在字符串中最后出现的索引
		System.out.println(s1.lastIndexOf("l"));//？
//		12、subString(int begin)从指定索引位置截取字符串
		System.out.println(s1.substring(s1.indexOf("W")));//？
		System.out.println(s1.substring(s1.indexOf("lo"), s1.indexOf("ld")));//?
//
    }
}

