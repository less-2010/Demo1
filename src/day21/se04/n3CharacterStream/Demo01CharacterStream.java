package day21.se04.n3CharacterStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01CharacterStream {
    public static void main(String[] args) throws IOException {
        /**
         * 当使用字节流读取文本时，可能会有一个问题。就是遇到中文字符时，可能不会
         * 显示完整的字符，那是因为一个中文字符可能占用多个字节存储。所以，Java
         * 提供一些字符流类，以字符为单位读写数据，专门用于处理文本文件。
         * 字符输入流Reader
         * java . io. Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符
         * 信息到JVM中。它定义了字符输入流的基本共性功能方法。
         * void close();关闭此流并释放与此流相关联的任何系统资源。
         * int read();从输入流读取-个字符。，
         * int read(char[]cbuf);从输入流读取- -些字符，并将它们存储到字符数组中。
         * FileReader类
         * java. io. FileReader类是读取字符文件的便利类。构造时使用系统默认的字符
         * 编码和默认字节缓冲区。
         * 1、字符编码:字节与字符的对应规则。Windows中文系统的中文编码默认是GBK
         * 编码。在Eclipse中，我们通常会设置默认utf -8编码。
         * 2、字节缓冲区:一个字节数组，用来临时存放字节数据。
         * 构造方法:
         * FileReader(File file);创建-一个 新对象，给定要读取的File对象。
         * FileReader(String name);创建-一个 新对象，给定要读取的字符串表示。
         * 当创建一一个文件字符读取流对象时，必须传入一个文件路径,类似于FileInputStream
         */
        File f = new File("folder\\io\\FR");
        File f1 = new File(f, "f1.txt");
        f.mkdirs();
        f1.createNewFile();
        FileReader fr1 = new FileReader(f1);
        File f2 = new File(f, "f2.txt");
        f2.createNewFile();
        FileReader fr2 = new FileReader("folder\\io\\FR\\f2.txt");
//       读取字符数据
//       1、读取字符：read()方法，每次可以读取一个“字符”的数据，提升为int型，读取到文件末尾，返回-1，循环播放
        int read;
        while ((read = fr1.read()) != -1) {
            System.out.print((char) read);
        }
//        2、试用字符数组读取，read(char[] cbuf),每次读取b的长度个字符到数组中，返回读取到的有效字符个数，读取到末尾时，返回-1
        fr1 = new FileReader(f1);
        int len;
        char[] cbuf = new char[2];
        while((len=fr1.read(cbuf))!=-1){
            System.out.println(new String(cbuf));
        }
        fr2.close();
        fr1.close();


    }
}
