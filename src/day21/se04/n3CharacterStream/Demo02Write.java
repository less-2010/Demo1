package day21.se04.n3CharacterStream;

import java.io.*;

public class Demo02Write {

    public static void main(String[] args) throws IOException {
        /**
         * 字符输出流Writer
         * java. io . Writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符
         * 信息写出到目的地。它定义了字节输出流的基本共性功能方法。
         * void write(int c);写出单个字符
         * void write( char[] cbuf);写出字符数组
         * abstract void write(char[] cbuf,int off, int len); 写出字符数组的某
         * 一部分，off是数组的开始索引，len是写的字符个数。
         * void write(String str);写出字符串。
         * void write(String str, int off,int len);写出字符串的某
         * 一部分，off是字符串的开始索引，len是写的字符个数。
         * void flush();刷新该流的缓冲。
         * void close();关闭此流， 会先刷新它。
         * FileWriter类
         * java. io. FileWriter类是写出字符到文件的便利类。构造时使用系统默认的
         * 字符编码和默认字节缓冲区。
         * 构造方法:
         * FileWriter(File file);创建- 一个新的对象，给定要写出的File
         * FileWriter(String name);创建- 一个 新的对象，给定要写出的File的字符串表示
         * 当你创建-一个流对象时，必须传入-一个文件路径，类似于FileutputStream
         */
        File f = new File("folder\\io\\FW");
        File f1 = new File(f, "f1.txt");
        f.mkdirs();
//        f1.createNewFile();
        FileWriter fw1 = new FileWriter(f1);
        File f2 = new File(f, "f2.txt");
//        f2.createNewFile();
        FileWriter fw2 = new FileWriter("folder\\io\\FW\\f2.txt");
//        1、写出字符：write(int b)方法：每次可以写一个字符数据。
        fw1.write(97);
        fw1.write("\r\n");
        fw1.write('b');
        fw1.write("\r\n");
        fw1.write(30000);


//      2、写出字符数组: write(char[] cbuf) 和write(char[] cbuf, int off, int len)
//      每次可以写出字符数组中的数据，用法类似FileOutputStream
        //字符串转换为字节数组
        char[] chars = "日照香炉生紫烟".toCharArray();
        //写出字符数组
        fw2.write(chars);//日照香炉生紫烟写出从索引2开始，2个字符。索引2是'香'，两个字也就是'程序'。
        fw2.write("\r\n");
        fw2.write(chars, 2, 5); //香炉生紫烟
        fw2.write("\r\n");
//        3、写出字符数组 write(String str)和write(String str,int off,int len),每次可以写出字符串中的数据，更为方便
//        字符串
        File f4 = new File(f, "f4. txt");
        FileWriter fw4 = new FileWriter(f4);
        String str = "我的小鱼你醒了，还认识早晨吗？昨夜你曾经说，愿夜幕永不开启。love Lovely.<123";

//        fw4.write(str);
//        fw4.write("\r\n");
        fw4.write(str, 0, str.length());
        fw4.flush();

//      写出字符中对应Ascii值

        FileReader fr2 = new FileReader(f4);
        for (int i = 0; i <str.length() ; i++) {
            int read = fr2.read();
            System.out.println("字符："+str.charAt(i)+" Ascii码为： &#"+read+";");
        }
        fr2.close();



//      4、续写和换行:操作类似于FileOutputStream。
        File f3 = new File(f, "f3. txt");
        FileWriter fw3 = new FileWriter(f3, true);
//      写出字符串
        fw3.write("飞流直下三千尺");
//      写出换行
        fw3.write("\r\n");
//      写出字符串
        fw3.write("疑是银河落九天");
//      关闭资源
        fw3.close();

//        字符流，只能操作文本文件，不能操作图片，视频等非文本文件。
//        当我们单纯读或者写文本文件时使用字符流其他情况使用字节流
        FileReader frx=new FileReader(
                "folder\\file\\background1.bmp");
        char[] cbuf=new char [1024] ;
        int len;
        while( (len=frx.read(cbuf))!=-1) {
            System. out. println(new String(cbuf , 0,len));
        }
        frx. close() ;
        fw2.close();
        fw1.close();


    }
}
