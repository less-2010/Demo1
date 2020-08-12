package day22.se04.n5BufferStream;

import java.io.*;

public class Demo01BufferedByte {
    public static void main(String[] args) throws IOException {
        /**
         * 概述
         * 缓冲流,也叫高效流，是对4个基本的FileXxx流的增强，
         * 所以也是4个流，按照数据类型分类:
         * 字节缓冲流: BufferedInputstream ，BufferedoutputStream
         * 字符缓冲流: BufferedReader ，BufferedWriter
         * 缓冲流的基本原理，是在创建流对象时，会创建-一个内置的
         * 默认大小的缓冲区数组，通过缓冲区读写，减少系统I0次数, .
         * 从而提高读写的效率。
         * 字节缓冲流构造方法
         * public BufferedInputStream( InputStream in)
         * 创建一个新的缓冲输入流。
         * public BufferedOutputStream(OutputStream out) :
         * 创建一“个新的缓冲输出流。
         */

        File f = new File("folder\\io\\BU\\");
        f.mkdirs();
        File f1 = new File(f, "a.txt");
        f1.createNewFile();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
        File f2 = new File(f, "b.txt");
        f2.createNewFile();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2));
        addArrays();// 缓冲流使用数组复制时间:16 亳秒
        fileStream();//普通流复制时间:48110 亳秒
        bufferedStream();//缓冲流复制时间:46毫秒
    }
//      效率测试，缓冲流读写方法与基本的流是一.致的，
//      但是效率更高，以下测试它的效率。
    private static void addArrays() {
        //记录开始时间
        long start = System.currentTimeMillis();
        //创建流对象
        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(
                             "folder\\file\\background1.bmp"));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(
                             "folder\\file\\background1_Copy.bmp"));) {
            //读写数据
            int len;
            byte[] bytes = new byte[10 * 1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:" + (end-start) + " 亳秒");//缓冲流使用数组复制时间:13亳秒
    }

    private static void bufferedStream() {
        //记录开始时间
        long start = System.currentTimeMillis();
        //创建流对象
        try (
                BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("folder\\file\\background1.bmp"));
                BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("folder\\file\\background1_Copy.bmp"));) {
            //读写数据
            int b;
            while ((b = bis2.read()) != -1) {
                bos2.write(b);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:" + (end - start) + "毫秒");//缓冲流复制时间:185毫秒
    }


    private static void fileStream() {
//                    记录开始时间
        long start = System.currentTimeMillis();
        //创建流对象
        try (
                FileInputStream fis = new FileInputStream("folder\\file\\background1.bmp");
                FileOutputStream fos = new FileOutputStream("folder\\file\\background1_Copy2.bmp")) {
            //读写数据
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

        } catch (IOException e) {
            e.getStackTrace();
        }
        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:" + (end - start) + " 亳秒");//普通流复制时间:78460亳秒
    }
}


