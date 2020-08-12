package day23.se04.n7ObjectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * 练习:序列化集合
 * 一、需求:
 * 将3个以上的Person对象存储在ArrayList集合中，
 * 序列化后存储到硬盘文件，然后读取到JVM中输出每个对象。
 * 二、知识点描述:
 * 当我们想在文件中保存多个对象的时候
 * 可以把多个对象存储到一个集合中
 * 对集合进序列化和反序列化
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("folder\\io\\object\\person.obj"));
        //创建数组加入数据
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Person("小明", 18, "男", 2000));
        arrayList.add(new Person("小白", 19, "女", 1000));
        arrayList.add(new Person("小花", 22, "男", 5000));
        arrayList.add(new Person("小海", 20, "男", 1220));
//        System.out.println(arrayList);
        //集合序列化 写到硬盘
        oos.writeObject(arrayList);
        //刷新 关闭流
        oos.flush();
        oos.close();
        //反序列化 字节重构为对象
        //读取到内存
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("folder\\io\\object\\person.obj"));
        //写入到数组
        ArrayList arrayList1 = (ArrayList) ois.readObject();//强转为集合类型
        //遍历输出
        for (Object s : arrayList1) {
            System.out.println(s);
        }
        System.out.println(arrayList1);
        //关闭流
        ois.close();

    }
}
