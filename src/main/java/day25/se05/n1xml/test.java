package day25.se05.n1xml;

import java.io.*;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException {
        //写入到Properties集合
        Properties pro = new Properties();
        pro.loadFromXML(new FileInputStream("folder\\xml\\emplist.xml"));
        System.out.println(pro);
        pro.put("sex","男");
        pro.storeToXML(new FileOutputStream("folder\\xml\\emplist2.xml"),"写出");
    }
}
