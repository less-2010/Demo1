package day23.se04.n8PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Demo02PrintStream {
    public static void main(String[] args) throws IOException {


/*        * java. io. PrintWriter是java. io.Writer的直接子类，
        向文本输出流打印对象的格式化表示形式。此类实现了在
                * PrintStream 中的所有print 方法。它不包含用于写入原始字节的
        方法，对于这些字节，程序应该使用未编码的字节流进行写入。
        *构造方法
                * PrintWriter(File file)
        使用指定文件创建不具有自动行刷新的新PrintWriter。
        PrintWriter(String fileName )
        创建具有指定文件名称且不带自动行刷新的新PrintWriter.
                PrintWriter(OutputStream out)
        根据现有的OutputStream创建不带自动行刷新的新PrintWriter。
        PrintWriter(0utputStream out, boolean autoFlush)
        通过现有的outputStream创建新的PrintWriter.
                PrintWriter (Writer out)
        创建不带自动行刷新的新Printwriter。
        PrintWriter(Writer out, boolean autoFlush)
        创建新PrintWriter。
        普通方法:
        void print(boolean b)
        打印 boolean值。
[若: print1n(boolean b)则表示打印后换行，后同。]
            void print(char c)
            打印字符。
            void print(char[] s)
            打印字符数组。
            void print(double d)
            打印double精度浮点数。
            void print(float f)
            打印一个浮点数。
            void print(int i)
            打印整数。
            void print(long 1)
            打印1ong整数。
            void print(Object obj)
            打印对象。
            bid print (String s)
            打印字符串。
            Writer的写出功能方法也有，是针对字符的。
            void write ( int c)
            写入单个字符。
            void write ( char[] buf)
            写入字符 数组。
            void write ( char[] buf, int off, int len)
            写入字符 数组的某一一 部分
            void write (String s)
            写入字符串。
            void write (String s,int off, int len)
            写入字符串的某 - -部分。
*/
            PrintWriter pw = new PrintWriter(new FileWriter(
                    "folder\\io\\print\\pw.txt"), true);
            pw.print(true);
            pw.print('中');
            char[] cbuf = {'美','俄'};
            pw. print(cbuf);
            pw. print(9.9);
            pw. print(9.8f);
            Scanner s =new Scanner(System. in);
            System. out. println("继续1: ");
            s.next();
            pw. flush();
            pw. print(100);
            pw. print(200L);
            pw. print(new Random());
            pw. print("日本德国意大利");
            System. out. println("继续2: ");
            s. next();
            pw. println(9.9);
            pw. println(9.8f);
            System. out. println( "继续3: ");
            s.next( );
            pw. println(100);
            pw. println(200L);

            pw.close();

    }
}



