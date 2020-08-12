package day15.se01.n1object;

import java.util.Objects;

public class Person {
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null)return false;
        if (obj==this)return true;
        if (obj.getClass()==this.getClass()){//防止父子类干扰
//        if (obj instanceof Person){//耗资源
            Person p = (Person) obj;//强转
            return  this.age==p.age&&this.name==p.name;
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    public Person(){
        super();
    }

    private Integer age;

}
