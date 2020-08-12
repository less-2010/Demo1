package day23.se04.n7ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         objectInputStream类
         objectInputStream反序列化流，将之前使用object0utputStream
         序列化的原始数据恢复为对象。.
         构造方法，
         public objectInputStream( InputStream in) :
         创建-一个指定InputStream的ObjectInputStream。
         反序列化操作
         如果能找到一个对象的class文件，我们可以进行反序列化操作，
         调用objectInputStream读取对象的方法:
         public final object readObject () :读取一个对象。
         */
//1.创建objectInputStream对象,构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("folder\\io\\object\\person.obj"));
//2.使用0bjectInputStream对象中的方法readobject
//读取保存对象的文件
        Object o = ois.readObject();
//3.释放资源
        ois.close();
//4.使用读取出来的对象(打印)
        System.out.println("0:" + o);

    }
}
