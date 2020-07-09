package day21.se04.n2ByteStream;

import java.io.*;

public class Demo04Copy {
    public static void main(String[] args) throws IOException {
        File f = new File("folder\\FirstFloor\\SecondFloor\\background2.bmp");
        File f2 = new File("folder\\FirstFloor\\SecondFloor\\background2_Copy.bmp");
        File f3 = new File("folder\\FirstFloor\\SecondFloor\\background2_Copy2.bmp");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f2);
        FileOutputStream fos2 = new FileOutputStream(f3);
//        Copy_1(fis, fos);

        Copy2(fis, fos);

        fis.close();
        fos.close();
        fos2.close();

    }

    /**
     * 复制
     * 使用数组，复制效率高
     * @param fis
     * @param fos
     * @throws IOException
     */

    public static void Copy2(FileInputStream fis, OutputStream fos) throws IOException {
        byte []by = new byte[1024*8];

        int read;
        long s = System.currentTimeMillis();
        while ((read=fis.read(by))!=-1){
            fos.write(by,0,read);
        }
        long o = System.currentTimeMillis();
        System.out.println("耗时(毫秒)："+(o-s));
    }

    /**
     * 复制
     * 复制效率低，耗时久
     * @param fis
     * @param fos
     * @throws IOException
     */
    public static void Copy_1(FileInputStream fis, OutputStream fos) throws IOException {
        int read;
        long s = System.currentTimeMillis();
        while ((read=fis.read())!=-1){
            fos.write(read);
        }
        long o = System.currentTimeMillis();
        System.out.println("耗时(毫秒)："+(o-s));
    }
}
