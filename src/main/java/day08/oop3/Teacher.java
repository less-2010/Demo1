package day08.oop3;

/**
 * 子类 教师类
 * @author BING
 * @date 2020/8/19 15:38
 */
public class Teacher extends Person {
    double wage;//工资

    public Teacher() {
        System.out.println("教师构造方法");
    }

    public Teacher(String name, int age, char sex, int weight, double wage) {
        super(name, age, sex, weight);
        this.wage = wage;
    }

    /**
     *
     * @return
     */
    public  String  teach(){
     return "老师 ，教书";
    }

    @Override
    public String study() {
        return "我是老师+我在：" +super.study();
    }
}
