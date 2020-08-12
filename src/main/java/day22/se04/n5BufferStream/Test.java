package day22.se04.n5BufferStream;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        //文件输入路径
        File f = new File("folder\\file\\水调歌头苏东坡.txt");
        //输出文件路径
        File f2 = new File("folder\\file\\水调歌头苏东坡_Copy.txt");
        //加载文本信息
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(f));
            //处理中文乱码
            BufferedReader bos = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            //集合装载
            String str = null;
            List<String> list = new ArrayList<>();
            while ((str = bos.readLine()) != null) {
                list.add(str);
            }
            bos.close();
            is.close();
            //对数据进行简单排序
            Collections.sort(list);
            //创建字符输出流对象
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
            //遍历数组写出文本
            for (String s : list
            ) {
                System.out.println(s);
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
