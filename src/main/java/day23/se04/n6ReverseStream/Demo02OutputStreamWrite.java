package day23.se04.n6ReverseStream;

import java.io.*;

public class Demo02OutputStreamWrite {
    public static void main(String[] args) throws IOException {
        /*OutputStreamWriter类
        转换流java. io. OutputStreamWriter，是Writer的子类，
        是从字符流到字节流的桥梁。使用指定的字符集将字符
        编码为字节。它的字符集可以由名称指定，也可以接受平台的
        默认字符集。
        构造方法
        OutputStreamWriter(OutputStream in) :
        创建一个使用默认字符集的字符流。
        OutputStreamWriter(OutputStream in, String charsetName):
        创建一个指定字符集的字符流。
        构造举例，代码如下:
        OutputStreamWriter osr= new OutputStreamWriter(
                new File0utputStream( "out . txt"));
        OutputStreamWriter osr2 = new OutputStreamWriter(
                new FileOutputStream("out.txt") ，"GBK");
        指定编码写出

        练习:将GBK编码的文本文件，转换为UTF-8编码的文本文件。
        */
//        test1();
        test2();
    }

    private static void test2() throws IOException {
        //创建路径
        String FileName = "folder\\io\\reverse\\outUTF8.txt";
        //创建字符输出流对象
        OutputStreamWriter ows = new OutputStreamWriter(new FileOutputStream(FileName));
        //写出数据(默认为UTF-8)
        ows.write("我的小鱼你醒了，还认识早晨吗？昨夜你曾经说，愿夜幕永不开启。你的香腮边轻轻滑落的，是你的泪，还是我的泪？初吻吻别的那个季节，不是已经哭过了吗？我的指尖还记忆着，你慌乱的心跳。温柔的体香里，那一缕长发飘飘。");
        ows.close();

        //转换为GBK
        //定义文件路径
        String FileName2 = "folder\\io\\reverse\\outGBK.txt";
        //创建读入字符
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream(FileName), "GBK");
        //创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(
                new FileOutputStream(FileName2), "GBK");
        //写出数据
        osw2.write(isr.read());
        osw2.flush();
        //保存为4个字节
        osw2.close();

    }

    private static void test1() throws IOException {
         //定义文件路径
        String FileName = "folder\\io\\reverse\\out.txt";
          //创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(FileName));
        //写出数据
        osw.write("你好");
        //保存为6个字节
        osw.close();
        //定义文件路径
        String FileName2 = "folder\\io\\reverse\\out2.txt";
        //创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(
                new FileOutputStream(FileName2), "GBK");
        //写出数据
        osw2.write("你好");
        //保存为4个字节
        osw2.close();

    }

}
