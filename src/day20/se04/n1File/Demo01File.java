package day20.se04.n1File;

import java.io.File;
import java.io.IOException;

/**
 * @author hyb
 */

public class Demo01File {
    public static void main(String[] args) {
        /**
         * java.io.File类
         * 代表硬盘上的一个文件或者目录
         * 每个File类的对象表示一个磁盘文件或者目录，其对象属性中包含了
         * 文件相关的信息，如名称、长度、所含文件个数等，
         * 调用它的方法则可以完成对文件或者目录的常用管理操作，例如：创建/删除等操作
         * FIle类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法
         */

//        1、 分隔符：
//        1-1、File.pathSepatatorChar 与系统有关的路径分隔符
//        windows:分号; linux ：冒号 :
//        （该静态常量字段会根据系统自动匹配初始化的取值）
        char pss = File.pathSeparatorChar;
        System.out.println(pss);
//        1-2、File. pathSepatator与 系统有关的路径分隔符,为了方便，
//        它被表示为一个字符串。windows: 分号; linux: 冒号:
//        (该静态常量字段会根据系统自动匹配初始化的取值)
        String ps = File.pathSeparator;
        System.out.println(ps);
//        1-3、File. sepatatorChar与 系统有关的默认名称分隔符
//        windows:反斜杠\; linux: 正斜杠/:
//        (该静态常量字段会根据系统自动匹配初始化的取值)
        char sc = File.separatorChar;
        System.out.println(sc);
//        1-4、File.sepatator 与 系统有关的默认名称分隔符,为了方便，
//        它被表示为一个字符串。windows: 反斜杠\; linux: 正斜杠/:
//        (该静态常量字段会根据系统自动匹配初始化的取值)
        String s = File.separator;
        System.out.println(s);

//        1-5、在开发中，我们推荐使用以上的字段进行相应的分隔。如:
//        Windows路径: C: \develop\a\a.txt
//        Linux路径: C:/deve1op/a/a. txt
//        Java代码路径: "C:"+File.separator+"deve1op"+File . separator+"a"+File . separator+"a. txt"
//        在学习期间，我使用windows系统的分隔符，如:
//        Java代码路径: D: \Java202\\a\\a. txt
//        此路径应用于Windows系统，由于\为转义字符，所以要\\

//        2、构造方法:
//        2-1、File(String pathname) ;根据字符串创建路径对象
        String str = "E:\\Java202";
        File f1 = new File(str);
        System.out.println(f1);
//        创建File对象，只是把字符串路径封装到File对象中，
//        不考虑路径的存在与否，可以存在，也可以不存在。

        if (f1.exists()) {
            //A判断该路径是否存在
            System.out.println("f1路径已存在");
        } else {
            f1.mkdir();//创建该路径
            System.out.println("f1路径创建成功");
        }
//        2-2、File(String parent , String child) ;根据父字符串和子字符串的拼接效果创建路径对象
        File f2 = new File(str, "a");
        if (f2.exists()) {
            System.out.println("f2路径已存在");
        } else {
            f2.mkdir();
            System.out.println("f2路径创建成功");
        }
//        2-3、File(File parent ,String child) ;根据父路径对象和子字符串的连接效果创建路径对象
        File f3 = new File(f1, "b");
        if (f3.exists()) {
            System.out.println("f3路径已存在");
        } else {
            f3.mkdir();
            System.out.println("f3路径创建成功");
        }
//        3、关于路径
//        3-1、路径不区分大小写
        File f4 = new File(f1, "B");
        if (f4.exists()) {
            System.out.println("f4路径已存在");
        } else {
            f4.mkdir();
            System.out.println("f4路径创建成功");
        }
//        3-2、 路径可以是文件夹，也可以是文件
        File f5 = new File(f1, "也可以是文件.txt");
        if (f5.exists()) {
            System.out.println("f5路径已存在");
        } else {
            try {
                f5.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("f5路径创建成功");
        }
//        4、绝对路径和相对路径:
//        4-1、绝对路径:从盘符开始写起，如前面所举例的均为绝对路径。
//        4-2、相对路径:相对于当前某个位置而言的路径。不同类型的
//        情境有不同的相对路径。对于File而言指的是项目名之下，
//        作为项目的子路径而存在。
        File f6 = new File("folder");
        if (f6.exists()) {
            System.out.println("f6路径已存在");
        } else {
            f6.mkdir();
            System.out.println("f6路径创建成功");
        }


    }
}
