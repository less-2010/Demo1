package day08.oop3;

import java.util.Objects;

/**
 * 学生类继承父类
 * @author BING
 * @date 2020/8/19 15:33
 *
 */
public class Student extends Person {
    private double money;


    public Student(){ }
    //super 调用父类的构造方法
    public Student(String name,int age,char sex,int weight,double money){
        super(name, age, sex, weight);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /**
     *
     * @return
     */
    public String PlayGame(){
        return "学生，打游戏";
    }

    /**
     *
     * @return
     */
    public String ShowInfo() {
        // super调用父类的属性和方法 可以省略super
        // this 本类对象的引用，通过this调用本类属性方法(在本类可以省略)
        return "我叫："
                 + super.getName() + '\'' +
                ", 年龄=" + super.getAge() +
                ", 性别=" + super.getSex() +
                ", 学费=" + this.money+
                ", 爱好1=" + super.study()+
                ", 爱好2=" + this.PlayGame();
    }

    @Override
    public boolean equals(Object o) {
        if (this==o)return true;
        if (o==null||getClass()!=o.getClass())return false;
        Student student = (Student) o;
        return student.getName().equals(((Student) o).getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }

    @Override
    public String study() {
        return "我是学生，我在："+super.study();
    }
}
