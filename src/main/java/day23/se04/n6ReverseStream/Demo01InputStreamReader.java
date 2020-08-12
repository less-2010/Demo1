package day23.se04.n6ReverseStream;

import java.io.*;

public class Demo01InputStreamReader {
    public static void main(String[] args) {
        /**
         * 字符编码
         * 计算机中储存的信息都是用二进制数表示的，而我们在屏幕上
         * 看到的数字、英文、标点符号、汉字等字符是二进制数转换
         * 之后的结果。按照某种规则，将字符存储到计算机中，
         * 称为编码。反之，将存储在计算机中的二进制数按照
         * 某种规则解析显示出来，称为解码。比如说，按照A规则存储，
         * 同样按照A规则解析，那么就能显示正确的文本f符号。
         * 反之，按照A规则存储，再按照B规则解析，就会导致乱码现象。
         * 字符编码Character Encoding :
         * 就是一套自然语言的字符与二进制数之间的对应规则。
         * 字符集字符集Charset :
         * 也叫编码表。是-一个系统支持的所有字符的集合,
         * 包括各国家文字、标点符号、图形符号、数字等。
         * 计算机要准确的存储和识别各种字符集符号，
         * 需要进行字符编码，一套字符集必然至少有一一套字符编码。
         * 常见字符集有ASCII字符集、GBK字符集、Unicode字符集等。
         * 字符集:符号和符号编号是一- -对应、并且唯一的。Unicode字符集
         * 字符编码:是实现字符集的一.种形式。UTF-8、 UTF-16、 UTF-32 ;
         * 在eclipse中，使用FileReader读取项目中的文本文件。
         * 由于eclipse的设置，都是默认的UTF-8编码，所以没有任何
         * 问题。但是，当读取Windows系统中创建的文本文件时,
         * 由于Windows系统的默认是GBK编码，就会出现乱码。
         * test1();
         * 那么如何读取GBK编码的文件呢?
         * InputStreamReader类
         * 转换流java. io . InputStreamReader，是Reader的子 类,
         * 是从字节流到字符流的桥梁。它读取字节，并使用指定
         * 的字符集将其解码为字符。它的字符集可以由名称指定，
         * 也可以接受平台的默认字符集。
         * 构造方法
         * InputStreamReader( InputStream in) :
         * 创建-一个使用默认字符集的字符流。
         * InputStreamReader( InputStream in, String charsetName) :
         * 创建一个指定字符集的字符流。
         * InputStreamReader isr = new InputStreamReader(
         * new FileInputStream("in. txt"));
         * InputStreamReader isr2 = new InputStreamReader(
         * new
         * FileInputStream("in.txt")，"GBK");
         * 指定编码读取
         * test2();
         */
    }

    private static void test2() throws IOException {
// TODO Auto-generated method stub
//定义文件路径,文件为gbk编码
        String FileName = "folder\\io\\reverse\\File_GBK.txt";
//创建流对象,默认UTF8编码
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream(FileName));
//创建流对象,指定GBK编码
        InputStreamReader isr2 = new InputStreamReader(
                new FileInputStream(FileName), "GBK");
// 定义变量, 保存字符
        int read;
//使用默认编码字符流读取,乱码
        while ((read = isr.read()) != -1) {
            System.out.print((char) read); // (乱码)
            isr.close();
            System.out.println();
//使用指定编码字符流读取,正常解析
            while ((read = isr2.read()) != -1) {
                System.out.print((char) read);// (正确显示)
                isr2.close();
            }
        }
    }

    private static void test1() throws IOException {
        FileReader fileReader = new FileReader(
                "folder\\io\\reverse\\File_GBK.txt");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char) read);
        }
        fileReader.close();

    }
}
