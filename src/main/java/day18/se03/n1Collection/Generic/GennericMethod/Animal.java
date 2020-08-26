package day18.se03.n1Collection.Generic.GennericMethod;

/**
 * 动物类
 * @author BING
 * @date 2020/8/24 19:26
 */
public class Animal {

    String name;
    int age;

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
