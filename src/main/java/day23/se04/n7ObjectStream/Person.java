package day23.se04.n7ObjectStream;

import java.io.Serializable;

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
 */
public class Person implements Serializable {
    /**
     * 序列化中使用关键字要注意：
     * transient 关键字表示该字段无法序列化
     * static 关键字会使数据异常
     */
    // Serializable  接口给需要序列化的类，提供了一个序列版本号 serialVersionUID
    // 该版本号的目的在于验证序列化的对象和对应类是否版本匹配。

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String sex;
    private transient int money;
    public Person() {
    }

    public Person(String name, int age, String sex, int money) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public String toString() {
        return "Person{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }



}
