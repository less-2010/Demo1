package day21.se04.n2ByteStream;

import java.io.*;

public class Demo01IO {
    public static void main(String[] args)  {
        /**
         * 数据的传输，可以看做是一种数据的流动，按照流动的方向，以JVM为基准，
         * 分为输入input和输出output，即流向JVM是输入流，流出JVM是输出流。
         * Java中的I0操作主要是指java.io包下的内容，进行输入输出操作。输入也叫
         * 读取数据，输出也叫做写出数据。
         *
         * 根据数据的流向分为:输入流和输出流
         * 输入流:把数据从其他设备上读取到JVM中的流。
         * 输出流:把数据从JVM中写出到其他设备上的流。
         * 根据数据的类型分为:字节流和字符流
         *
         * 字节流:以字节为单位，读写数据的流。
         * 字符流:以字符为单位，读写数据的流。
         *
         * 顶级父类们如下:
         * 字节流:字节输入: InputStream  字节输出: OutputStreaml
         * 字符流:字符输入: Reader       字符输出: Writer
         *
         */
          /* 字节流:一切文件数据(文本、图片、视频等)在存储时，都是以二进制
          的形式保存的，都是一个一个的字节，传输时-样如此。所以，字节流
          可以传输任意文件数据。无论什么流，底层最后都落实到字节流。

          FileOutStrean和FileInputString 类存在 字节和数组读取方法

          */
//        1、字节输出流: OutputStream （超类抽象类）
//        是所有字节输出流的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。
//        1-1、常用子类: FileOutputStream
        File file = new File("folder\\io\\FIS\\a.txt");

        byte a1[] = "我的小鱼你醒了，还认识早晨吗？昨夜你曾经说，愿夜幕永不开启。你的香腮边轻轻滑落的，是你的泪，还是我的泪？初吻吻别的那个季节，不是已经哭过了吗？我的指尖还记忆着，你慌乱的心跳。温柔的体香里，那一缕长发飘飘。".getBytes();
        OutputStream os1 = null;
        FileInputStream in2 = null;
        try {
            os1 = new FileOutputStream(file);
            in2 = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            os1.write(a1);
            os1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
//输出文件1.txt 字节输入
        byte by[] = new byte[1024];
        try {
            int a3 =in2.read(by);
            in2.close();
            System.out.println(new String(by,0,a3));//public String(@NotNull byte[] bytes,int offset, int length)构造一个新的String使用平台的默认字符集的字节指定的子数组解码。 新的长度String是字符集的函数，并且因此可能不等于子阵列的长度。此构造函数时给出的字节是不是在默认字符集有效的行为是不确定的
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
