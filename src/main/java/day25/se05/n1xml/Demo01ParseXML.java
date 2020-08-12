package day25.se05.n1xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Demo01ParseXML {
    public static void main(String[] args) throws IOException {
        /**
         * XML解析:
         * SAX解析:逐行解析。缺点:不能增删操作。优点:快。应用:移动端。
         * DOM解析:整体文档解析。缺点:慢。优点:可以增删操作。应用: PC端
         * DOM4J解析XML文档的大致步骤:
         * 1、创建SAXReader(注意: 不要因为这个单词中有SAX就认为DOM4J是SAX解析，
         * DOM4J是DOM解析，有这个名字的类而已)。
         * 2、使用SAXReader读取xm1文档并生成Document对象。这- - 步也是DOM解析
         * 耗时耗资源的体现，因为要将XML文档全部读取完毕，并存入到Document
         * 对象中。
         * 3、通过Document获取根元素
         * 4、按照文档的层级结构从根元素开始逐级获取子元素，已达到遍历XML文档
         * 数据的目的。
         */
        List<day25.se05.n1xml.Emp> list = new ArrayList<day25.se05.n1xml.Emp>();
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(new File("folder\\xml\\empList.xml"));


        /**
         * Element的每一个实 例用于表示xm1文档中的-一对标签，
         * 其提供了很多获取其表示的标签信息的方法:
         * String getName(); 获取当前标签的名字
         * String getText(); 获取当前标签中间的文本。
         * String elementText(String name);
         * 获取当前标签中指定名字的子标签中间的文本
         * Element element(String); 获取当前标签中指定名字的子标签
         * List elements( ) ;
         * List elements(String name);获取当前的标签中指定的同名子标签
         */
//    根标签标签root:<list>...</list>
        Element root = doc.getRootElement();
//        获取<list>标签中的所有<emp>标签
        List<Element>empList=root. elements();
//            遍历empList集合，将每个<emp>标签中的员工信息解析出来，
//            并以Emp实例的形式存入list集合
            for (Element empEle : empList) {
                System. out. println(empEle.getName());
//                获取名字
                Element nameEle=empEle.element("name") ;
                String name=nameEle.getText();
                System.out.println(name);
//                获取年龄
                Element agFilee=empEle.element("age");
                int age = Integer.parseInt(agFilee.getText());
//                获取性别
                String gender = empEle.elementText("gender");
//                获取工资
                int salary = Integer.parseInt(empEle.elementText("salary"));
//                获取id
                int id = Integer.parseInt(empEle.attributeValue("id"));
                day25.se05.n1xml.Emp emp = new day25.se05.n1xml.Emp(id,name,age,gender,salary);
            }
            for (day25.se05.n1xml.Emp e:list
                 ) {
                System.out.println(e);
                
            }
            System.out.println("解析完毕！");


        } catch (DocumentException e) {
            e.getStackTrace();
        }

    }
}
