package day22.se04.n4properties;

import java.io.*;
import java.util.Properties;

public class Demo03Store {
    public static void main(String[] args) throws IOException {
        Properties p1 = new Properties();
//先写一个匿名FileReader用来加载配置文件a. properties
        p1.load(new FileReader(new File(
                "folder\\io\\properties\\a.properties")));
//给a. properties中添加新的内容name3=Jack
        p1.setProperty("name3", "Jack");
//设置FileWriter时若给第二个参数true,
//        会在原有内容的基础上重写原内容和新内容。
        FileWriter fw = new FileWriter(new File(
                "folder\\io\\properties\\a.properties"));
//这里的第二个参数是用来写注释的。在Proterties中的注释是"#"
        p1.store(fw, "NamesList:");
//        a. properties中以前只有:
//            age=18
//            tel=15789451232
//            name=xiaoping
///        运行后的结果:
//            #NamesList:
//            #Wed Jul 08 16:04:42 CST 2020
//            age=18
//            tel=15789451232
//            name=xiaoping
//            name3=Jack
//        #：注释的内容。
//        还有properties的后缀不只是.properties,像本文的.txt文本后缀的文件同样可用
//

    }
}
