package day21.se04.n2ByteStream;

import java.io.*;
import java.util.Scanner;

public class Demo02FileOutputDtream {
    public static void main(String[] args) throws IOException {
        /*
        OutputStream是所有字节输出流的超类，是个抽象类，他有很多子类，其中常用的子类是 FileOutputStream

        OutputStream的常用方法(被FileOutputStream继承)有:
        void close();关闭此输出流并释放与此流相关联的任何系统资源。
        void flush();刷新此输出流，并强制任何缓冲的输出字节被写出。
        void write(byte[] b); 将b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len);从指定 的字节数组写入len字节，
        从偏移量off开始输出到此输出流。
        abstract void write(int b);将指定字节输出到流。( 被FileOutputStream
        实现了该方法)
        File0utputStream的常用方法:
        构造方法:*/
//
//        File0utputStream(String name , boolean append) ;创建指向name代表file的
//                拥有追加写功能的字节输出流对象
//        当创建一.个File0utputStream对象时，需要传入一- 个路径，若该路径
//        不存在所代表的文件，则会自动创建它;若存在则会默认先清空它。
//        1、new 对象
        FileOutputStream fos = new FileOutputStream("folder\\file\\fos.txt");
        File file = new File("folder\\file\\file_fos.txt");
        FileOutputStream fos2 = new FileOutputStream(file);
//        2、写出单字节
        fos.write(97);//写出一个字节
        fos2.write(98);

//        3、写出字符数组
        byte[] b = "昨夜你曾经说".getBytes();//String的方法，将字符串转字节数组
        fos.write(b);
        byte[] b2 = "长风破浪会有时,直挂云帆济沧海!".getBytes();
        fos2.write(b2, 0, b2.length);//默认为覆盖写
        fos2.close();
//      4、追加写
//      多个流同时操作一个路径会覆盖
        FileOutputStream fos3 = new FileOutputStream("folder\\file\\fos.txt", true);
        fos3.write("昨夜你曾经说，愿夜幕永不开启。".getBytes());
        fos3.flush();

        fos3.close();
        FileOutputStream fos4 = new FileOutputStream(
                new File("folder\\file\\file_fos.txt"), true);//追加写
        fos4.write("李白".getBytes(), 0, 6);
        fos4.close();


//      5、写出换行
//        回车符：\r和换行符：\n
//        回车符：回到一行的开头： return
//        换行符：开辟新的一行：rewline
//        windows:每行的结尾是: \r\n
//        Unix系统里:每行结尾只有: \n
//        Mac系统里:每行结尾是: \r。 从Mac 0S X开始与Linux统一一。
        FileOutputStream fos5 = new FileOutputStream(
                "folder\\file\\登鹳雀楼.txt");
        fos5.write("白日依山尽，".getBytes());
        fos5.write("\r\n".getBytes());//使用Mac的同学请使用对应换行码
        fos5.write("黄河入海流。".getBytes());
        fos5.write("\r\n".getBytes());
        fos5.write("欲穷千里目，".getBytes());
        fos5.write("\r\n".getBytes());
        fos5.write("更上一层楼。".getBytes());
        fos5.write("\r\n".getBytes());
        System.out.println("输入任意字符继续！");
        new Scanner(System.in).next();
        fos5.flush();
        fos5.write("王之涣".getBytes());
        fos5.write("\r\n".getBytes());
        fos5.flush();
        fos5.write('关');//写出在默认缓冲区中
        System.out.println("输入任意字符继续！");
//        写出数据，通过close
        new Scanner(System.in).next();
       //关闭流之前会刷新
        System.out.println("输入任意字符继续！");
        new Scanner(System.in).next();
        fos5.write('闭');
        fos5.flush();


    }
}
