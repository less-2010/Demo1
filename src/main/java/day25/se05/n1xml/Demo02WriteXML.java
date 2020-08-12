//package day25.se05.n1xml;
//
//import jdk.internal.util.xml.XMLStreamException;
//import jdk.internal.util.xml.impl.XMLWriter;
//import org.dom4j.Document;
//import org.dom4j.DocumentHelper;
//import org.dom4j.Element;
//import org.dom4j.io.OutputFormat;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Demo02WriteXML {
//    public static void main(String[] args) throws IOException, XMLStreamException {
//        List<Emp> list = new ArrayList<Emp>();
//        list.add(new Emp(1, "张三", 22, "男", 5000));
//        list.add(new Emp(2, "李四", 22, "女", 6000));
//        list.add(new Emp(3, "王五", 22, "男", 7000));
//        list.add(new Emp(4, "赵六", 22, "女", 8000));
//        list.add(new Emp(5, "钱七", 22, "男", 9000));
////        1、创建一个Document对象表示空白文档
//        Document doc = new DocumentHelper.createDocument();
////        生成一个XML文档的大致步骤:
////        1、创建一个Document对象表示空白文档
////        2、向Document对 象中添加根元素
////        3、按照预定生成的XML文档的结构依次从根元素开始逐级添加子元素。
////        4、创建XmlWriter
////        5、通过XmlWriter将 给定的Document对象写出以形成XML文档
////        2、Document提供了添加根元素的方法:
////        Element addElement(String name); 该方法只能调用一- 次
//        Element root = doc.addElement("list");
////        将每个员工信息以<emp>标签形式添加到根标签中。
////        Element提供了向标签添加信息的相关方法:
////        Element addElement(String name);
////        向当前标签中添加指定名字的子标签，该方法可多次调用。
////        Element addText(String text);
////        向当前标签中添加文本信息，返回的还是当前标签。
////        Element addAttribute(String name , String value);
////        向当前标签中追加指定名字及对应值得属性。
//        for (Emp emp : list) {
////            向根标签中添加<emp>标签
//            Element empEle = root.addElement("emp");
////            添加<name>
//            Element nameEle = empEle.addElement("name");
//            nameEle.addText(emp.getName());
//            empEle.addElement(" gender").addText(emp.getGender());//添加子标签//添加文本
//            empEle.addElement(" salary").addText(emp.getSalary() + "");//拼接字符串变成字符串
//            empEle.addAttribute("id", emp.getId() + "");
//        }
//        XMLWriter writer = new XMLWriter(new FileOutputStream("Folder\\xml\\emplist3.xml"), OutputFormat.createPrettyPrint());
//        writer.write(doc);
//        System.out.println("写出完毕");
//
//    }
//}
package day25.se05.n1xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import day25.se05.n1xml.Emp;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Demo02WriteXML {

    public static void main(String[] args) throws IOException {

        List<Emp> list = new ArrayList<Emp>() {};

        list.add(new Emp(1,"张三",22,"男",5000));
        list.add(new Emp(2,"李四",24,"女",6000));
        list.add(new Emp(3,"王五",25,"男",7000));
        list.add(new Emp(4,"牛六",24,"女",8000));
        list.add(new Emp(5,"黄七",27,"男",9000));

//		1、创建一个Doucument对象表示空白文档
        Document doc = DocumentHelper.createDocument();

        /**
         * 生成一个XML文档的大致步骤：
         * 1、创建一个Document对象表示空白文档
         * 2、向Document对象中添加根元素
         * 3、按照预定生成的XML文档的结构一次从根元素开始逐级添加子元素
         * 4、创建XmlWriter
         * 5、通过XmlWriter将给定的Document对象写出以形成XML文档
         */

//		2、Document提供了添加根元素的方法：
//		Element addElement(String name);该方法只能调用一次
        Element root = doc.addElement("list");

        /**
         * 将每个员工信息以<emp>标签形式添加到根标签中
         *
         * Element提供了向根标签添加信息的相关方法：
         * Element addElement(String name);
         * 向当前标签中添加指定名字的子标签，该方法可多次调用
         *
         * Element addText(String text);
         * 向当前标签中添加文本信息，返回的还是当前标签
         *
         * Element addAttribute(String name,String value);
         * 向当前标签中追加指定名字及对应值的属性
         */

        for (Emp emp : list) {
//			向跟标签中添加<emp>标签
            Element empEle = root.addElement("emp");

//			添加<name>
            Element nameEle = empEle.addElement("name");
            nameEle.addText(emp.getName());

            empEle.addElement("gender").addText(emp.getGender());
            empEle.addElement("salary").addText(emp.getSalary() + "");
            empEle.addAttribute("id", emp.getId() + "");
        }

        XMLWriter writer = new XMLWriter(new FileOutputStream("folder\\xml\\emplist3.xml"),OutputFormat.createPrettyPrint());

        writer.write(doc);

        System.out.println("写出完毕！");

        writer.close();

    }

}
