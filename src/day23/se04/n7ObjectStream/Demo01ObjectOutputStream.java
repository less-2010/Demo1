package day23.se04.n7ObjectStream;

import java.io.*;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {

   /**
    * 概述
    * Java 提供了一种对象序列化的机制。用一个字节序列可以表示-个
    *对象，该字节序列包含该对象的数据、对象的类型和对象中
    *存储的属性等信息。字节序列写出到文件之后，相当于文件中
    *持久保存了一个对象的信息。反之，该字节序列还可以从文件中
    *读取回来，重构对象，对它进行反序列化。对象的数据、
    *对象的类型和对象中存储的数据信息，都可以用来在内存中.
    *创建对象。
    *操作序列化的流叫做对象流，又叫序列化流。
    * objectOutputStream类
    * java. io.ObjectOutputStream 类，将Java对象的原始数据类型
    *写出到文件，实现对象的持久存储。
    * 构造方法
    * public objectOutputStream(OutputStream out) :
    * 创建一个指定OutputStream的ObjectOutputStream.
    * 构造举例，代码如下:
    */
        FileOutputStream fos =
                new FileOutputStream("folder\\io\\object\\person.obj");
        ObjectOutputStream oos =
                new ObjectOutputStream(fos);
    /**
     * 序列化操作
     * 一个对象要想序列化，该对象所属类必须实现
     * java. io.Serializable 接口，Serializable 是-个标记接口，
     * 不实现此接口的类将不会使任何状态序列化或反序列化，
     * 会抛出NotSerializableException
    */
//使用objectOutputStream对象中的方法write object,
//把对象写入到文件中
        oos . writeObject(new Person(" 小明" ,18));
//3.释放资源
        oos .close();
    }


}

