package day23.se04.n7ObjectStream;

import java.io.Serializable;

public class Person implements Serializable {

   private static final long serialVersionUID = 1L;
    /**
     * 序列化和反序列化的时候,可能会抛出NotSerializableException
     * 没有序列化异常
     * 类通过实现java. io. Serializable接口以启用其序列化功能。
     * 未实现此接口的类将无法使其任何状态序列化或反序列化。
     * Serializable接口也叫标记型接口
     * 要进行序列化和反序列化的类必须实现Serializable接口,
     * 就会给类添加一个标记
     * 当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记
     * 有:就可以序列化和反序列化
     * 没有:就会抛出NotSerializableException异常
     * @param name
     * @param age
     */

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private String name;
    private int age;

    public Person() {
    }

}
