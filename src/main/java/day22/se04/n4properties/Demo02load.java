package day22.se04.n4properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo02load {
    public static void main(String[] args) throws IOException {
        /**
         * 与流相关的方法
         * public void load(InputStream inStream) :
         * 从字节输入流中读取键值对。参数中使用了字节输入流，
         * 通过流对象，可以关联到某文件上，这样就能够加载文本中的数据了。
         *
         */

        //创建集合对象
        Properties pro = new Properties();
        File f = new File("folder\\io\\properties");
        f.mkdirs();
        File f1 = new File(f, "a.properties");
        f1.createNewFile();
        //加载文本信息到集合属
//      pro.load(new FileInputStream(f1));//中文乱码
        InputStream is = new BufferedInputStream(new FileInputStream(f1));
        //解决读取properties文件中产生中文乱码的问题
        BufferedReader bf = new BufferedReader(new InputStreamReader(is, "GBK"));
        pro.load(bf);
        //遍历集合并打印

        Set<String> keys = pro.stringPropertyNames();
        for (String key : keys
        ) {
            System.out.println(key + "--" + pro.getProperty(key));
        }
//        文本中的数据必须是键值对形式，可以使用空格、等号、冒号等符号分隔

    }

}
