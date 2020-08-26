package day05;

public class Person {
    String name;
    int age;
    int price;

    public Person() {
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }
}
