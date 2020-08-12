package day18.se03.n1Collection;

import java.util.Objects;

public class Student06 {
    public Student06(String name, int age) {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student06 student06 = (Student06) o;
        return age == student06.age &&
                name.equals(student06.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student06{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    String name ;
    int age;
}
