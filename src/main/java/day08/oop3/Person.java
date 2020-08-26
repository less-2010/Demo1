package day08.oop3;

/**
 * 父类 人类
 * @author BING
 * @date 2020/8/20
 */
public class Person {
    private String name;
    private int age;
    private char sex;
    private int weight;
    public Person(){
    }
    public  Person(String name,int age,char sex,int weight){
        this.name= name;
        this.age= age;
        this.sex = sex;
        this.weight= weight;
    }
    /**
     *
     * @return String
     */
    public String study(){
       return  "学习";
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
