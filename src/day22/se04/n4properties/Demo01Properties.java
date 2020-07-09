package day22.se04.n4properties;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        /**
         * 概述
         * java. util. Properties继承于Hashtable，来表示一个
         * 持久的属性集。它使用键值结构存储数据，每个键及其对应值都是
         * 一一个字符串。该类也被许多Java类使用，比如获取系统属性时，
         * System. getProperties方法就是返回一个Properties对象。
         * Properties类构造方法
         * public Properties() :创建-个空的属性列表。
         * 基本的存储方法
         * public object setProperty(String key, String value) :
         * 保存一对属性。
         * public String getProperty(String key) :
         * 使用此属性列表中指定的键搜索属性值。
         * public Set<String> stringPropertyNames ( ) :
         * 所有键的名称的集合。
         */

        //创建properties对象
        Properties pro = new Properties();
        //加入数据
        pro.setProperty("filename","a.txt");
        pro.setProperty("length","202023031");
        pro.setProperty("location","D:\\a.txt");
        //输出数据
        System.out.println(pro);
        //通过键获取属性值
        System.out.println(pro.getProperty("filename"));
        System.out.println(pro.getProperty("length"));
        System.out.println(pro.getProperty("location"));
        //遍历属性集，获取所有键的集合
        Set<String> keys = pro.stringPropertyNames();
        for (String key:keys
             ) {
            System.out.println(key+"--"+pro.getProperty(key));

        }
    }
}
