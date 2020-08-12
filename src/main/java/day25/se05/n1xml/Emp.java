package day25.se05.n1xml;

import org.dom4j.Element;

public class Emp {
    int id;

    public Element getAge() {
        return age;
    }

    public void setAge(Element age) {
        this.age = age;
    }

    Element age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    int salary;
    String name, gender;
    public Emp(int id, String name, int age, String gender, int salary) {

    }
}
