package day21.se04.n2ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo03FileInputStream {
    public static void main(String[] args) throws IOException {

        /**
         * OutputStream是所有字节输入流的超类，是个抽象类，他有很多子类，其中常用的子类是 FileInputStream
         *
         * InputStream的常用方法(被FileInputStream继承)有:
         *
         * void close();关闭此输入流并释放与此流相关联的任何系统资源。
         * abstract int read();从输入 流读取数据的下一一个字节。
         * int read(byte[]b); 从输入流中读取一些字 节数，并将它们存储到字节数组b中
         * FileInputStream类
         * java. io. FileInputStream类时文件输入流，从文件中读取字节，是
         * InputStream的子类。
         * 构造方法:
         * FileInputStream(File file):通过打开与实际文件的连接来创建一个对象,
         * 该文件由file来命名。
         * FileInputStream(String name): 通过打开与实际文件的连接来创建一一个对象,
         * 该文件由name来命名。
         * 当你创建一一个 流对象时，必须传入一个文件路径。该路径下如果没有该文件，
         * 会抛出FileNotFoundException
         */

        File f1 = new File("folder\\io\\FIS\\a.txt");
        File f2 = new File("folder\\io\\FIS\\b.txt");
//        File f1 = new File(f, "b.txt");
//        if (f1.exists()) {
//            System.out.println("f3路径已存在");
//        } else {
//            f1.mkdir();
//            System.out.println("f3路径创建成功");
//        }
        FileInputStream fis = new FileInputStream(f1);

        int read = fis.read();
        System.out.println((char) read);

        FileInputStream fis2 = null;
        if (!f2.exists()) {
            f2.mkdirs();
            fis2 = new FileInputStream(f2);
        }
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
//        读取到文件末尾会返回-1
        read = fis.read();
        System.out.println(read);

        循环改进读取方式:
        fis = new FileInputStream(f1);
        int b;//保存读取数据的变量
        while ((b = fis.read()) != -1) {

            System.out.println((char) b);
        }
        fis2.close();  //先创建的后关闭
        fis.close();


    }
}
