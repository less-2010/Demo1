package day23.se04.n8PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         *
         * java. io. PrintStream是java. io .outputstream的子类的子类，
         * 为其他输出流添加了功能，使它们能够方便地打印各种数据值
         * 表示形式。
         * 是单纯的输出流，没有输入流。
         * 构造方法举例: .
         * PrintStream(File file)
         * PrintStream(String fileName)
         * 普通方法:
         * void print(boolean b)
         * 打印boolean值。
         * [若: println(boolean b)则表示打印后换行，后同。]
         * void print(char c)
         * 打印字符。
         * void print(char[] s)
         * 打印字符数组。
         * void print(double d)
         * 打印双精度浮点数。
         * void print(float f)
         *     void print(float f)
         *         打印浮点数。
         *         void print(int i)
         *         打印整数。
         *         void print(long 1)
         *         打印1ong整数。
         *         void print(Object obj)
         *         打印对象。
         *         void print(String s)
         *         打印字符串。
         *         普通的写出功能同样具备!
         *         void write(int b)
         *         将指定的字节写入此流。
         *         void write(byte[] buf, int off, int len)
         *         将len字节从指定的初始偏移量为off的byte数组写入此流。
         */

        PrintStream ps = new PrintStream(
                "folder\\io\\print\\ps.txt");
        ps.print(true);
        ps.print('中');
        char[] cbuf = {'美', '俄'};
        ps.print(cbuf);
        ps.print(9.9);
        ps.print(9.8f);
        ps.print(100);
        ps.print(200L);
        ps.print(new Random());
        ps.print("日本德国意大利");
        ps.println(9.9);
        ps.println(9.8f);
        ps.println(100);
        ps.println(200L);
        ps.println(cbuf);
        ps.println("日本德国意大利");
//      System.out就是PrintStream类型的，只不过它的流向
//      是系统规定的，打印在控制台上。但是，我们也可改变它的流向。
//      调用系统的打印流,控制台直接输出97
        System.out.println(97);
//创建打印流,指定文件的名称
        PrintStream ps2 =
                new PrintStream("folder\\io\\print\\ps2.txt");
//设置系统的打印流流向,输出到ps2.txt
        System.setOut(ps2);
//调用系统的打印流，ps2. txt中输出97
        System.out.println(97);


    }
}
